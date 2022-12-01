package com.touhou.yukkuri.sounds;

import com.touhou.yukkuri.Yukkuri;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundRegistry {
    public static SoundEvent ENTITY_PATCHOULI_MUKYU = register("entity.patchouli.mukyu");
    public static SoundEvent ENTITY_CIRNO_BAKA      = register("entity.cirno.baka");

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(Yukkuri.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void init() {
    }
}
