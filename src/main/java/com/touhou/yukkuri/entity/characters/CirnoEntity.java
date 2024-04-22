/*
 * Copyright (c) 2024.
 */

package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.sounds.SoundRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class CirnoEntity extends DefaultYukkuri {
    public CirnoEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.CIRNO_YUKKURI_TYPE.create(world);
    }
    
    public SoundEvent getAmbientSound() {
        return SoundRegistry.ENTITY_CIRNO_BAKA;
    }
    
    
}
