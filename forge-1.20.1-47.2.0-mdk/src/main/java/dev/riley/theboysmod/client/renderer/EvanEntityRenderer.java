package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.EvanEntityModel;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.entity.EvanEntity;
import dev.riley.theboysmod.entity.RileyEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EvanEntityRenderer extends MobRenderer<EvanEntity, EvanEntityModel> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "textures/entities/evan_entity.png");

    public EvanEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new EvanEntityModel(ctx.bakeLayer(EvanEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(EvanEntity entity) {
        return TEXTURE;
    }


}