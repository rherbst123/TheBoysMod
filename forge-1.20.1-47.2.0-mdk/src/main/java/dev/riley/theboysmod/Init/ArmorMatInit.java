package dev.riley.theboysmod.Init;

import dev.riley.theboysmod.Init.moditems.boysArmorMats;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMatInit {
    public static final boysArmorMats CARTER = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{5,10,8,7},
            20,
            SoundEvents.ARMOR_EQUIP_CHAIN,
            () -> Ingredient.of(ItemInit.CARTER_INGOT::get),
            "carter",
            0.25f,
            0.5f
    );
    public static final boysArmorMats RILEY = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{5,10,9,3},
            20,
            SoundEvents.CAT_HISS,
            () -> Ingredient.of(ItemInit.RILEY_INGOT::get),
            "riley",
            0.25f,
            0.5f
    );

    public static final boysArmorMats AUSTIN = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{11,16,15,13},
            20,
            SoundEvents.ANVIL_LAND,
            () -> Ingredient.of(ItemInit.AUSTIN_INGOT::get),
            "austin",
            0.25f,
            0.5f
    );

    public static final boysArmorMats BRYAN = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{11,16,15,13},
            20,
            SoundEvents.ANVIL_LAND,
            () -> Ingredient.of(ItemInit.BRYAN_INGOT::get),
            "bryan",
            0.25f,
            0.5f
    );



    public static final boysArmorMats JACOB = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{4,10,7,4},
            20,
            SoundEvents.FROG_HURT,
            () -> Ingredient.of(ItemInit.JACOB_INGOT::get),
            "jacob",
            0.25f,
            0.5f
    );

    public static final boysArmorMats JAKE = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{12,17,16,14},
            20,
            SoundEvents.FROG_TONGUE,
            () -> Ingredient.of(ItemInit.JAKE_INGOT::get),
            "jake",
            0.25f,
            0.5f
    );

    public static final boysArmorMats JOHN = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{9,14,13,11},
            20,
            SoundEvents.ARMOR_EQUIP_IRON,
            () -> Ingredient.of(ItemInit.JOHN_INGOT::get),
            "john",
            0.25f,
            0.5f
    );

    public static final boysArmorMats EVAN = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{5,12,8,6},
            20,
            SoundEvents.ANVIL_LAND,
            () -> Ingredient.of(ItemInit.EVAN_INGOT::get),
            "evan",
            0.25f,
            0.5f
    );

    public static final boysArmorMats NICK = new boysArmorMats(
            new int[]{500,1200,600,400},
            new int[]{8,14,10,9},
            20,
            SoundEvents.PIG_DEATH,
            () -> Ingredient.of(ItemInit.NICK_INGOT::get),
            "nick",
            0.25f,
            0.5f
    );

}
