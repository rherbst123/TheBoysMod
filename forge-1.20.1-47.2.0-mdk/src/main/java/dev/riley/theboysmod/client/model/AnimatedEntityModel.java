package dev.riley.theboysmod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.riley.theboysmod.TheBoysMod;
import dev.riley.theboysmod.client.animation.AnimatedEntityAnimation;
import dev.riley.theboysmod.entity.AnimatedEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AnimatedEntityModel extends HierarchicalModel<AnimatedEntity> {
        public static final ModelLayerLocation LAYER_LOCATION =
                new ModelLayerLocation(new ResourceLocation(TheBoysMod.MODID, "animated_entity"), "main");



    private final ModelParts parts;

    public AnimatedEntityModel(ModelPart root) {
        ModelPart body = root.getChild("body");
        ModelPart head = body.getChild("head");

        this.parts = new ModelParts(body, head);
    }

    public static LayerDefinition createBodyLayer() {
        var meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();

        PartDefinition body = partDefinition.addOrReplaceChild("body",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
                                new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 23.0F, 0.0F));

        body.addOrReplaceChild("head",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-3.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F,
                                new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.0F, 0.0F));

        return LayerDefinition.create(meshDefinition, 16, 16);
    }

    @Override
    public void setupAnim(@NotNull AnimatedEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        root().getAllParts().forEach(ModelPart::resetPose);
        animate(entity.idleAnimationState, AnimatedEntityAnimation.IDLE, ageInTicks);
        // animate(entity.attackAnimationState, ExampleAnimatedEntityAnimation.ATTACK, ageInTicks);
        // etc...

        if(!entity.isInWaterOrBubble()) {
            animateWalk(AnimatedEntityAnimation.WALK, limbSwing, limbSwingAmount, 1.0F, 2.5F);
        } else {
            // TODO: Swim animation
        }
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.parts.body().render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return this.parts.body();
    }

    record ModelParts(ModelPart body, ModelPart head) {}
}
