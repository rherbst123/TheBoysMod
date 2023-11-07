package dev.riley.theboysmod.Init.moditems.armoritems;

import com.google.common.collect.ImmutableMap;
import com.ibm.icu.impl.locale.XCldrStub;
import dev.riley.theboysmod.Init.ArmorMatInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


import javax.annotation.concurrent.Immutable;
import java.util.Map;

public class carterArmorItem extends ArmorItem {
    // This map holds the armor material and the corresponding mob effect instance
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ArmorMatInit.CARTER, new MobEffectInstance(MobEffects.HEALTH_BOOST,
                            500,1,true,false,false)).build();

    // Initializes the armor item with the specified material, type, and properties
    public carterArmorItem(ArmorMaterial material, Type type, Properties properties){
        super(material,type,properties);
    }

    // This method is called every tick while the item is in the player's inventory
    @Override
    public void onInventoryTick(ItemStack stack, Level world, Player player, int slotIndex, int selectedIndex) {
        // If the world is not the client side (i.e. the server)
        if(!world.isClientSide()) {
            // If the player has a full suit of armor on
            if(hasFullSuitOfArmorOn(player)) {
                // Evaluate the armor effects
                evaluateArmorEffects(player);
            }
        }
    }

    // This method evaluates the armor effects and applies them to the player if necessary
    private void evaluateArmorEffects(Player player) {
        // For each entry in the MATERIAL_TO_EFFECT_MAP map
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            // Get the armor material and the corresponding mob effect instance from the entry
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            // If the player has the correct armor on for the armor material
            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                // Add the status effect for the armor material to the player
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    // This method adds the status effect for the armor material to the player if they don't already have it
    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        // Check if the player already has the status effect
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        // If the player has the correct armor on and doesn't already have the status effect
        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            // Add the status effect to the player
            player.addEffect(new MobEffectInstance(mapStatusEffect));
        }
    }

    // This method checks if the player has a full suit of armor on
    private boolean hasFullSuitOfArmorOn(Player player) {
        // Get the boots, leggings, breastplate, and helmet from the player's inventory
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        // Return true if all four armor slots are not empty
        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    // This method checks if the player has the correct armor on for the specified armor material
    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());

        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}

