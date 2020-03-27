package com.moonjew.nutt.setup;

import com.moonjew.nutt.reg.ModBlocks;
import com.moonjew.nutt.blocks.NutGrinderScreen;
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
        System.out.println("init() called (ClientProxy.java)");
    }

    @Override
    public PlayerEntity getClientPlayer() {
        System.out.println("getClientPlayer() called (ClientProxy.java)");
        return Minecraft.getInstance().player;
    }
}
//Fuck you github