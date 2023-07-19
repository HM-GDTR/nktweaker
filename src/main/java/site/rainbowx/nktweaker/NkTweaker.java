package site.rainbowx.nktweaker;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import site.rainbowx.nktweaker.config.NkConfig;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class NkTweaker {

    // Define mod id in a common place for everything to reference
    public static final String MODID = Reference.MOD_ID;
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public NkTweaker() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // 将配置文件注册
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, NkConfig.SPEC, NkConfig.configFile);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }
}
