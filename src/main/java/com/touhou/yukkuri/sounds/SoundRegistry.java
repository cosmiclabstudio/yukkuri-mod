package com.touhou.yukkuri.sounds;

import com.touhou.yukkuri.Yukkuri;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundRegistry {
    public static SoundEvent ENTITY_CIRNO_BAKA      = register("entity.cirno.baka");
    //public static SoundEvent ENTITY_MARISA_EVADED   = register("entity.marisa.evaded"); // soon
    public static SoundEvent ENTITY_MARISA_ZE       = register("entity.marisa.ze");
    public static SoundEvent ENTITY_PATCHOULI_MUKYU = register("entity.patchouli.mukyu");
    public static SoundEvent ENTITY_SCARLET_UUU     = register("entity.scarlet.uuu");
    public static SoundEvent ENTITY_USAGI_BNUUY     = register("entity.usagi.bnuuy");
    public static SoundEvent ENTITY_UTSUHO_UNYU     = register("entity.utsuho.unyu");
    public static SoundEvent ENTITY_YOUMU_MYON      = register("entity.youmu.myon");

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(Yukkuri.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void init() {
    }
}
