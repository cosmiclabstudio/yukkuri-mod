package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.models.CirnoModel;
import com.touhou.yukkuri.entity.characters.CirnoEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CirnoRenderer extends GeoEntityRenderer<CirnoEntity> {
    public CirnoRenderer(EntityRendererFactory.Context context) {
        super(context, new CirnoModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(CirnoEntity entity) {
        return this.getTextureResource(entity);
    }
}
