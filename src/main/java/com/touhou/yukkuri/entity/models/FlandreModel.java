package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.FlandreEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FlandreModel extends AnimatedGeoModel<FlandreEntity> {
    @Override
    public Identifier getModelResource(FlandreEntity flandreEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/flandre.json");
    }

    @Override
    public Identifier getTextureResource(FlandreEntity flandreEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/flandre.png");
    }

    @Override
    public Identifier getAnimationResource(FlandreEntity entity) {
        return null;
    }
}
