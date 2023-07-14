package site.rainbowx.nktweaker.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class NkConfig {
    public static String configFile = "nktweaker.toml";

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue FreeCamToggle;

    static {
        BUILDER.push("nktweaker");

        FreeCamToggle = BUILDER.comment("A toggle to the free camera mode.").define("Free camera switch",false);

        //val = BUILDER.comment("A toggle to the free camera mode.").defineInRange("test val",1f,1f,10f);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
