package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.AustinEntityModel;
import dev.riley.theboysmod.client.model.BryanEntityModel;
import dev.riley.theboysmod.entity.AustinEntity;
import dev.riley.theboysmod.entity.BryanEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BryanEntityRenderer extends MobRenderer<BryanEntity, BryanEntityModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/bryan_entity.png");

    public BryanEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new BryanEntityModel(ctx.bakeLayer(AustinEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(BryanEntity entity) {
        return TEXTURE;
    }


}