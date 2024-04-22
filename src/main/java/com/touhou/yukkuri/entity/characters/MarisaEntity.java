/*
 * Copyright (c) 2024.
 */

package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.sounds.SoundRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class MarisaEntity extends DefaultYukkuri {
    public MarisaEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initCustomGoals() {
        this.goalSelector.add(1, new TemptGoal(this, TEMPT_SPEED, Ingredient.ofItems(Items.ENCHANTED_BOOK), false));
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.MARISA_YUKKURI_TYPE.create(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.ENTITY_MARISA_ZE;
    }
    
    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.ENTITY_MARISA_EVADED;
    }
}
