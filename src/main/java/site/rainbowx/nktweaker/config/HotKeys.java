package site.rainbowx.nktweaker.config;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class HotKeys {
    public static final KeyMapping KEY_TOGGLE = new KeyMapping("key.nktweaker.freecam.toggle", KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category.nktweaker.freecam");
}
