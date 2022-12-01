package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.SanaeEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SanaeModel extends AnimatedGeoModel<SanaeEntity> {
    @Override
    public Identifier getModelResource(SanaeEntity sanaeEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/sanae.json");
    }

    @Override
    public Identifier getTextureResource(SanaeEntity sanaeEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/sanae.png");
    }

    @Override
    public Identifier getAnimationResource(SanaeEntity entity) {
        return null;
    }
}
