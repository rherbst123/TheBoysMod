package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.JakeEntityModel;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.entity.JakeEntity;
import dev.riley.theboysmod.entity.RileyEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class JakeEntityRenderer extends MobRenderer<JakeEntity, JakeEntityModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/jake_entity.png");

    public JakeEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new JakeEntityModel(ctx.bakeLayer(JakeEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(JakeEntity entity) {
        return TEXTURE;
    }


}