package dev.riley.theboysmod.events;

import dev.riley.theboysmod.Init.EntityInit;
import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.entity.ExampleEntity;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheBoysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                EntityInit.EXAMPLE_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                ExampleEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );
    }
}