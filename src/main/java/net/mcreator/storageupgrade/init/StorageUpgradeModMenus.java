
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.storageupgrade.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.storageupgrade.world.inventory.StorageOutputGUIMenu;
import net.mcreator.storageupgrade.world.inventory.StorageInputGUIMenu;
import net.mcreator.storageupgrade.world.inventory.DisplayGUIMenu;
import net.mcreator.storageupgrade.world.inventory.BasicStorageGUIMenu;
import net.mcreator.storageupgrade.StorageUpgradeMod;

public class StorageUpgradeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StorageUpgradeMod.MODID);
	public static final RegistryObject<MenuType<BasicStorageGUIMenu>> BASIC_STORAGE_GUI = REGISTRY.register("basic_storage_gui", () -> IForgeMenuType.create(BasicStorageGUIMenu::new));
	public static final RegistryObject<MenuType<StorageInputGUIMenu>> STORAGE_INPUT_GUI = REGISTRY.register("storage_input_gui", () -> IForgeMenuType.create(StorageInputGUIMenu::new));
	public static final RegistryObject<MenuType<StorageOutputGUIMenu>> STORAGE_OUTPUT_GUI = REGISTRY.register("storage_output_gui", () -> IForgeMenuType.create(StorageOutputGUIMenu::new));
	public static final RegistryObject<MenuType<DisplayGUIMenu>> DISPLAY_GUI = REGISTRY.register("display_gui", () -> IForgeMenuType.create(DisplayGUIMenu::new));
}
