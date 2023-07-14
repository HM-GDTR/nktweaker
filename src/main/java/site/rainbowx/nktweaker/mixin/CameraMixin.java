package site.rainbowx.nktweaker.mixin;

import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.material.FogType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Camera.class)
public class CameraMixin  {

    @Inject(method = "setup", at = @At("HEAD"))
    public void injectSetup(BlockGetter area, Entity newFocusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {

    }

    // Removes the submersion overlay when underwater, in lava, or powdered snow.
    @Inject(method = "getFluidInCamera", at = @At("HEAD"))
    public void onGetSubmersionType(CallbackInfoReturnable<FogType> cir) {

    }
}
