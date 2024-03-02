package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.display.DisplayDisplayItem;

public class DisplayDisplayModel extends GeoModel<DisplayDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DisplayDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "animations/display.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DisplayDisplayItem animatable) {
		return new ResourceLocation("storage_upgrade", "geo/display.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DisplayDisplayItem entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/display_texture.png");
	}
}
