package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.SanaeEntity;
import com.touhou.yukkuri.yukkuri.entity.models.SanaeModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SanaeRenderer extends GeoEntityRenderer<SanaeEntity> {
    public SanaeRenderer(EntityRendererFactory.Context context) {
        super(context, new SanaeModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(SanaeEntity entity) {
        return this.getTextureResource(entity);
    }
}
