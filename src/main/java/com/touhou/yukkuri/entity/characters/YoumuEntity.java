package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.sounds.SoundRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class YoumuEntity extends DefaultYukkuri {
    // the animation doesn't work so i just comment them out for now
    //private final AnimationBuilder FLOATING_GHOST = new AnimationBuilder().addAnimation("animation.youmu.ghost_guided", ILoopType.EDefaultLoopTypes.LOOP);

    public YoumuEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.YOUMU_YUKKURI_TYPE.create(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.ENTITY_YOUMU_MYON;
    }

    @Override
    public void playAmbientSound() {
        if (!world.isClient) {
            this.playSound(getAmbientSound(), 1, 1);
        }
    }
}
