package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.display.StorageInputDisplayItem;

public class StorageInputDisplayModel extends GeoModel<StorageInputDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StorageInputDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "animations/storage_input_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StorageInputDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "geo/storage_input_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StorageInputDisplayItem entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/storage_input_texture.png");
	}
}
