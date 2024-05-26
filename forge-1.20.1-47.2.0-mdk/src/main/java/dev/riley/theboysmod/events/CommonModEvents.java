package dev.riley.theboysmod.events;

import dev.riley.theboysmod.Init.EntityInit;
import dev.riley.theboysmod.TheBoysMod;
//import dev.riley.theboysmod.entity.CarterEntity;
import dev.riley.theboysmod.entity.*;
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
        event.put(EntityInit.ANIMATED_ENTITY.get(), RileyEntity.createAttributes().build());
        event.put(EntityInit.CARTER_ENTITY.get(), ExampleEntity.createAttributes().build());
        event.put(EntityInit.RILEY_ENTITY.get(), RileyEntity.createAttributes().build());
        event.put(EntityInit.AUSTIN_ENTITY.get(), AustinEntity.createAttributes().build());
        event.put(EntityInit.BRYAN_ENTITY.get(), BryanEntity.createAttributes().build());
        event.put(EntityInit.JACOB_ENTITY.get(), JacobEntity.createAttributes().build());
        event.put(EntityInit.JAKE_ENTITY.get(), JakeEntity.createAttributes().build());
        event.put(EntityInit.JOHN_ENTITY.get(), JohnEntity.createAttributes().build());
        event.put(EntityInit.EVAN_ENTITY.get(), EvanEntity.createAttributes().build());
        event.put(EntityInit.NICK_ENTITY.get(), NickEntity.createAttributes().build());

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
        event.register(
                EntityInit.RILEY_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                RileyEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.CARTER_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                CarterEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.AUSTIN_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                AustinEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.ANIMATED_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                AnimatedEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.BRYAN_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                BryanEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.JACOB_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                JacobEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.JAKE_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                JakeEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.JOHN_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                JohnEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.EVAN_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                EvanEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

        event.register(
                EntityInit.NICK_ENTITY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.WORLD_SURFACE,
                NickEntity::canSpawn,
                SpawnPlacementRegisterEvent.Operation.OR
        );

    }
}