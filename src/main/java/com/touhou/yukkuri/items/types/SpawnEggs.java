package com.touhou.yukkuri.items.types;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.EntityRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpawnEggs {
    public static final Item ALICE_SPAWN_EGG = register(EntityRegistry.ALICE_YUKKURI_TYPE, "alice", 16762195, 10092800);
    public static final Item BLUEREIMU_SPAWN_EGG = register(EntityRegistry.BLUEREIMU_YUKKURI_TYPE, "blue_reimu", 7578, 1776411);
    public static final Item CHEN_SPAWN_EGG = register(EntityRegistry.CHEN_YUKKURI_TYPE, "chen", 10092800, 669184);
    public static final Item CIRNO_SPAWN_EGG = register(EntityRegistry.CIRNO_YUKKURI_TYPE, "cirno", 58098, 4092349);
    public static final Item FLANDRE_SPAWN_EGG = register(EntityRegistry.FLANDRE_YUKKURI_TYPE, "flandre", 15380535, 10092800);
    public static final Item MARISA_SPAWN_EGG = register(EntityRegistry.MARISA_YUKKURI_TYPE, "marisa", 16696144, 10790052);
    public static final Item NITORI_SPAWN_EGG = register(EntityRegistry.NITORI_YUKKURI_TYPE, "nitori", 3628962, 1734941);
    public static final Item PATCHOULI_SPAWN_EGG = register(EntityRegistry.PATCHOULI_YUKKURI_TYPE, "patchouli", 9044709, 16371711);
    public static final Item REIMU_SPAWN_EGG = register(EntityRegistry.REIMU_YUKKURI_TYPE, "reimu", 10092800, 1776411);
    public static final Item REISEN_SPAWN_EGG = register(EntityRegistry.REISEN_YUKKURI_TYPE, "reisen", 8148346, 14221312);
    public static final Item REMILIA_SPAWN_EGG = register(EntityRegistry.REMILIA_YUKKURI_TYPE, "remilia", 16378100, 14221312);
    public static final Item SAKUYA_SPAWN_EGG = register(EntityRegistry.SAKUYA_YUKKURI_TYPE, "sakuya", 12829635, 3556238);
    public static final Item SANAE_SPAWN_EGG = register(EntityRegistry.SANAE_YUKKURI_TYPE, "sanae", 33537, 1255350);
    public static final Item TENSHI_SPAWN_EGG = register(EntityRegistry.TENSHI_YUKKURI_TYPE, "tenshi", 3366305, 16743251);
    public static final Item UTSUHO_SPAWN_EGG = register(EntityRegistry.UTSUHO_YUKKURI_TYPE, "utsuho", 2337609, 2391586);
    public static final Item YOUMU_SPAWN_EGG = register(EntityRegistry.YOUMU_YUKKURI_TYPE, "youmu", 50342, 3289650);
    public static final Item YUKARI_SPAWN_EGG = register(EntityRegistry.YUKARI_YUKKURI_TYPE, "yukari", 16776941, 11889874);
    public static final Item YUYUKO_SPAWN_EGG = register(EntityRegistry.YUYUKO_YUKKURI_TYPE, "yuyuko", 11189452, 14522794);

    public static Item register(EntityType entity, String name, int primary, int secondary) {
        Item item = new SpawnEggItem(entity, primary, secondary, new Item.Settings().group(Yukkuri.ITEM_GROUP));
        return Registry.register(Registry.ITEM, new Identifier(Yukkuri.MOD_ID, name + "_spawn_egg"), item);
    }

    public static void init() {}

}
