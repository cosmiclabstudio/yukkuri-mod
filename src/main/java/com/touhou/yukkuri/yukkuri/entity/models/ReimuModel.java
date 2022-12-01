package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.ReimuEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReimuModel extends AnimatedGeoModel<ReimuEntity> {
    @Override
    public Identifier getModelResource(ReimuEntity reimuEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/reimu.json");
    }

    @Override
    public Identifier getTextureResource(ReimuEntity reimuEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/reimu.png");
    }

    @Override
    public Identifier getAnimationResource(ReimuEntity entity) {
        return null;
    }
}
