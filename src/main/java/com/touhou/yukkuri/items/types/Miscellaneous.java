package com.touhou.yukkuri.items.types;

import com.touhou.yukkuri.Yukkuri;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Miscellaneous {
    public static final Item SHOWCASE = register("showcase");
    
    public static Item register(String name) {
        Item item = new Item(new Item.Settings());
        return Registry.register(Registry.ITEM, new Identifier(Yukkuri.MOD_ID, name), item);
    }

    public static void init() {}
}
