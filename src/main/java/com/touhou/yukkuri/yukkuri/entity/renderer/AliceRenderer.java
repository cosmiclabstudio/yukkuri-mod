package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.AliceEntity;
import com.touhou.yukkuri.yukkuri.entity.models.AliceModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AliceRenderer extends GeoEntityRenderer<AliceEntity> {
    public AliceRenderer(EntityRendererFactory.Context context) {
        super(context, new AliceModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(AliceEntity entity) {
        return this.getTextureResource(entity);
    }
}
