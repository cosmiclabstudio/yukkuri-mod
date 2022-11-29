package com.touhou.yukkuri.yukkuri.client;

import com.touhou.yukkuri.yukkuri.entity.ModEntities;
import com.touhou.yukkuri.yukkuri.entity.client.ReimuRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class YukkuriClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.REIMU_YUKKURI, ReimuRenderer::new);
    }
}
