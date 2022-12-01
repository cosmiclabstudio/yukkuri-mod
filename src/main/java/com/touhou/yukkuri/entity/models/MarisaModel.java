package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.entity.characters.MarisaEntity;
import com.touhou.yukkuri.Yukkuri;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MarisaModel extends AnimatedGeoModel<MarisaEntity> {
    @Override
    public Identifier getModelResource(MarisaEntity marisaEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/marisa.json");
    }

    @Override
    public Identifier getTextureResource(MarisaEntity marisaEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/marisa.png");
    }

    @Override
    public Identifier getAnimationResource(MarisaEntity entity) {
        return null;
    }
}
