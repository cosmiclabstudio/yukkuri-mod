package com.touhou.yukkuri.entity.models;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.NitoriEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NitoriModel extends AnimatedGeoModel<NitoriEntity> {
    @Override
    public Identifier getModelResource(NitoriEntity nitoriEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/nitori.json");
    }

    @Override
    public Identifier getTextureResource(NitoriEntity nitoriEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/nitori.png");
    }

    @Override
    public Identifier getAnimationResource(NitoriEntity entity) {
        return null;
    }
}
