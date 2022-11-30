package com.touhou.yukkuri.yukkuri.entity.client;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.ReimuEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ReimuModel extends AnimatedGeoModel<ReimuEntity> {
    @Override
    public Identifier getModelResource(ReimuEntity yukkuriEntity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/reimu.json");
    }

    @Override
    public Identifier getTextureResource(ReimuEntity yukkuriEntity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/" + yukkuriEntity.getYukkuriString() + ".png");
    }

    @Override
    public Identifier getAnimationResource(ReimuEntity entity) {
        return null;
    }
}
