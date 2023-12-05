package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.entity.CarterMob;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class CarterMobRenderer extends HumanoidMobRenderer<CarterMob, CarterMobModel<CarterMob>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(TheBoysMod.MODID, "textures/entity/carter_mob.png");

    public CarterMobRenderer(EntityRendererProvider.Context ctx) {
        //nul= texture 3rd one is shadow size
        super(ctx, new CarterMobModel(ctx.bakeLayer(CarterMobModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(CarterMob carter) {
        return null;
    }
}
