package com.touhou.yukkuri;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.sounds.SoundRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Yukkuri implements ModInitializer {
    public static final String MOD_ID = "yukkuri";
    public static final Logger LOGGER = LoggerFactory.getLogger("Yukkuri");

    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        EntityRegistry.init();
        SoundRegistry.init();

        LOGGER.info("Take it Easy!");
    }
}
