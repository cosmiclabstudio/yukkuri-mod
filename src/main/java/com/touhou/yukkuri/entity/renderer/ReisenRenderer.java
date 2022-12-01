package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.characters.ReisenEntity;
import com.touhou.yukkuri.entity.models.ReisenModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ReisenRenderer extends GeoEntityRenderer<ReisenEntity> {
    public ReisenRenderer(EntityRendererFactory.Context context) {
        super(context, new ReisenModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(ReisenEntity entity) {
        return this.getTextureResource(entity);
    }
}
