package com.touhou.yukkuri.items;

import com.touhou.yukkuri.Yukkuri;
import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.items.types.Foods;
import com.touhou.yukkuri.items.types.SpawnEggs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {



    public static void init() {
        Foods.init();
        SpawnEggs.init();
    }
}
