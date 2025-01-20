package labs.cosmic.yukkuri.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class NitoriEntity extends AbstractYukkuri {
    public NitoriEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }
}
