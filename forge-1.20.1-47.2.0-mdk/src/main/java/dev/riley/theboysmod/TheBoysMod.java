package dev.riley.theboysmod;


import dev.riley.theboysmod.Init.BlockInit;
import dev.riley.theboysmod.Init.CreativeTabInit;
import dev.riley.theboysmod.Init.ItemInit;
import dev.riley.theboysmod.Init.SoundInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(TheBoysMod.MODID)
public class TheBoysMod {
    public static final String MODID = "theboysmod";



    public TheBoysMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        SoundInit.register(bus);

    }

}