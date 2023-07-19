package site.rainbowx.nktweaker.events;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import site.rainbowx.nktweaker.Reference;
import site.rainbowx.nktweaker.config.HotKeys;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KeyEventHandler {
    private static final Logger LOGGER = LogUtils.getLogger();
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void keyPress(InputEvent.Key event) {
        if(Minecraft.getInstance().screen==null) {
            if(event.getKey() == HotKeys.KEY_TOGGLE.getKey().getValue()) {
                // 0是按下,1是松开
                if(event.getAction() == 0) {
                    Player player = Minecraft.getInstance().player;
                    LOGGER.debug("Key toggle is pressed.");

                }
            }
        }
    }
}
