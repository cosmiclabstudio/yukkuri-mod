package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;

public class SanaeEntity extends DefaultYukkuri implements IAnimatable {
    public SanaeEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.SANAE_YUKKURI_TYPE.create(world);
    }

}
