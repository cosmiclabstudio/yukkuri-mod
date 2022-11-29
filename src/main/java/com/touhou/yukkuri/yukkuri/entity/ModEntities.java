package com.touhou.yukkuri.yukkuri.entity;

import com.touhou.yukkuri.yukkuri.entity.custom.ReimuYukkuriEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<ReimuYukkuriEntity> REIMU_YUKKURI = Registry.register(
            Registry.ENTITY_TYPE, new Identifier("yukkuri", "reimu"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ReimuYukkuriEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.6f)).build()
    );

}
