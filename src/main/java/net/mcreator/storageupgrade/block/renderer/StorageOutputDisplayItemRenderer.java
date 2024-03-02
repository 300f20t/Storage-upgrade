package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.StorageOutputDisplayModel;
import net.mcreator.storageupgrade.block.display.StorageOutputDisplayItem;

public class StorageOutputDisplayItemRenderer extends GeoItemRenderer<StorageOutputDisplayItem> {
	public StorageOutputDisplayItemRenderer() {
		super(new StorageOutputDisplayModel());
	}

	@Override
	public RenderType getRenderType(StorageOutputDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
