package dev.riley.theboysmod.Init;

import dev.riley.theboysmod.Init.moditems.*;
import dev.riley.theboysmod.Init.moditems.armoritems.*;
import dev.riley.theboysmod.TheBoysMod;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import static net.minecraft.world.item.Items.CHORUS_FRUIT;
import static net.minecraft.world.item.Items.registerItem;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheBoysMod.MODID);


    //Carters Items
    public static final RegistryObject<Item> CARTER_ESSENCE = ITEMS.register("carter_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CARTER_INGOT = ITEMS.register("carter_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<ArmorItem> CARTER_HELMET = ITEMS.register("carter_helmet",
            () -> new carterArmorItem(
                    ArmorMatInit.CARTER,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> CARTER_CHESTPLATE = ITEMS.register("carter_chestplate",
            () -> new carterArmorItem(
                    ArmorMatInit.CARTER,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> CARTER_PANTS = ITEMS.register("carter_pants",
            () -> new carterArmorItem(
                    ArmorMatInit.CARTER,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> CARTER_BOOTS = ITEMS.register("carter_boots",
            () -> new carterArmorItem(
                    ArmorMatInit.CARTER,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));




    //Riley's Items
    //Ketamine item
    //Properties in ModItems/KetamineItems
    public static final RegistryObject<Item> KETAMINE = ITEMS.register("ketamine",
            () -> new KetamineItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(0)
                    .alwaysEat()
                    .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200, 4), 100f)
                    .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 375, 8), 100f)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 150, 1), 100f)
                    //Remember to add darkness back in(out for testing)
                    .effect(() -> new MobEffectInstance(MobEffects.DARKNESS,400,1),100f)
                    .build())));





    public static final RegistryObject<Item> RILEY_ESSENCE = ITEMS.register("riley_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RILEY_INGOT = ITEMS.register("riley_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<ArmorItem> RILEY_HELMET = ITEMS.register("riley_helmet",
            () -> new rileyArmorItem(
                    ArmorMatInit.RILEY,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> RILEY_CHESTPLATE = ITEMS.register("riley_chestplate",
            () -> new rileyArmorItem(
                    ArmorMatInit.RILEY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> RILEY_PANTS = ITEMS.register("riley_pants",
            () -> new rileyArmorItem(
                    ArmorMatInit.RILEY,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> RILEY_BOOTS = ITEMS.register("riley_boots",
            () -> new rileyArmorItem(
                    ArmorMatInit.RILEY,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));


    //Austin's Items
    //Properties In modItems/HotMeatItem
    public static final RegistryObject<HotMeatItem> HOT_MEAT = ITEMS.register("hot_meat",()
            -> new HotMeatItem(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(1)
            .effect(new MobEffectInstance(MobEffects.HARM,1),100f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION,150,1),100f)
            .alwaysEat()
            .build())));
    //Austin's Essence
    public static final RegistryObject<Item> AUSTIN_ESSENCE = ITEMS.register("austin_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AUSTIN_INGOT = ITEMS.register("austin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<ArmorItem> AUSTIN_HELMET = ITEMS.register("austin_helmet",
            () -> new austinArmorItem(
                    ArmorMatInit.AUSTIN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> AUSTIN_CHESTPLATE = ITEMS.register("austin_chestplate",
            () -> new austinArmorItem(
                    ArmorMatInit.AUSTIN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> AUSTIN_PANTS = ITEMS.register("austin_pants",
            () -> new austinArmorItem(
                    ArmorMatInit.AUSTIN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> AUSTIN_BOOTS = ITEMS.register("austin_boots",
            () -> new austinArmorItem(
                    ArmorMatInit.AUSTIN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    //Bryans Items
    public static final RegistryObject<Item> BRYAN_ESSENCE = ITEMS.register("bryan_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRYAN_INGOT = ITEMS.register("bryan_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> BRYANS_BATON = ITEMS.register("bryans_baton",
            () -> new SwordItem(Tiers.NETHERITE, 3,5.0f, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<ArmorItem> BRYAN_HELMET = ITEMS.register("bryan_helmet",
            () -> new bryanArmorItem(
                    ArmorMatInit.BRYAN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> BRYAN_CHESTPLATE = ITEMS.register("bryan_chestplate",
            () -> new bryanArmorItem(
                    ArmorMatInit.BRYAN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> BRYAN_PANTS = ITEMS.register("bryan_pants",
            () -> new bryanArmorItem(
                    ArmorMatInit.BRYAN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> BRYAN_BOOTS = ITEMS.register("bryan_boots",
            () -> new bryanArmorItem(
                    ArmorMatInit.BRYAN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));




    //Jacobs items
    public static final RegistryObject<Item> JACOB_ESSENCE = ITEMS.register("jacob_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JACOB_INGOT = ITEMS.register("jacob_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BODY_PILLOW = ITEMS.register("body_pillow",
            () -> new bodyPillowItem(new Item.Properties()));

    public static final RegistryObject<Item> ZYN = ITEMS.register("zyn",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                            .effect(new MobEffectInstance(MobEffects.CONFUSION,2,3),100f)
                    .build())));

    public static final RegistryObject<ArmorItem> JACOB_HELMET = ITEMS.register("jacob_helmet",
            () -> new jacobArmorItem(
                    ArmorMatInit.JACOB,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JACOB_CHESTPLATE = ITEMS.register("jacob_chestplate",
            () -> new jacobArmorItem(
                    ArmorMatInit.JACOB,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> JACOB_PANTS = ITEMS.register("jacob_pants",
            () -> new jacobArmorItem(
                    ArmorMatInit.JACOB,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JACOB_BOOTS = ITEMS.register("jacob_boots",
            () -> new jacobArmorItem(
                    ArmorMatInit.JACOB,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    //jakes items
    public static final RegistryObject<Item> JAKE_ESSENCE = ITEMS.register("jake_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JAKE_INGOT = ITEMS.register("jake_ingot",
            () -> new Item(new Item.Properties()));
   

    public static final RegistryObject<ArmorItem> JAKE_HELMET = ITEMS.register("jake_helmet",
            () -> new jakeArmorItem(
                    ArmorMatInit.JAKE,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JAKE_CHESTPLATE = ITEMS.register("jake_chestplate",
            () -> new jakeArmorItem(
                    ArmorMatInit.JAKE,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JAKE_PANTS = ITEMS.register("jake_pants",
            () -> new jakeArmorItem(
                    ArmorMatInit.JAKE,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JAKE_BOOTS = ITEMS.register("jake_boots",
            () -> new jakeArmorItem(
                    ArmorMatInit.JAKE,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<thepenItem> THE_PEN = ITEMS.register("the_pen",
    () -> new thepenItem(new Item.Properties().durability(5)));



    //Johns items
    public static final RegistryObject<Item> JOHN_ESSENCE = ITEMS.register("john_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JOHN_INGOT = ITEMS.register("john_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THE_SKIN = ITEMS.register("the_skin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<ArmorItem> JOHN_HELMET = ITEMS.register("john_helmet",
            () -> new johnArmorItem(
                    ArmorMatInit.JOHN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JOHN_CHESTPLATE = ITEMS.register("john_chestplate",
            () -> new johnArmorItem(
                    ArmorMatInit.JOHN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> JOHN_PANTS = ITEMS.register("john_pants",
            () -> new johnArmorItem(
                    ArmorMatInit.JOHN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> JOHN_BOOTS = ITEMS.register("john_boots",
            () -> new johnArmorItem(
                    ArmorMatInit.JOHN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    

        //Evans Items
    public static final RegistryObject<Item> EVAN_ESSENCE = ITEMS.register("evan_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EVAN_INGOT = ITEMS.register("evan_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> THE_NUG = ITEMS.register("the_nug",()
            -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> DOOBSKUM = ITEMS.register("doobscum",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 1 , 300), 100f)

                    .build())));



            
    public static final RegistryObject<Item> EVAN_PICK = ITEMS.register("evan_pick", ()
    -> new evanPickItem(new Item.Properties()));


    public static final RegistryObject<ArmorItem> EVAN_HELMET = ITEMS.register("evan_helmet",
            () -> new evanArmorItem(
                    ArmorMatInit.EVAN,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));


    public static final RegistryObject<ArmorItem> EVAN_CHESTPLATE = ITEMS.register("evan_chestplate",
            () -> new evanArmorItem(
                    ArmorMatInit.EVAN,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> EVAN_PANTS = ITEMS.register("evan_pants",
            () -> new evanArmorItem(
                    ArmorMatInit.EVAN,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> EVAN_BOOTS = ITEMS.register("evan_boots",
            () -> new evanArmorItem(
                    ArmorMatInit.EVAN,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    //Nicks items
    public static final RegistryObject<Item> NICK_ESSENCE = ITEMS.register("nick_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICK_INGOT = ITEMS.register("nick_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICK_BOTTLE = ITEMS.register("nick_bottle",
            () -> new nickbottleItem(new Item.Properties()));

    public static final RegistryObject<ArmorItem> NICK_HELMET = ITEMS.register("nick_helmet",
            () -> new nickArmorItem(
                    ArmorMatInit.NICK,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> NICK_CHESTPLATE = ITEMS.register("nick_chestplate",
            () -> new nickArmorItem(
                    ArmorMatInit.NICK,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> NICK_PANTS = ITEMS.register("nick_pants",
            () -> new nickArmorItem(
                    ArmorMatInit.NICK,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<ArmorItem> NICK_BOOTS = ITEMS.register("nick_boots",
            () -> new nickArmorItem(
                    ArmorMatInit.NICK,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()));




    //Misc Items
    public static final RegistryObject<Item> BOYS_INGOT = ITEMS.register("boys_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BOYSORE = ITEMS.register("raw_boysore",
            () -> new Item(new Item.Properties()));






   //Items for blocks
    public static final RegistryObject<BlockItem> BOYS_ORE = ITEMS.register("boys_ore",
            () -> new BlockItem(BlockInit.BOYS_ORE.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> DEEPSLATE_BOYS_ORE = ITEMS.register("deepslate_boys_ore",
            () -> new BlockItem(BlockInit.DEEPSLATE_BOYS_ORE.get(),
                    new Item.Properties()));


    public static final RegistryObject<BlockItem> BOYS_BLOCK = ITEMS.register("boys_block",
            () -> new BlockItem(BlockInit.BOYS_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> CARTER_BLOCK = ITEMS.register("carter_block",
            () -> new BlockItem(BlockInit.CARTER_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> RILEY_BLOCK = ITEMS.register("riley_block",
            () -> new BlockItem(BlockInit.RILEY_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> AUSTIN_BLOCK = ITEMS.register("austin_block",
            () -> new BlockItem(BlockInit.AUSTIN_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> BRYAN_BLOCK = ITEMS.register("bryan_block",
            () -> new BlockItem(BlockInit.BRYAN_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> JACOB_BLOCK = ITEMS.register("jacob_block",
            () -> new BlockItem(BlockInit.JACOB_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> JAKE_BLOCK = ITEMS.register("jake_block",
            () -> new BlockItem(BlockInit.JAKE_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> JOHN_BLOCK = ITEMS.register("john_block",
            () -> new BlockItem(BlockInit.JOHN_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> EVAN_BLOCK = ITEMS.register("evan_block",
            () -> new BlockItem(BlockInit.EVAN_BLOCK.get(),
                    new Item.Properties()));

    public static final RegistryObject<BlockItem> NICK_BLOCK = ITEMS.register("nick_block",
            () -> new BlockItem(BlockInit.NICK_BLOCK.get(),
                    new Item.Properties()));


    public static final RegistryObject<ForgeSpawnEggItem> EXAMPLE_SPAWN_EGG = ITEMS.register("example_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.EXAMPLE_ENTITY, 0xD63A19, 0xBC601A, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> RILEY_SPAWN_EGG = (ITEMS.register("riley_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.RILEY_ENTITY, 0x1252DD, 0x8CA6DD, new Item.Properties())));

    public static final RegistryObject<ForgeSpawnEggItem> CARTER_SPAWN_EGG = ITEMS.register("carter_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.CARTER_ENTITY, 0x699440, 0xA2EA5F, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> AUSTIN_SPAWN_EGG = ITEMS.register("austin_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.AUSTIN_ENTITY, 0x9627b8, 0xdfd3e3, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> ANIMATED_SPAWN_EGG = ITEMS.register("animated_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.ANIMATED_ENTITY, 0x000000, 0xb802f5, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> BRYAN_SPAWN_EGG = ITEMS.register("bryan_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BRYAN_ENTITY, 0xd8e30e, 0xd6db76, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> JACOB_SPAWN_EGG = ITEMS.register("jacob_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.JACOB_ENTITY, 0xf2faf8, 0xb4b8b7, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> JAKE_SPAWN_EGG = ITEMS.register("jake_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.JAKE_ENTITY, 0xe85302, 0xed864e, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> JOHN_SPAWN_EGG = ITEMS.register("john_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.JOHN_ENTITY, 0x0d3802, 0x337522, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> EVAN_SPAWN_EGG = ITEMS.register("evan_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.EVAN_ENTITY, 0xf70abc, 0xf748cc, new Item.Properties()));

    public static final RegistryObject<ForgeSpawnEggItem> NICK_SPAWN_EGG = ITEMS.register("nick_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.NICK_ENTITY, 0x030202, 0x2b2a2a, new Item.Properties()));




}







   

