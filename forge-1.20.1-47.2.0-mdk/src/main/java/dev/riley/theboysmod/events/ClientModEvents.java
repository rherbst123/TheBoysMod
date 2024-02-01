package dev.riley.theboysmod.events;


import dev.riley.theboysmod.Init.EntityInit;
import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.renderer.CarterMobRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheBoysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(EntityInit.CARTER_MOB.get(), CarterMobRenderer::new);
    }

    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CarterMobModel.LAYER_LOCATION, CarterMobModel::createBodyLayer);

    }
}
