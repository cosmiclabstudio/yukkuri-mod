package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.models.ChenModel;
import com.touhou.yukkuri.entity.characters.ChenEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChenRenderer extends GeoEntityRenderer<ChenEntity> {
    public ChenRenderer(EntityRendererFactory.Context context) {
        super(context, new ChenModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(ChenEntity entity) {
        return this.getTextureResource(entity);
    }
}
