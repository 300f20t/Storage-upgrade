package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.DisplayBlockModel;
import net.mcreator.storageupgrade.block.entity.DisplayTileEntity;

public class DisplayTileRenderer extends GeoBlockRenderer<DisplayTileEntity> {
	public DisplayTileRenderer() {
		super(new DisplayBlockModel());
	}

	@Override
	public RenderType getRenderType(DisplayTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
