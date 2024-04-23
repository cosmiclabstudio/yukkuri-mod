package com.touhou.yukkuri.items;

import com.touhou.yukkuri.items.types.Foods;
import com.touhou.yukkuri.items.types.Miscellaneous;
import com.touhou.yukkuri.items.types.SpawnEggs;

public class ItemRegistry {

    public static void init() {
        Foods.init();
        SpawnEggs.init();
        Miscellaneous.init();
    }
}
