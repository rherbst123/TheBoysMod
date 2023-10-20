package dev.riley.theboysmod.Init.moditems;

import dev.riley.theboysmod.Init.ItemInit;
import dev.riley.theboysmod.TheBoysMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class boysArmorMats implements ArmorMaterial {



    private final int[] durabilityforType;
    private final int[] defenceForType;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;
    private final int enchantability;

    public boysArmorMats(int[] durabilityforType,
                         int[] defenceForType,
                         int enchantability,
                         SoundEvent equipSound,
                         Supplier<Ingredient> repairMaterial,
                         String name,
                         float toughness,
                         float knockbackResistance) {


        this.enchantability = enchantability;
        this.durabilityforType = durabilityforType;
        this.defenceForType = defenceForType;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = TheBoysMod.MODID + ":" + name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return this.durabilityforType[(type.ordinal())];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.defenceForType[(type.ordinal())];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
