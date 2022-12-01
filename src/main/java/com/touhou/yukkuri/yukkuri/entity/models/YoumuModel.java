package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.YoumuEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YoumuModel extends AnimatedGeoModel<YoumuEntity> {
    @Override
    public Identifier getModelResource(YoumuEntity youmuEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/youmu.json");
    }

    @Override
    public Identifier getTextureResource(YoumuEntity youmuEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/youmu.png");
    }

    @Override
    public Identifier getAnimationResource(YoumuEntity entity) {
        return new Identifier(Yukkuri.MOD_ID, "animations/youmu.animation.json");
    }
}
