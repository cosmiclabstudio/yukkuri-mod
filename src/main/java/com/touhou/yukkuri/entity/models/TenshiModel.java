package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.TenshiEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TenshiModel extends AnimatedGeoModel<TenshiEntity> {
    @Override
    public Identifier getModelResource(TenshiEntity tenshiEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/tenshi.json");
    }

    @Override
    public Identifier getTextureResource(TenshiEntity tenshiEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/tenshi.png");
    }

    @Override
    public Identifier getAnimationResource(TenshiEntity entity) {
        return null;
    }
}
