/*
 * Copyright (c) 2024.
 */

package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.sounds.SoundRegistry;
import com.touhou.yukkuri.utils.RandomNumber;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class PatchouliEntity extends DefaultYukkuri {
    public PatchouliEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initCustomGoals() {
        this.goalSelector.add(1, new TemptGoal(this, TEMPT_SPEED, Ingredient.ofItems(Items.BOOK), false));
        this.goalSelector.add(1, new TemptGoal(this, TEMPT_SPEED, Ingredient.ofItems(Items.ENCHANTED_BOOK), false));
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.PATCHOULI_YUKKURI_TYPE.create(world);
    }
    
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.ENTITY_PATCHOULI_MUKYU;
    }
    
    @Override
    public void playHurtSound(DamageSource source) {
        if(!world.isClient) {
          this.playSound(getHurtSound(source), 1, RandomNumber.generateFloat(1F, 1.3F));   
        }
    }
    
    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.ENTITY_PATCHOULI_DIED;
    }
}
