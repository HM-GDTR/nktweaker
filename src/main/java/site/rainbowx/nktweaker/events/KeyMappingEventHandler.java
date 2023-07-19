package site.rainbowx.nktweaker.events;

import com.mojang.logging.LogUtils;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import site.rainbowx.nktweaker.Reference;
import site.rainbowx.nktweaker.config.HotKeys;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeyMappingEventHandler extends KeyMapping {
    private static final Logger LOGGER = LogUtils.getLogger();
    public KeyMappingEventHandler(String description, int keyCode, String category) {
        super(String.format("key.%s.%s", Reference.MOD_ID,description),keyCode,category);
    }
    @SubscribeEvent
    public static void onRegistingKeys(RegisterKeyMappingsEvent event) {
        // 注册切换灵魂出窍键位
        LOGGER.debug("Key registration starting");
        event.register(HotKeys.KEY_TOGGLE);
        LOGGER.debug("Key registration completed");
    }
}
