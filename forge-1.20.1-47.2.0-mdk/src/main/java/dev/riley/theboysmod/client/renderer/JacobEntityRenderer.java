package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.JacobEntityModel;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.entity.JacobEntity;
import dev.riley.theboysmod.entity.RileyEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class JacobEntityRenderer extends MobRenderer<JacobEntity, JacobEntityModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/jacob_entity.png");

    public JacobEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new JacobEntityModel(ctx.bakeLayer(JacobEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(JacobEntity entity) {
        return TEXTURE;
    }


}