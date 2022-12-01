package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.UtsuhoEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UtsuhoModel extends AnimatedGeoModel<UtsuhoEntity> {
    @Override
    public Identifier getModelResource(UtsuhoEntity utsuhoEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/utsuho.json");
    }

    @Override
    public Identifier getTextureResource(UtsuhoEntity utsuhoEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/utsuho.png");
    }

    @Override
    public Identifier getAnimationResource(UtsuhoEntity entity) {
        return null;
    }
}
