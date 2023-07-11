package site.rainbowx.nktweaker.mixin;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import site.rainbowx.nktweaker.NkTweaker;

@Mixin(Camera.class)
public abstract class CameraMixin {
    private static final Logger LOGGER = LogUtils.getLogger();

    @Inject(at = @At("HEAD"),method = "move")
    public void MoveInject(double p_90569_, double p_90570_, double p_90571_, CallbackInfo ci) {
        LOGGER.debug("debug:{}",ci.isCancellable());
        if(ci.isCancellable()) ci.cancel();
    }
    @Inject(at = @At("HEAD"), method = "setPosition(DDD)V")
    public void SetPosInject(double p_90585_, double p_90586_, double p_90587_, CallbackInfo ci) {
        LOGGER.debug("debug:{}",ci.isCancellable());
        if(ci.isCancellable()) ci.cancel();
    }
}
