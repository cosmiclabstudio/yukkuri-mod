package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.models.BlueReimuModel;
import com.touhou.yukkuri.entity.characters.BlueReimuEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlueReimuRenderer extends GeoEntityRenderer<BlueReimuEntity> {
    public BlueReimuRenderer(EntityRendererFactory.Context context) {
        super(context, new BlueReimuModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(BlueReimuEntity entity) {
        return this.getTextureResource(entity);
    }
}
