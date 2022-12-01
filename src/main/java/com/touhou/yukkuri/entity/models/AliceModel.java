package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.AliceEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AliceModel extends AnimatedGeoModel<AliceEntity> {
    @Override
    public Identifier getModelResource(AliceEntity aliceEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/alice.json");
    }

    @Override
    public Identifier getTextureResource(AliceEntity aliceEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/alice.png");
    }

    @Override
    public Identifier getAnimationResource(AliceEntity entity) {
        return null;
    }
}
