package com.touhou.yukkuri.yukkuri.client;

import com.touhou.yukkuri.yukkuri.Yukkuri;
import com.touhou.yukkuri.yukkuri.entity.renderer.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class YukkuriClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Yukkuri.REIMU_YUKKURI_TYPE, ReimuRenderer::new);
        EntityRendererRegistry.register(Yukkuri.MARISA_YUKKURI_TYPE, MarisaRenderer::new);
        EntityRendererRegistry.register(Yukkuri.PATCHOULI_YUKKURI_TYPE, PatchouliRenderer::new);
    }
}
