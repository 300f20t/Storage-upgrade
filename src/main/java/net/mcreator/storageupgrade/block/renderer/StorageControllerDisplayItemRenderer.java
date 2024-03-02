package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.StorageControllerDisplayModel;
import net.mcreator.storageupgrade.block.display.StorageControllerDisplayItem;

public class StorageControllerDisplayItemRenderer extends GeoItemRenderer<StorageControllerDisplayItem> {
	public StorageControllerDisplayItemRenderer() {
		super(new StorageControllerDisplayModel());
	}

	@Override
	public RenderType getRenderType(StorageControllerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
