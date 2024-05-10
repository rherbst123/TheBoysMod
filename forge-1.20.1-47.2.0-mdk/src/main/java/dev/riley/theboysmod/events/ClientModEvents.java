package dev.riley.theboysmod.events;

import dev.riley.theboysmod.Init.EntityInit;
import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.ExampleEntityModel;
import dev.riley.theboysmod.client.renderer.CarterEntityRenderer;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.client.renderer.ExampleEntityRenderer;
import dev.riley.theboysmod.client.renderer.RileyEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.swing.text.html.parser.Entity;

@Mod.EventBusSubscriber(modid = TheBoysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntityRenderer::new);

       // event.registerEntityRenderer(EntityInit.CARTER_ENTITY.get(), CarterEntityRenderer::new);

        event.registerEntityRenderer(EntityInit.RILEY_ENTITY.get(), RileyEntityRenderer::new );
    }



    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ExampleEntityModel.LAYER_LOCATION, ExampleEntityModel::createBodyLayer);
        event.registerLayerDefinition(RileyEntityModel.LAYER_LOCATION, RileyEntityModel::createBodyLayer);
    }
}