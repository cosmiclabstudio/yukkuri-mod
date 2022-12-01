package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.characters.PatchouliEntity;
import com.touhou.yukkuri.entity.models.PatchouliModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PatchouliRenderer extends GeoEntityRenderer<PatchouliEntity> {
    public PatchouliRenderer(EntityRendererFactory.Context context) {
        super(context, new PatchouliModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(PatchouliEntity entity) {
        return this.getTextureResource(entity);
    }
}
