package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.characters.UtsuhoEntity;
import com.touhou.yukkuri.entity.models.UtsuhoModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class UtsuhoRenderer extends GeoEntityRenderer<UtsuhoEntity> {
    public UtsuhoRenderer(EntityRendererFactory.Context context) {
        super(context, new UtsuhoModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(UtsuhoEntity entity) {
        return this.getTextureResource(entity);
    }
}
