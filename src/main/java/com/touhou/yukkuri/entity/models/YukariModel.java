package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.YukariEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YukariModel extends AnimatedGeoModel<YukariEntity> {
    @Override
    public Identifier getModelResource(YukariEntity yukariEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/yukari.json");
    }

    @Override
    public Identifier getTextureResource(YukariEntity yukariEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/yukari.png");
    }

    @Override
    public Identifier getAnimationResource(YukariEntity entity) {
        return null;
    }
}
