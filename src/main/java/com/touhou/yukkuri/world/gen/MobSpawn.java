package com.touhou.yukkuri.world.gen;

import com.touhou.yukkuri.entity.EntityRegistry;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.BiomeKeys;

public class MobSpawn {
    public static void spawn() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DESERT), SpawnGroup.CREATURE, EntityRegistry.UTSUHO_YUKKURI_TYPE, 50, 1, 4);
    }
}
