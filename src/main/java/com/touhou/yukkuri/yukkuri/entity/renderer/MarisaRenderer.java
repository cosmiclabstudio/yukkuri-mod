package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.MarisaEntity;
import com.touhou.yukkuri.yukkuri.entity.models.MarisaModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MarisaRenderer extends GeoEntityRenderer<MarisaEntity> {
    public MarisaRenderer(EntityRendererFactory.Context context) {
        super(context, new MarisaModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(MarisaEntity entity) {
        return this.getTextureResource(entity);
    }
}
