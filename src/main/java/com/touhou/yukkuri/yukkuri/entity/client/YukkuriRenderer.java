package com.touhou.yukkuri.yukkuri.entity.client;

import com.touhou.yukkuri.yukkuri.entity.characters.ReimuEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YukkuriRenderer extends GeoEntityRenderer<ReimuEntity> {
    public YukkuriRenderer(EntityRendererFactory.Context context) {
        super(context, new ReimuModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(ReimuEntity entity) {
        return this.getTextureResource(entity);
    }
}
