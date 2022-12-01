package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.models.YuyukoModel;
import com.touhou.yukkuri.entity.characters.YuyukoEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YuyukoRenderer extends GeoEntityRenderer<YuyukoEntity> {
    public YuyukoRenderer(EntityRendererFactory.Context context) {
        super(context, new YuyukoModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(YuyukoEntity entity) {
        return this.getTextureResource(entity);
    }
}
