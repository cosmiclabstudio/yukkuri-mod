package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.NitoriEntity;
import com.touhou.yukkuri.yukkuri.entity.models.NitoriModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class NitoriRenderer extends GeoEntityRenderer<NitoriEntity> {
    public NitoriRenderer(EntityRendererFactory.Context context) {
        super(context, new NitoriModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(NitoriEntity entity) {
        return this.getTextureResource(entity);
    }
}
