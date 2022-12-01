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
        EntityRendererRegistry.register(Yukkuri.ALICE_YUKKURI_TYPE, AliceRenderer::new);
        EntityRendererRegistry.register(Yukkuri.BLUEREIMU_YUKKURI_TYPE, BlueReimuRenderer::new);
        EntityRendererRegistry.register(Yukkuri.CHEN_YUKKURI_TYPE, ChenRenderer::new);
        EntityRendererRegistry.register(Yukkuri.CIRNO_YUKKURI_TYPE, CirnoRenderer::new);
        EntityRendererRegistry.register(Yukkuri.FLANDRE_YUKKURI_TYPE, FlandreRenderer::new);
        EntityRendererRegistry.register(Yukkuri.MARISA_YUKKURI_TYPE, MarisaRenderer::new);
        EntityRendererRegistry.register(Yukkuri.NITORI_YUKKURI_TYPE, NitoriRenderer::new);
        EntityRendererRegistry.register(Yukkuri.PATCHOULI_YUKKURI_TYPE, PatchouliRenderer::new);
        EntityRendererRegistry.register(Yukkuri.REIMU_YUKKURI_TYPE, ReimuRenderer::new);
        EntityRendererRegistry.register(Yukkuri.REISEN_YUKKURI_TYPE, ReisenRenderer::new);
        EntityRendererRegistry.register(Yukkuri.REMILIA_YUKKURI_TYPE, RemiliaRenderer::new);
        EntityRendererRegistry.register(Yukkuri.SAKUYA_YUKKURI_TYPE, SakuyaRenderer::new);
        EntityRendererRegistry.register(Yukkuri.SANAE_YUKKURI_TYPE, SanaeRenderer::new);
        EntityRendererRegistry.register(Yukkuri.TENSHI_YUKKURI_TYPE, TenshiRenderer::new);
        EntityRendererRegistry.register(Yukkuri.UTSUHO_YUKKURI_TYPE, UtsuhoRenderer::new);
        EntityRendererRegistry.register(Yukkuri.YOUMU_YUKKURI_TYPE, YoumuRenderer::new);
        EntityRendererRegistry.register(Yukkuri.YUKARI_YUKKURI_TYPE, YukariRenderer::new);
        EntityRendererRegistry.register(Yukkuri.YUYUKO_YUKKURI_TYPE, YuyukoRenderer::new);

    }
}
