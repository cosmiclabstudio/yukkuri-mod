package com.touhou.yukkuri.yukkuri;

import com.touhou.yukkuri.yukkuri.entity.ModEntities;
import com.touhou.yukkuri.yukkuri.entity.custom.ReimuYukkuriEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import software.bernie.geckolib3.GeckoLib;

public class Yukkuri implements ModInitializer {

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        FabricDefaultAttributeRegistry.register(ModEntities.REIMU_YUKKURI, ReimuYukkuriEntity.setAttributes());
    }
}
