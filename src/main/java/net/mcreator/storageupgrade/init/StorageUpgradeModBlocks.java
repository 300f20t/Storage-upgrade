
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.storageupgrade.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.storageupgrade.block.StorageOutputBlock;
import net.mcreator.storageupgrade.block.StorageInputBlock;
import net.mcreator.storageupgrade.block.StorageControllerBlock;
import net.mcreator.storageupgrade.block.DisplayBlock;
import net.mcreator.storageupgrade.block.BasicStorageBlock;
import net.mcreator.storageupgrade.StorageUpgradeMod;

public class StorageUpgradeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StorageUpgradeMod.MODID);
	public static final RegistryObject<Block> BASIC_STORAGE = REGISTRY.register("basic_storage", () -> new BasicStorageBlock());
	public static final RegistryObject<Block> STORAGE_CONTROLLER = REGISTRY.register("storage_controller", () -> new StorageControllerBlock());
	public static final RegistryObject<Block> STORAGE_INPUT = REGISTRY.register("storage_input", () -> new StorageInputBlock());
	public static final RegistryObject<Block> STORAGE_OUTPUT = REGISTRY.register("storage_output", () -> new StorageOutputBlock());
	public static final RegistryObject<Block> DISPLAY = REGISTRY.register("display", () -> new DisplayBlock());
}
