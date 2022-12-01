package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.PatchouliEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PatchouliModel extends AnimatedGeoModel<PatchouliEntity> {
    @Override
    public Identifier getModelResource(PatchouliEntity patchouliEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/patchouli.json");
    }

    @Override
    public Identifier getTextureResource(PatchouliEntity patchouliEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/patchouli.png");
    }

    @Override
    public Identifier getAnimationResource(PatchouliEntity entity) {
        return null;
    }
}
