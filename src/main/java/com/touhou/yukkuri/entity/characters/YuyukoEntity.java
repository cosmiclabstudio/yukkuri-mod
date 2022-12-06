package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;

public class YuyukoEntity extends DefaultYukkuri implements IAnimatable {
    public YuyukoEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initCustomGoals() {
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKIE), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_BEEF), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_CHICKEN), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_MUTTON), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_PORKCHOP), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_RABBIT), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_COD), false));
        this.goalSelector.add(1, new TemptGoal(this, 1.0, Ingredient.ofItems(Items.COOKED_SALMON), false));
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.YUYUKO_YUKKURI_TYPE.create(world);
    }
}
