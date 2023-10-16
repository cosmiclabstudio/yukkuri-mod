package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

public class YukariEntity extends DefaultYukkuri {
    public YukariEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initCustomGoals() {
        this.goalSelector.add(0, new LookAtEntityGoal(this, ChenEntity.class, 12f));
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.YUKARI_YUKKURI_TYPE.create(world);
    }
}
