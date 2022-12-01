package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.BlueReimuEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BlueReimuModel extends AnimatedGeoModel<BlueReimuEntity> {
    @Override
    public Identifier getModelResource(BlueReimuEntity blue_reimuEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/blue_reimu.json");
    }

    @Override
    public Identifier getTextureResource(BlueReimuEntity blue_reimuEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/blue_reimu.png");
    }

    @Override
    public Identifier getAnimationResource(BlueReimuEntity entity) {
        return null;
    }
}
