package com.touhou.yukkuri.yukkuri;

import com.touhou.yukkuri.yukkuri.entity.characters.ReimuEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;

public class Yukkuri implements ModInitializer {
    public static final String MOD_ID = "yukkuri";

    public static final EntityType<ReimuEntity> YUKKURI_ENTITY_TYPE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(MOD_ID, "yukkuri"),
            FabricEntityTypeBuilder.<ReimuEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(ReimuEntity::new)
                    .defaultAttributes(ReimuEntity::setAttributes)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    @Override
    public void onInitialize() {
        GeckoLib.initialize();

    }
}
