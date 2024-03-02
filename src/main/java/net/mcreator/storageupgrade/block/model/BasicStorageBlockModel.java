package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.entity.BasicStorageTileEntity;

public class BasicStorageBlockModel extends GeoModel<BasicStorageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BasicStorageTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "animations/model_basic_storage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BasicStorageTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "geo/model_basic_storage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BasicStorageTileEntity entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/texture_basic_storage.png");
	}
}
