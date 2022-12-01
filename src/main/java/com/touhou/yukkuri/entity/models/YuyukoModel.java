package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.YuyukoEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YuyukoModel extends AnimatedGeoModel<YuyukoEntity> {
    @Override
    public Identifier getModelResource(YuyukoEntity yuyukoEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/yuyuko.json");
    }

    @Override
    public Identifier getTextureResource(YuyukoEntity yuyukoEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/yuyuko.png");
    }

    @Override
    public Identifier getAnimationResource(YuyukoEntity entity) {
        return null;
    }
}
