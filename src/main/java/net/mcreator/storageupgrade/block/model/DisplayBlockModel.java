package net.mcreator.storageupgrade.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.storageupgrade.block.entity.DisplayTileEntity;

public class DisplayBlockModel extends GeoModel<DisplayTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DisplayTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "animations/display.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DisplayTileEntity animatable) {
		return new ResourceLocation("storage_upgrade", "geo/display.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DisplayTileEntity entity) {
		return new ResourceLocation("storage_upgrade", "textures/block/display_texture.png");
	}
}
