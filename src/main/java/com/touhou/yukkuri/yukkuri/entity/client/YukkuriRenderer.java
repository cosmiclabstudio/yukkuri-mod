package com.touhou.yukkuri.yukkuri.entity.client;

import com.touhou.yukkuri.yukkuri.entity.custom.YukkuriEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YukkuriRenderer extends GeoEntityRenderer<YukkuriEntity> {
    public YukkuriRenderer(EntityRendererFactory.Context context) {
        super(context, new YukkuriModel());
        this.shadowOpacity = 1f;
    }
    @Override
    public Identifier getTextureResource(YukkuriEntity entity) {
        return this.getTextureResource(entity);
    }
}
