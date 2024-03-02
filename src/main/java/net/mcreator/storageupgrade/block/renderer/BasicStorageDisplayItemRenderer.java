package net.mcreator.storageupgrade.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.storageupgrade.block.model.BasicStorageDisplayModel;
import net.mcreator.storageupgrade.block.display.BasicStorageDisplayItem;

public class BasicStorageDisplayItemRenderer extends GeoItemRenderer<BasicStorageDisplayItem> {
	public BasicStorageDisplayItemRenderer() {
		super(new BasicStorageDisplayModel());
	}

	@Override
	public RenderType getRenderType(BasicStorageDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
