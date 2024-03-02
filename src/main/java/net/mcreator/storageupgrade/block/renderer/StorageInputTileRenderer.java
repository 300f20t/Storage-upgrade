package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.StorageInputBlockModel;
import net.mcreator.storageupgrade.block.entity.StorageInputTileEntity;

public class StorageInputTileRenderer extends GeoBlockRenderer<StorageInputTileEntity> {
	public StorageInputTileRenderer() {
		super(new StorageInputBlockModel());
	}

	@Override
	public RenderType getRenderType(StorageInputTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
