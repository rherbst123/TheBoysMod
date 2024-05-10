package dev.riley.theboysmod.client.renderer;



import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.model.ExampleEntityModel;
import dev.riley.theboysmod.entity.ExampleEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ExampleEntityRenderer extends MobRenderer<ExampleEntity, ExampleEntityModel<ExampleEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TheBoysMod.MODID, "resources/textures/entity/example_entity.png");

    public ExampleEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new ExampleEntityModel<>(ctx.bakeLayer(ExampleEntityModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(ExampleEntity entity) {
        return TEXTURE;
    }
}