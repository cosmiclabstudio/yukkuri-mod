package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.YukariEntity;
import com.touhou.yukkuri.yukkuri.entity.models.YukariModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YukariRenderer extends GeoEntityRenderer<YukariEntity> {
    public YukariRenderer(EntityRendererFactory.Context context) {
        super(context, new YukariModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(YukariEntity entity) {
        return this.getTextureResource(entity);
    }
}
