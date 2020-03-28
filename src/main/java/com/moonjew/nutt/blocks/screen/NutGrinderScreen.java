package com.moonjew.nutt.blocks.screen;

import com.moonjew.nutt.Nutt;
import com.mojang.blaze3d.platform.GlStateManager;
import com.moonjew.nutt.blocks.container.NutGrinderContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class NutGrinderScreen extends ContainerScreen<NutGrinderContainer> {

    private ResourceLocation GUI = new ResourceLocation(Nutt.MODID ,"textures/gui/nutgrinder_gui.png");

    public NutGrinderScreen(NutGrinderContainer container, PlayerInventory inv, ITextComponent name) {
        super(container, inv, name);
        System.out.println("Nut Grinder Screen instantiated (NutGrinderScreen.java)");
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

    }

    /**
     * Draws the background layer of this container (behind the items).
     */
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F); //color4f() => func_227702_d_()
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);
    }
}
//Fuck you github