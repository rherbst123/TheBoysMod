package dev.riley.theboysmod.Init;

import dev.riley.theboysmod.TheBoysMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


@Mod.EventBusSubscriber(modid = TheBoysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBoysMod.MODID);

    public static final List<Supplier<? extends ItemLike>> THE_BOYS_ITEMS = new ArrayList<>();
    public static final RegistryObject<CreativeModeTab> THE_BOYS_TAB = TABS.register("the_boys_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.the_boys_tab"))
                    .icon(ItemInit.BOYS_INGOT.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        //Essence
                        output.accept(ItemInit.CARTER_ESSENCE.get());
                        output.accept(ItemInit.RILEY_ESSENCE.get());
                        output.accept(ItemInit.AUSTIN_ESSENCE.get());
                        output.accept(ItemInit.BRYAN_ESSENCE.get());
                        output.accept(ItemInit.JACOB_ESSENCE.get());
                        output.accept(ItemInit.JAKE_ESSENCE.get());
                        output.accept(ItemInit.JOHN_ESSENCE.get());
                        output.accept(ItemInit.EVAN_ESSENCE.get());
                        output.accept(ItemInit.NICK_ESSENCE.get());

                        //Items
                        output.accept(ItemInit.KETAMINE.get());
                        output.accept(ItemInit.HOT_MEAT.get());
                        output.accept(ItemInit.BRYANS_BATON.get());
                        output.accept(ItemInit.NICK_BOTTLE.get());
                        output.accept(ItemInit.THE_NUG.get());
                        output.accept(ItemInit.THE_NUG.get());
                        output.accept(ItemInit.ZYN.get());
                        output.accept(ItemInit.THE_SKIN.get());
                        output.accept(ItemInit.EVAN_PICK.get());

                       //Ingots And Ore stuff
                        output.accept(ItemInit.CARTER_INGOT.get());
                        output.accept(ItemInit.RILEY_INGOT.get());
                        output.accept(ItemInit.AUSTIN_INGOT.get());
                        output.accept(ItemInit.BRYAN_INGOT.get());
                        output.accept(ItemInit.JACOB_INGOT.get());
                        output.accept(ItemInit.JAKE_INGOT.get());
                        output.accept(ItemInit.JOHN_INGOT.get());
                        output.accept(ItemInit.EVAN_INGOT.get());
                        output.accept(ItemInit.NICK_INGOT.get());
                        output.accept(ItemInit.BOYS_INGOT.get());
                        output.accept(ItemInit.RAW_BOYSORE.get());

                        //blocks
                        output.accept(ItemInit.BOYS_ORE.get());
                        output.accept(ItemInit.BOYS_BLOCK.get());
                        output.accept(ItemInit.CARTER_BLOCK.get());
                        output.accept(ItemInit.RILEY_BLOCK.get());
                        output.accept(ItemInit.AUSTIN_BLOCK.get());
                        output.accept(ItemInit.BRYAN_BLOCK.get());
                        output.accept(ItemInit.JACOB_BLOCK.get());
                        output.accept(ItemInit.JAKE_BLOCK.get());
                        output.accept(ItemInit.JOHN_BLOCK.get());
                        output.accept(ItemInit.EVAN_BLOCK.get());
                        output.accept(ItemInit.NICK_BLOCK.get());


                        //ARMOR
                        //Helmets
                        output.accept(ItemInit.CARTER_HELMET.get());
                        output.accept(ItemInit.RILEY_HELMET.get());
                        output.accept(ItemInit.AUSTIN_HELMET.get());
                        output.accept(ItemInit.BRYAN_HELMET.get());
                        output.accept(ItemInit.JACOB_HELMET.get());
                        output.accept(ItemInit.JAKE_HELMET.get());
                        output.accept(ItemInit.JOHN_HELMET.get());
                        output.accept(ItemInit.EVAN_HELMET.get());
                        output.accept(ItemInit.BRYAN_HELMET.get());
                        output.accept(ItemInit.NICK_HELMET.get());

                        //Chestplates
                        output.accept(ItemInit.CARTER_CHESTPLATE.get());
                        output.accept(ItemInit.RILEY_CHESTPLATE.get());
                        output.accept(ItemInit.AUSTIN_CHESTPLATE.get());
                        output.accept(ItemInit.BRYAN_CHESTPLATE.get());
                        output.accept(ItemInit.JACOB_CHESTPLATE.get());
                        output.accept(ItemInit.JAKE_CHESTPLATE.get());
                        output.accept(ItemInit.JOHN_CHESTPLATE.get());
                        output.accept(ItemInit.EVAN_CHESTPLATE.get());
                        output.accept(ItemInit.BRYAN_CHESTPLATE.get());
                        output.accept(ItemInit.NICK_CHESTPLATE.get());


                        //pants
                        output.accept(ItemInit.CARTER_PANTS.get());
                        output.accept(ItemInit.RILEY_PANTS.get());
                        output.accept(ItemInit.AUSTIN_PANTS.get());
                        output.accept(ItemInit.BRYAN_PANTS.get());
                        output.accept(ItemInit.JACOB_PANTS.get());
                        output.accept(ItemInit.JAKE_PANTS.get());
                        output.accept(ItemInit.JOHN_PANTS.get());
                        output.accept(ItemInit.EVAN_PANTS.get());
                        output.accept(ItemInit.BRYAN_PANTS.get());
                        output.accept(ItemInit.NICK_PANTS.get());



                        //BOOTS
                        output.accept(ItemInit.CARTER_BOOTS.get());
                        output.accept(ItemInit.RILEY_BOOTS.get());
                        output.accept(ItemInit.AUSTIN_BOOTS.get());
                        output.accept(ItemInit.BRYAN_BOOTS.get());
                        output.accept(ItemInit.JACOB_BOOTS.get());
                        output.accept(ItemInit.JAKE_BOOTS.get());
                        output.accept(ItemInit.JOHN_BOOTS.get());
                        output.accept(ItemInit.EVAN_BOOTS.get());
                        output.accept(ItemInit.BRYAN_BOOTS.get());
                        output.accept(ItemInit.NICK_BOOTS.get());










                    })

                    .build()
    );
    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        THE_BOYS_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){


    }



}
