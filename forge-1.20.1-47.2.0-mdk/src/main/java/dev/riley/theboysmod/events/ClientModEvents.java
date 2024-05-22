package dev.riley.theboysmod.events;

import dev.riley.theboysmod.Init.EntityInit;
import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.*;
import dev.riley.theboysmod.client.renderer.ExampleEntityRenderer;
import dev.riley.theboysmod.client.renderer.RileyEntityRenderer;
import dev.riley.theboysmod.client.renderer.CarterEntityRenderer;
import dev.riley.theboysmod.client.renderer.AustinEntityRenderer;
import dev.riley.theboysmod.client.renderer.BryanEntityRenderer;
import dev.riley.theboysmod.entity.AnimatedEntity;
import dev.riley.theboysmod.entity.BryanEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import dev.riley.theboysmod.client.renderer.AnimatedEntityRenderer;

@Mod.EventBusSubscriber(modid = TheBoysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntityRenderer::new);

        event.registerEntityRenderer(EntityInit.CARTER_ENTITY.get(), CarterEntityRenderer::new);

        event.registerEntityRenderer(EntityInit.RILEY_ENTITY.get(), RileyEntityRenderer::new );

        event.registerEntityRenderer(EntityInit.AUSTIN_ENTITY.get(), AustinEntityRenderer::new );

        event.registerEntityRenderer(EntityInit.ANIMATED_ENTITY.get(), AnimatedEntityRenderer::new );

        event.registerEntityRenderer(EntityInit.BRYAN_ENTITY.get(), BryanEntityRenderer::new );


    }



    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ExampleEntityModel.LAYER_LOCATION, ExampleEntityModel::createBodyLayer);

        event.registerLayerDefinition(AnimatedEntity.LAYER_LOCATION, AnimatedEntityModel::createBodyLayer);

        event.registerLayerDefinition(RileyEntityModel.LAYER_LOCATION, RileyEntityModel::createBodyLayer);

        event.registerLayerDefinition(CarterEntityModel.LAYER_LOCATION, CarterEntityModel::createBodyLayer);

        event.registerLayerDefinition(AustinEntityModel.LAYER_LOCATION, AustinEntityModel::createBodyLayer);

        event.registerLayerDefinition(BryanEntityModel.LAYER_LOCATION, BryanEntityModel::createBodyLayer);
    }
}