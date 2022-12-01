package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.ReisenEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReisenModel extends AnimatedGeoModel<ReisenEntity> {
    @Override
    public Identifier getModelResource(ReisenEntity reisenEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/reisen.json");
    }

    @Override
    public Identifier getTextureResource(ReisenEntity reisenEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/reisen.png");
    }

    @Override
    public Identifier getAnimationResource(ReisenEntity entity) {
        return null;
    }
}
