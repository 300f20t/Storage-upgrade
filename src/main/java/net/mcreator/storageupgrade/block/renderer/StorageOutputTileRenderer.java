package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.StorageOutputBlockModel;
import net.mcreator.storageupgrade.block.entity.StorageOutputTileEntity;

public class StorageOutputTileRenderer extends GeoBlockRenderer<StorageOutputTileEntity> {
	public StorageOutputTileRenderer() {
		super(new StorageOutputBlockModel());
	}

	@Override
	public RenderType getRenderType(StorageOutputTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
