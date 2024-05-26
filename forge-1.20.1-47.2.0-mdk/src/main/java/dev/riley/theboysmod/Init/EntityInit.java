package dev.riley.theboysmod.Init;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.entity.*;
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

    public static final RegistryObject<EntityType<AnimatedEntity>> ANIMATED_ENTITY = ENTITIES.register("animated_entity",
            () -> EntityType.Builder.<AnimatedEntity>of(AnimatedEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "animated_entity").toString())
    );

    public static final RegistryObject<EntityType<CarterEntity>> CARTER_ENTITY = ENTITIES.register("carter_entity",
            () -> EntityType.Builder.<CarterEntity>of(CarterEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "carter_entity").toString())
    );


    public static final RegistryObject<EntityType<RileyEntity>> RILEY_ENTITY = ENTITIES.register("riley_entity",
            () -> EntityType.Builder.<RileyEntity>of(RileyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "riley_entity").toString())
    );

    public static final RegistryObject<EntityType<AustinEntity>> AUSTIN_ENTITY = ENTITIES.register("austin_entity",
            () -> EntityType.Builder.<AustinEntity>of(AustinEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "austin_entity").toString())
    );

    public static final RegistryObject<EntityType<BryanEntity>> BRYAN_ENTITY = ENTITIES.register("bryan_entity",
            () -> EntityType.Builder.<BryanEntity>of(BryanEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "bryan_entity").toString())
    );

    public static final RegistryObject<EntityType<JacobEntity>> JACOB_ENTITY = ENTITIES.register("jacob_entity",
            () -> EntityType.Builder.<JacobEntity>of(JacobEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "jacob_entity").toString())
    );

    public static final RegistryObject<EntityType<JakeEntity>> JAKE_ENTITY = ENTITIES.register("jake_entity",
            () -> EntityType.Builder.<JakeEntity>of(JakeEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "jake_entity").toString())
    );

    public static final RegistryObject<EntityType<JohnEntity>> JOHN_ENTITY = ENTITIES.register("john_entity",
            () -> EntityType.Builder.<JohnEntity>of(JohnEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "john_entity").toString())
    );

    public static final RegistryObject<EntityType<EvanEntity>> EVAN_ENTITY = ENTITIES.register("evan_entity",
            () -> EntityType.Builder.<EvanEntity>of(EvanEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "evan_entity").toString())
    );

    public static final RegistryObject<EntityType<NickEntity>> NICK_ENTITY = ENTITIES.register("nick_entity",
            () -> EntityType.Builder.<NickEntity>of(NickEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "nick_entity").toString())
    );





}


