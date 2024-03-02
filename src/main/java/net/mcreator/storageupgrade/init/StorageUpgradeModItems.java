
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.storageupgrade.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.storageupgrade.item.StorageCellItem;
import net.mcreator.storageupgrade.item.FluidCellItem;
import net.mcreator.storageupgrade.item.DataCellItem;
import net.mcreator.storageupgrade.item.CommandDriverItem;
import net.mcreator.storageupgrade.item.CellsDriverItem;
import net.mcreator.storageupgrade.block.display.StorageOutputDisplayItem;
import net.mcreator.storageupgrade.block.display.StorageInputDisplayItem;
import net.mcreator.storageupgrade.block.display.StorageControllerDisplayItem;
import net.mcreator.storageupgrade.block.display.DisplayDisplayItem;
import net.mcreator.storageupgrade.block.display.BasicStorageDisplayItem;
import net.mcreator.storageupgrade.StorageUpgradeMod;

public class StorageUpgradeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StorageUpgradeMod.MODID);
	public static final RegistryObject<Item> BASIC_STORAGE = REGISTRY.register(StorageUpgradeModBlocks.BASIC_STORAGE.getId().getPath(), () -> new BasicStorageDisplayItem(StorageUpgradeModBlocks.BASIC_STORAGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> STORAGE_CONTROLLER = REGISTRY.register(StorageUpgradeModBlocks.STORAGE_CONTROLLER.getId().getPath(),
			() -> new StorageControllerDisplayItem(StorageUpgradeModBlocks.STORAGE_CONTROLLER.get(), new Item.Properties()));
	public static final RegistryObject<Item> STORAGE_INPUT = REGISTRY.register(StorageUpgradeModBlocks.STORAGE_INPUT.getId().getPath(), () -> new StorageInputDisplayItem(StorageUpgradeModBlocks.STORAGE_INPUT.get(), new Item.Properties()));
	public static final RegistryObject<Item> STORAGE_OUTPUT = REGISTRY.register(StorageUpgradeModBlocks.STORAGE_OUTPUT.getId().getPath(), () -> new StorageOutputDisplayItem(StorageUpgradeModBlocks.STORAGE_OUTPUT.get(), new Item.Properties()));
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register(StorageUpgradeModBlocks.DISPLAY.getId().getPath(), () -> new DisplayDisplayItem(StorageUpgradeModBlocks.DISPLAY.get(), new Item.Properties()));
	public static final RegistryObject<Item> STORAGE_CELL = REGISTRY.register("storage_cell", () -> new StorageCellItem());
	public static final RegistryObject<Item> DATA_CELL = REGISTRY.register("data_cell", () -> new DataCellItem());
	public static final RegistryObject<Item> CELLS_DRIVER = REGISTRY.register("cells_driver", () -> new CellsDriverItem());
	public static final RegistryObject<Item> COMMAND_DRIVER = REGISTRY.register("command_driver", () -> new CommandDriverItem());
	public static final RegistryObject<Item> FLUID_CELL = REGISTRY.register("fluid_cell", () -> new FluidCellItem());
}
