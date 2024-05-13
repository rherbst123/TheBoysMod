package dev.riley.theboysmod.client.renderer;


import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.entity.CarterEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import dev.riley.theboysmod.client.model.CarterEntityModel;


public class CarterEntityRenderer extends MobRenderer<CarterEntity, CarterEntityModel<CarterEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/carter_entity.png");

    public CarterEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new CarterEntityModel<>(ctx.bakeLayer(CarterEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(CarterEntity entity) {
        return TEXTURE;
    }
}