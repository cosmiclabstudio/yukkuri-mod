package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.characters.FlandreEntity;
import com.touhou.yukkuri.entity.models.FlandreModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FlandreRenderer extends GeoEntityRenderer<FlandreEntity> {
    public FlandreRenderer(EntityRendererFactory.Context context) {
        super(context, new FlandreModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(FlandreEntity entity) {
        return this.getTextureResource(entity);
    }
}
