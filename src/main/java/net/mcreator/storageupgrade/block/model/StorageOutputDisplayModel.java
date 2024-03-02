package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.display.StorageOutputDisplayItem;

public class StorageOutputDisplayModel extends GeoModel<StorageOutputDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StorageOutputDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "animations/storage_output_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StorageOutputDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "geo/storage_output_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StorageOutputDisplayItem entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/storage_output_texture.png");
	}
}
