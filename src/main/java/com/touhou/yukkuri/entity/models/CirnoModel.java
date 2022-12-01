package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.CirnoEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CirnoModel extends AnimatedGeoModel<CirnoEntity> {
    @Override
    public Identifier getModelResource(CirnoEntity cirnoEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/cirno.json");
    }

    @Override
    public Identifier getTextureResource(CirnoEntity cirnoEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/cirno.png");
    }

    @Override
    public Identifier getAnimationResource(CirnoEntity entity) {
        return null;
    }
}
