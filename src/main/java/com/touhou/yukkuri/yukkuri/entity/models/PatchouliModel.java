package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.PatchouliEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PatchouliModel extends AnimatedGeoModel<PatchouliEntity> {
    @Override
    public Identifier getModelResource(PatchouliEntity yukkuriEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/patchouli.json");
    }

    @Override
    public Identifier getTextureResource(PatchouliEntity yukkuriEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/patchouli.png");
    }

    @Override
    public Identifier getAnimationResource(PatchouliEntity entity) {
        return null;
    }
}
