package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.BasicStorageBlockModel;
import net.mcreator.storageupgrade.block.entity.BasicStorageTileEntity;

public class BasicStorageTileRenderer extends GeoBlockRenderer<BasicStorageTileEntity> {
	public BasicStorageTileRenderer() {
		super(new BasicStorageBlockModel());
	}

	@Override
	public RenderType getRenderType(BasicStorageTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
