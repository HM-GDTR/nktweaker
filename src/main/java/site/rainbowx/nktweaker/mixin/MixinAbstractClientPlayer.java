package site.rainbowx.nktweaker.mixin;

import net.minecraft.client.player.AbstractClientPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayer.class)
public class MixinAbstractClientPlayer {
    @Inject(at = @At("HEAD"), method = "isSpectator", cancellable = true)
    public void InjectIsSpectator(CallbackInfoReturnable<Boolean> cir) {

    }
}
