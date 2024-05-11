package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.AnimatedEntityModel;
import dev.riley.theboysmod.entity.AnimatedEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AnimatedEntityRenderer extends MobRenderer<AnimatedEntity, AnimatedEntityModel> {
    public static final ResourceLocation TEXTURE
            = new ResourceLocation(TheBoysMod.MODID, "textures/entity/animated_entity.png");

    public AnimatedEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new AnimatedEntityModel(ctx.bakeLayer(AnimatedEntityModel.LAYER_LOCATION)), 0.25F);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull AnimatedEntity entity) {
        return TEXTURE;
    }
}
