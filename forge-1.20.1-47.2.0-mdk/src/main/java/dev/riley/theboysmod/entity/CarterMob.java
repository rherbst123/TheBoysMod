package dev.riley.theboysmod.entity;

import dev.riley.theboysmod.Init.EntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import org.jetbrains.annotations.Nullable;

public class CarterMob extends Animal {
    public CarterMob(EntityType<CarterMob> type, Level level) {
        super(type, level);
    }

    public CarterMob(Level level, double x, double y, double z){
        this(EntityInit.CARTER_MOB.get(), level);
        setPos(x,y,z);
    }

    public CarterMob(Level level, BlockPos position){
        this(level, position.getX(), position.getY(), position.getZ());
    }



    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return new CarterMob(level, this.blockPosition());
    }

    @Override
    protected void registerGoals() {
       this.goalSelector.addGoal(0, new LookAtPlayerGoal(this, Player.class, 8.0f));
       this.goalSelector.addGoal(1, new PanicGoal(this,  1.25D));

    }

    public static boolean canSpawn(EntityType<CarterMob> entityType, LevelAccessor level, MobSpawnType spawnType, BlockPos position, RandomSource randomSource){
        return Animal.checkAnimalSpawnRules(entityType, level, spawnType, position, randomSource);
    }

}
