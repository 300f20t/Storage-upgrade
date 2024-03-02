
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.storageupgrade.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.storageupgrade.block.entity.StorageOutputTileEntity;
import net.mcreator.storageupgrade.block.entity.StorageInputTileEntity;
import net.mcreator.storageupgrade.block.entity.StorageControllerTileEntity;
import net.mcreator.storageupgrade.block.entity.DisplayTileEntity;
import net.mcreator.storageupgrade.block.entity.BasicStorageTileEntity;
import net.mcreator.storageupgrade.StorageUpgradeMod;

public class StorageUpgradeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StorageUpgradeMod.MODID);
	public static final RegistryObject<BlockEntityType<BasicStorageTileEntity>> BASIC_STORAGE = REGISTRY.register("basic_storage",
			() -> BlockEntityType.Builder.of(BasicStorageTileEntity::new, StorageUpgradeModBlocks.BASIC_STORAGE.get()).build(null));
	public static final RegistryObject<BlockEntityType<StorageControllerTileEntity>> STORAGE_CONTROLLER = REGISTRY.register("storage_controller",
			() -> BlockEntityType.Builder.of(StorageControllerTileEntity::new, StorageUpgradeModBlocks.STORAGE_CONTROLLER.get()).build(null));
	public static final RegistryObject<BlockEntityType<StorageInputTileEntity>> STORAGE_INPUT = REGISTRY.register("storage_input",
			() -> BlockEntityType.Builder.of(StorageInputTileEntity::new, StorageUpgradeModBlocks.STORAGE_INPUT.get()).build(null));
	public static final RegistryObject<BlockEntityType<StorageOutputTileEntity>> STORAGE_OUTPUT = REGISTRY.register("storage_output",
			() -> BlockEntityType.Builder.of(StorageOutputTileEntity::new, StorageUpgradeModBlocks.STORAGE_OUTPUT.get()).build(null));
	public static final RegistryObject<BlockEntityType<DisplayTileEntity>> DISPLAY = REGISTRY.register("display", () -> BlockEntityType.Builder.of(DisplayTileEntity::new, StorageUpgradeModBlocks.DISPLAY.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
