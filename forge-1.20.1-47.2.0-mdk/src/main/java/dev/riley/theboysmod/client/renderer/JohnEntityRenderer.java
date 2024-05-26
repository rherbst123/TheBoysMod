package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.JohnEntityModel;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.entity.JohnEntity;
import dev.riley.theboysmod.entity.RileyEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class JohnEntityRenderer extends MobRenderer<JohnEntity, JohnEntityModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/john_entity.png");

    public JohnEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new JohnEntityModel(ctx.bakeLayer(JohnEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(JohnEntity entity) {
        return TEXTURE;
    }


}