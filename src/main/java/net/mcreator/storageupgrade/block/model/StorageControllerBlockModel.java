package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.entity.StorageControllerTileEntity;

public class StorageControllerBlockModel extends GeoModel<StorageControllerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StorageControllerTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "animations/storage_controller_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StorageControllerTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "geo/storage_controller_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StorageControllerTileEntity entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/storage_controller_texture.png");
	}
}
