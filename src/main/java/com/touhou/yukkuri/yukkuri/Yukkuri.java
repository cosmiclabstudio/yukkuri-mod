package com.touhou.yukkuri.yukkuri;

import com.touhou.yukkuri.yukkuri.entity.characters.*;
import com.touhou.yukkuri.yukkuri.sounds.SoundRegistry;
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

    // this part could have been done much cleaner
    public static final EntityType<ReimuEntity> REIMU_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "reimu"), FabricEntityTypeBuilder.<ReimuEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(ReimuEntity::new).defaultAttributes(ReimuEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<MarisaEntity> MARISA_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "marisa"), FabricEntityTypeBuilder.<MarisaEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(MarisaEntity::new).defaultAttributes(ReimuEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<PatchouliEntity> PATCHOULI_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "patchouli"), FabricEntityTypeBuilder.<PatchouliEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(PatchouliEntity::new).defaultAttributes(ReimuEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        SoundRegistry.init();
    }
}
