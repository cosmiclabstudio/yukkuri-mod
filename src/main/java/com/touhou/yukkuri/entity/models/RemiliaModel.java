package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.RemiliaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RemiliaModel extends AnimatedGeoModel<RemiliaEntity> {
    @Override
    public Identifier getModelResource(RemiliaEntity remiliaEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/remilia.json");
    }

    @Override
    public Identifier getTextureResource(RemiliaEntity remiliaEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/remilia.png");
    }

    @Override
    public Identifier getAnimationResource(RemiliaEntity entity) {
        return null;
    }
}
