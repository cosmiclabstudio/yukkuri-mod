package com.touhou.yukkuri.yukkuri.entity.models;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.characters.%String%Entity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class %String%Model extends AnimatedGeoModel<%String%Entity> {
    @Override
    public Identifier getModelResource(%String%Entity %string%Entity) {
        return new Identifier(Yukkuri.MOD_ID, "geo/%string%.json");
    }

    @Override
    public Identifier getTextureResource(%String%Entity %string%Entity) {
        return new Identifier(Yukkuri.MOD_ID, "textures/entity/%string%.png");
    }

    @Override
    public Identifier getAnimationResource(%String%Entity entity) {
        return null;
    }
}
