package com.touhou.yukkuri.items.types;

import com.touhou.yukkuri.Yukkuri;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Foods {
    public static final Item BEAN_PASTE = register("bean_paste", 3, 0.4F);

    private static Item register(String name, int hunger, float saturation) {
        FoodComponent foodComponent = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build();
        Item item = new Item(new FabricItemSettings().group(Yukkuri.ITEM_GROUP).food(foodComponent));
        return Registry.register(Registry.ITEM, new Identifier(Yukkuri.MOD_ID, name), item);
    }
    public static void init() {}
}
