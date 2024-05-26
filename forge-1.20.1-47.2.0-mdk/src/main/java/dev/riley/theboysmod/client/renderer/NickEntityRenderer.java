package dev.riley.theboysmod.client.renderer;

import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.NickEntityModel;
import dev.riley.theboysmod.client.model.RileyEntityModel;
import dev.riley.theboysmod.entity.NickEntity;
import dev.riley.theboysmod.entity.RileyEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NickEntityRenderer extends MobRenderer<NickEntity, NickEntityModel>

    {
        private static final ResourceLocation TEXTURE =
                new ResourceLocation(TheBoysMod.MODID, "textures/entities/nick_entity.png");

    public NickEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new NickEntityModel(ctx.bakeLayer(NickEntityModel.LAYER_LOCATION)), 1.0f);
    }

        @Override
        public ResourceLocation getTextureLocation(NickEntity entity) {
        return TEXTURE;
    }


    }