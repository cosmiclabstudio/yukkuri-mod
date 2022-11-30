package com.touhou.yukkuri.yukkuri.entity.characters;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.PassiveEntity;

public class DefaultYukkuri {
    public static final DefaultAttributeContainer.Builder yukkuriAttribute= PassiveEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100.00)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5f);

}
