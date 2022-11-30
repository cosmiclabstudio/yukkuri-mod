package com.touhou.yukkuri.yukkuri.entity.client;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.custom.YukkuriEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YukkuriModel extends AnimatedGeoModel<YukkuriEntity> {
    @Override
    public Identifier getModelResource(YukkuriEntity object) {
        return new Identifier(Yukkuri.MOD_ID, "geo/reimu.json");
    }

    @Override
    public Identifier getTextureResource(YukkuriEntity object) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/reimu.png");
    }

    @Override
    public Identifier getAnimationResource(YukkuriEntity entity) {
        return null;
    }
}
