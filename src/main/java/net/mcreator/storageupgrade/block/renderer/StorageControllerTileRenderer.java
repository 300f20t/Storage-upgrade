package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.StorageControllerBlockModel;
import net.mcreator.storageupgrade.block.entity.StorageControllerTileEntity;

public class StorageControllerTileRenderer extends GeoBlockRenderer<StorageControllerTileEntity> {
	public StorageControllerTileRenderer() {
		super(new StorageControllerBlockModel());
	}

	@Override
	public RenderType getRenderType(StorageControllerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
