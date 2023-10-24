package dev.riley.theboysmod.Init.moditems;

import com.google.common.eventbus.Subscribe;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.WorldData;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class thepenItem extends Item {

    private int durability = 5;
    public thepenItem(Properties properties) {

        super(properties);
    }

//    @Override
//    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
//        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
//
//
//                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 25,2));
//                player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 25,3));
//                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 25,6));
//
//                player.getCooldowns().addCooldown(this, 20);
//
//            if (player != null) {
//                player.getItemInHand(InteractionHand.MAIN_HAND).hurtAndBreak(1, player, (p_41303_) -> {
//                    p_41303_.broadcastBreakEvent(.getHand());
//                });
//            }
//
//        }
//
//        return super.use(level, player, hand);
//    }

}