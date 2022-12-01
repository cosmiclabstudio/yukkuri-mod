package com.touhou.yukkuri.client;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.entity.renderer.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class YukkuriClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityRegistry.ALICE_YUKKURI_TYPE, AliceRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.BLUEREIMU_YUKKURI_TYPE, BlueReimuRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.CHEN_YUKKURI_TYPE, ChenRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.CIRNO_YUKKURI_TYPE, CirnoRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.FLANDRE_YUKKURI_TYPE, FlandreRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.MARISA_YUKKURI_TYPE, MarisaRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.NITORI_YUKKURI_TYPE, NitoriRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.PATCHOULI_YUKKURI_TYPE, PatchouliRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.REIMU_YUKKURI_TYPE, ReimuRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.REISEN_YUKKURI_TYPE, ReisenRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.REMILIA_YUKKURI_TYPE, RemiliaRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SAKUYA_YUKKURI_TYPE, SakuyaRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.SANAE_YUKKURI_TYPE, SanaeRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.TENSHI_YUKKURI_TYPE, TenshiRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.UTSUHO_YUKKURI_TYPE, UtsuhoRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.YOUMU_YUKKURI_TYPE, YoumuRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.YUKARI_YUKKURI_TYPE, YukariRenderer::new);
        EntityRendererRegistry.register(EntityRegistry.YUYUKO_YUKKURI_TYPE, YuyukoRenderer::new);
    }
}
