package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.TenshiEntity;
import com.touhou.yukkuri.yukkuri.entity.models.TenshiModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TenshiRenderer extends GeoEntityRenderer<TenshiEntity> {
    public TenshiRenderer(EntityRendererFactory.Context context) {
        super(context, new TenshiModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(TenshiEntity entity) {
        return this.getTextureResource(entity);
    }
}
