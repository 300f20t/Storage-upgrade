
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.storageupgrade.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.storageupgrade.StorageUpgradeMod;

public class StorageUpgradeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StorageUpgradeMod.MODID);
	public static final RegistryObject<CreativeModeTab> STORAGE_UPGRADE = REGISTRY.register("storage_upgrade",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.storage_upgrade.storage_upgrade")).icon(() -> new ItemStack(StorageUpgradeModItems.CELLS_DRIVER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StorageUpgradeModBlocks.BASIC_STORAGE.get().asItem());
				tabData.accept(StorageUpgradeModBlocks.STORAGE_CONTROLLER.get().asItem());
				tabData.accept(StorageUpgradeModBlocks.STORAGE_INPUT.get().asItem());
				tabData.accept(StorageUpgradeModBlocks.STORAGE_OUTPUT.get().asItem());
				tabData.accept(StorageUpgradeModBlocks.DISPLAY.get().asItem());
				tabData.accept(StorageUpgradeModItems.STORAGE_CELL.get());
				tabData.accept(StorageUpgradeModItems.DATA_CELL.get());
				tabData.accept(StorageUpgradeModItems.CELLS_DRIVER.get());
				tabData.accept(StorageUpgradeModItems.COMMAND_DRIVER.get());
				tabData.accept(StorageUpgradeModItems.FLUID_CELL.get());
			})

					.build());
}
