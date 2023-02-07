package com.touhou.yukkuri.entity;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.characters.*;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityRegistry {

    public static final EntityType<AliceEntity> ALICE_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "alice"), FabricEntityTypeBuilder.<AliceEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(AliceEntity::new).defaultAttributes(AliceEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<BlueReimuEntity> BLUEREIMU_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "blue_reimu"), FabricEntityTypeBuilder.<BlueReimuEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(BlueReimuEntity::new).defaultAttributes(BlueReimuEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<ChenEntity> CHEN_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "chen"), FabricEntityTypeBuilder.<ChenEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(ChenEntity::new).defaultAttributes(ChenEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<CirnoEntity> CIRNO_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "cirno"), FabricEntityTypeBuilder.<CirnoEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(CirnoEntity::new).defaultAttributes(CirnoEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<FlandreEntity> FLANDRE_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "flandre"), FabricEntityTypeBuilder.<FlandreEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(FlandreEntity::new).defaultAttributes(FlandreEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<MarisaEntity> MARISA_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "marisa"), FabricEntityTypeBuilder.<MarisaEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(MarisaEntity::new).defaultAttributes(MarisaEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<NitoriEntity> NITORI_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "nitori"), FabricEntityTypeBuilder.<NitoriEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(NitoriEntity::new).defaultAttributes(NitoriEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<PatchouliEntity> PATCHOULI_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "patchouli"), FabricEntityTypeBuilder.<PatchouliEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(PatchouliEntity::new).defaultAttributes(PatchouliEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<ReimuEntity> REIMU_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "reimu"), FabricEntityTypeBuilder.<ReimuEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(ReimuEntity::new).defaultAttributes(ReimuEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<ReisenEntity> REISEN_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "reisen"), FabricEntityTypeBuilder.<ReisenEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(ReisenEntity::new).defaultAttributes(ReisenEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<RemiliaEntity> REMILIA_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "remilia"), FabricEntityTypeBuilder.<RemiliaEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(RemiliaEntity::new).defaultAttributes(RemiliaEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<SakuyaEntity> SAKUYA_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "sakuya"), FabricEntityTypeBuilder.<SakuyaEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(SakuyaEntity::new).defaultAttributes(SakuyaEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<SanaeEntity> SANAE_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "sanae"), FabricEntityTypeBuilder.<SanaeEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(SanaeEntity::new).defaultAttributes(SanaeEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<TenshiEntity> TENSHI_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "tenshi"), FabricEntityTypeBuilder.<TenshiEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(TenshiEntity::new).defaultAttributes(TenshiEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<UtsuhoEntity> UTSUHO_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "utsuho"), FabricEntityTypeBuilder.<UtsuhoEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(UtsuhoEntity::new).defaultAttributes(UtsuhoEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<YoumuEntity> YOUMU_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "youmu"), FabricEntityTypeBuilder.<YoumuEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(YoumuEntity::new).defaultAttributes(YoumuEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<YukariEntity> YUKARI_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "yukari"), FabricEntityTypeBuilder.<YukariEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(YukariEntity::new).defaultAttributes(YukariEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());
    public static final EntityType<YuyukoEntity> YUYUKO_YUKKURI_TYPE = Registry.register(Registry.ENTITY_TYPE, new Identifier(Yukkuri.MOD_ID, "yuyuko"), FabricEntityTypeBuilder.<YuyukoEntity>createMob().spawnGroup(SpawnGroup.CREATURE).entityFactory(YuyukoEntity::new).defaultAttributes(YuyukoEntity::setAttributes).dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build());

    public static void entityBiome(TagKey<net.minecraft.world.biome.Biome> biomeTags, SpawnGroup group, EntityType<?> entityType) {
        BiomeModifications.addSpawn(ctx -> ctx.hasTag(biomeTags), group, entityType, 420, 1, 3);
    }
    public static void init() {
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, ALICE_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, BLUEREIMU_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, CHEN_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, CIRNO_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, FLANDRE_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, MARISA_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, NITORI_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, PATCHOULI_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, REIMU_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, REISEN_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, REMILIA_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, SAKUYA_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, SANAE_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, TENSHI_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, UTSUHO_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, YOUMU_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, YUKARI_YUKKURI_TYPE);
        entityBiome(ConventionalBiomeTags.IN_OVERWORLD, SpawnGroup.CREATURE, YUYUKO_YUKKURI_TYPE);
    }
}
