package net.mcreator.storageupgrade.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.storageupgrade.init.StorageUpgradeModBlockEntities;
import net.mcreator.storageupgrade.block.renderer.StorageOutputTileRenderer;
import net.mcreator.storageupgrade.block.renderer.StorageInputTileRenderer;
import net.mcreator.storageupgrade.block.renderer.StorageControllerTileRenderer;
import net.mcreator.storageupgrade.block.renderer.DisplayTileRenderer;
import net.mcreator.storageupgrade.block.renderer.BasicStorageTileRenderer;
import net.mcreator.storageupgrade.StorageUpgradeMod;

@Mod.EventBusSubscriber(modid = StorageUpgradeMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(StorageUpgradeModBlockEntities.BASIC_STORAGE.get(), context -> new BasicStorageTileRenderer());
		event.registerBlockEntityRenderer(StorageUpgradeModBlockEntities.STORAGE_CONTROLLER.get(), context -> new StorageControllerTileRenderer());
		event.registerBlockEntityRenderer(StorageUpgradeModBlockEntities.STORAGE_INPUT.get(), context -> new StorageInputTileRenderer());
		event.registerBlockEntityRenderer(StorageUpgradeModBlockEntities.STORAGE_OUTPUT.get(), context -> new StorageOutputTileRenderer());
		event.registerBlockEntityRenderer(StorageUpgradeModBlockEntities.DISPLAY.get(), context -> new DisplayTileRenderer());
	}
}
