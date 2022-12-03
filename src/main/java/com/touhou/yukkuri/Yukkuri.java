package com.touhou.yukkuri;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.items.ItemRegistry;
import com.touhou.yukkuri.items.types.SpawnEggs;
import com.touhou.yukkuri.sounds.SoundRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Yukkuri implements ModInitializer {
    public static final String MOD_ID = "yukkuri";
    public static final Logger LOGGER = LoggerFactory.getLogger("Yukkuri");
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "yukkuri"), () -> new ItemStack(SpawnEggs.REIMU_SPAWN_EGG));

    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        EntityRegistry.init();
        SoundRegistry.init();
        ItemRegistry.init();

        LOGGER.info("Take it Easy!");
    }
}
