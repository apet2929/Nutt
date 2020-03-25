package com.MoonJew.nutt.setup;

import com.MoonJew.nutt.blocks.ModBlocks;
import com.MoonJew.nutt.blocks.NutGrinderScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{
    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public void init() {
        ScreenManager.registerFactory(ModBlocks.NUTGRINDER_CONTAINER, NutGrinderScreen::new); //Couples Container to GUI on client
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
