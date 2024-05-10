package dev.riley.theboysmod.Init;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.entity.CarterEntity;
import dev.riley.theboysmod.entity.ExampleEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheBoysMod.MODID);

    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY = ENTITIES.register("example_entity",
            () -> EntityType.Builder.<ExampleEntity>of(ExampleEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "example_entity").toString())
    );

    public static final RegistryObject<EntityType<CarterEntity>> CARTER_ENTITY = ENTITIES.register("carter_entity",
            () -> EntityType.Builder.<CarterEntity>of(CarterEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "carter_entity").toString())
    );




}


