package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.RemiliaEntity;
import com.touhou.yukkuri.yukkuri.entity.models.RemiliaModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RemiliaRenderer extends GeoEntityRenderer<RemiliaEntity> {
    public RemiliaRenderer(EntityRendererFactory.Context context) {
        super(context, new RemiliaModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(RemiliaEntity entity) {
        return this.getTextureResource(entity);
    }
}
