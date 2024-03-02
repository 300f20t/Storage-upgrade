package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.entity.StorageInputTileEntity;

public class StorageInputBlockModel extends GeoModel<StorageInputTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StorageInputTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "animations/storage_input_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StorageInputTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "geo/storage_input_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StorageInputTileEntity entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/storage_input_texture.png");
	}
}
