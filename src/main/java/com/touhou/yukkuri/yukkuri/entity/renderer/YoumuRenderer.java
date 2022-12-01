package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.YoumuEntity;
import com.touhou.yukkuri.yukkuri.entity.models.YoumuModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YoumuRenderer extends GeoEntityRenderer<YoumuEntity> {
    public YoumuRenderer(EntityRendererFactory.Context context) {
        super(context, new YoumuModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(YoumuEntity entity) {
        return this.getTextureResource(entity);
    }
}
