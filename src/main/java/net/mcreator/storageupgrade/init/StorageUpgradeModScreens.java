
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.storageupgrade.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.storageupgrade.client.gui.StorageOutputGUIScreen;
import net.mcreator.storageupgrade.client.gui.StorageInputGUIScreen;
import net.mcreator.storageupgrade.client.gui.DisplayGUIScreen;
import net.mcreator.storageupgrade.client.gui.BasicStorageGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StorageUpgradeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StorageUpgradeModMenus.BASIC_STORAGE_GUI.get(), BasicStorageGUIScreen::new);
			MenuScreens.register(StorageUpgradeModMenus.STORAGE_INPUT_GUI.get(), StorageInputGUIScreen::new);
			MenuScreens.register(StorageUpgradeModMenus.STORAGE_OUTPUT_GUI.get(), StorageOutputGUIScreen::new);
			MenuScreens.register(StorageUpgradeModMenus.DISPLAY_GUI.get(), DisplayGUIScreen::new);
		});
	}
}
