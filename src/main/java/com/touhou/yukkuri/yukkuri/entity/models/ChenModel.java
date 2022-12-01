package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.ChenEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChenModel extends AnimatedGeoModel<ChenEntity> {
    @Override
    public Identifier getModelResource(ChenEntity chenEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/chen.json");
    }

    @Override
    public Identifier getTextureResource(ChenEntity chenEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/chen.png");
    }

    @Override
    public Identifier getAnimationResource(ChenEntity entity) {
        return null;
    }
}
