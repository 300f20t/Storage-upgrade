package net.mcreator.storageupgrade.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.storageupgrade.world.inventory.DisplayGUIMenu;
import net.mcreator.storageupgrade.procedures.CommandResultProcedure;
import net.mcreator.storageupgrade.network.DisplayGUIButtonMessage;
import net.mcreator.storageupgrade.StorageUpgradeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DisplayGUIScreen extends AbstractContainerScreen<DisplayGUIMenu> {
	private final static HashMap<String, Object> guistate = DisplayGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox commandPrompt;
	Button button_enter;

	public DisplayGUIScreen(DisplayGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		commandPrompt.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (commandPrompt.isFocused())
			return commandPrompt.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		commandPrompt.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.storage_upgrade.display_gui.label_execution_result"), 0, 7, -1, false);
		guiGraphics.drawString(this.font,

				CommandResultProcedure.execute(world, x, y, z), 0, 19, -205, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		commandPrompt = new EditBox(this.font, this.leftPos + 1, this.topPos + -20, 118, 18, Component.translatable("gui.storage_upgrade.display_gui.commandPrompt")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.storage_upgrade.display_gui.commandPrompt").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.storage_upgrade.display_gui.commandPrompt").getString());
				else
					setSuggestion(null);
			}
		};
		commandPrompt.setSuggestion(Component.translatable("gui.storage_upgrade.display_gui.commandPrompt").getString());
		commandPrompt.setMaxLength(32767);
		guistate.put("text:commandPrompt", commandPrompt);
		this.addWidget(this.commandPrompt);
		button_enter = Button.builder(Component.translatable("gui.storage_upgrade.display_gui.button_enter"), e -> {
			if (true) {
				StorageUpgradeMod.PACKET_HANDLER.sendToServer(new DisplayGUIButtonMessage(0, x, y, z));
				DisplayGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 126, this.topPos + -21, 51, 20).build();
		guistate.put("button:button_enter", button_enter);
		this.addRenderableWidget(button_enter);
	}
}
