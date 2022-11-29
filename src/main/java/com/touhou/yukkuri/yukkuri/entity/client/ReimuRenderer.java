package com.touhou.yukkuri.yukkuri.entity.client;

import com.touhou.yukkuri.yukkuri.entity.custom.ReimuYukkuriEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ReimuRenderer extends GeoEntityRenderer<ReimuYukkuriEntity> {
    public ReimuRenderer(EntityRendererFactory.Context context) {
        super(context, new ReimuModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(ReimuYukkuriEntity animatable) {
        return new Identifier("yukkuri", "textures/entity/reimu.png");
    }
}
