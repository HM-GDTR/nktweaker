package site.rainbowx.nktweaker.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class ConfigScreen extends Screen {
    public static int xSize = 256;
    public static int ySize = 197;

    private byte page;

    private EditBox editbox;

    public ConfigScreen() {
        super(Component.translatable("gui.nktweaker.config"));
    }

    @Override
    protected void init() {
        super.init();

        // Add widgets and precomputed values
        editbox = new EditBox(font,width/2+35,33,85,17,Component.empty());
    }

    @Override
    public void render(@NotNull PoseStack pose, int mouseX, int mouseY, float partialTick) {
        // Background is typically rendered first
        this.renderBackground(pose);

        // Render things here before widgets (background textures)

        // Then the widgets if this is a direct child of the Screen
        super.render(pose, mouseX, mouseY, partialTick);

        // Render things after widgets (tooltips)

        super.addRenderableWidget(editbox);

        editbox.render(pose,mouseX,mouseY,partialTick);
    }
}
