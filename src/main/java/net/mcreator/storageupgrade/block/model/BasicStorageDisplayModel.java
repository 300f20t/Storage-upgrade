package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.display.BasicStorageDisplayItem;

public class BasicStorageDisplayModel extends GeoModel<BasicStorageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BasicStorageDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "animations/model_basic_storage.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BasicStorageDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "geo/model_basic_storage.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BasicStorageDisplayItem entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/texture_basic_storage.png");
	}
}
