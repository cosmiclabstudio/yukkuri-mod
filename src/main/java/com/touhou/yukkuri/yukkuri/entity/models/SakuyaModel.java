package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.SakuyaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SakuyaModel extends AnimatedGeoModel<SakuyaEntity> {
    @Override
    public Identifier getModelResource(SakuyaEntity sakuyaEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/sakuya.json");
    }

    @Override
    public Identifier getTextureResource(SakuyaEntity sakuyaEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/sakuya.png");
    }

    @Override
    public Identifier getAnimationResource(SakuyaEntity entity) {
        return null;
    }
}
