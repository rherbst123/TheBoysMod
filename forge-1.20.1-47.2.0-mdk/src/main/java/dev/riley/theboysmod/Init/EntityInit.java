package dev.riley.theboysmod.Init;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.entity.CarterMob;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheBoysMod.MODID);


    public static final RegistryObject<EntityType<CarterMob>> CARTER_MOB = ENTITIES.register("carter_mob",
            () -> EntityType.Builder.<CarterMob>of(CarterMob::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f)
                    .build(new ResourceLocation(TheBoysMod.MODID, "carter_mob").toString())
    );
}
