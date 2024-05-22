package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.AustinEntityModel;
import dev.riley.theboysmod.client.model.CarterEntityModel;
import dev.riley.theboysmod.entity.AustinEntity;
import dev.riley.theboysmod.entity.CarterEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AustinEntityRenderer extends MobRenderer<AustinEntity, AustinEntityModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/austin_entity.png");

    public AustinEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new AustinEntityModel(ctx.bakeLayer(AustinEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(AustinEntity entity) {
        return TEXTURE;
    }


}