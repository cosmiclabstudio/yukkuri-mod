package com.touhou.yukkuri.yukkuri.entity.client;

import com.touhou.yukkuri.yukkuri.entity.custom.ReimuYukkuriEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReimuModel extends AnimatedGeoModel<ReimuYukkuriEntity> {

    @Override
    public Identifier getModelResource(ReimuYukkuriEntity object) {
        return new Identifier("yukkuri", "geo/reimu.json");
    }

    @Override
    public Identifier getTextureResource(ReimuYukkuriEntity object) {
        return new Identifier("yukkuri", "textures/entity/reimu.png");
    }

    @Override
    public Identifier getAnimationResource(ReimuYukkuriEntity animatable) {
        return null;
    }
}
