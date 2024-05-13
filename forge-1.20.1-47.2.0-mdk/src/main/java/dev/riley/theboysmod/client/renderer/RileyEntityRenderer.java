package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.ExampleEntityModel;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.entity.RileyEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RileyEntityRenderer extends MobRenderer<RileyEntity, RileyEntityModel<RileyEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/riley_entity.png");

    public RileyEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new RileyEntityModel<>(ctx.bakeLayer(RileyEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(RileyEntity entity) {
        return TEXTURE;
    }


}