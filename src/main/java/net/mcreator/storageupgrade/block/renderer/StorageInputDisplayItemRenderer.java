package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.StorageInputDisplayModel;
import net.mcreator.storageupgrade.block.display.StorageInputDisplayItem;

public class StorageInputDisplayItemRenderer extends GeoItemRenderer<StorageInputDisplayItem> {
	public StorageInputDisplayItemRenderer() {
		super(new StorageInputDisplayModel());
	}

	@Override
	public RenderType getRenderType(StorageInputDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
