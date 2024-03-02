package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.DisplayDisplayModel;
import net.mcreator.storageupgrade.block.display.DisplayDisplayItem;

public class DisplayDisplayItemRenderer extends GeoItemRenderer<DisplayDisplayItem> {
	public DisplayDisplayItemRenderer() {
		super(new DisplayDisplayModel());
	}

	@Override
	public RenderType getRenderType(DisplayDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
