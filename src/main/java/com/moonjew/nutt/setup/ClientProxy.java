package com.moonjew.nutt.setup;

import com.moonjew.nutt.blocks.screen.NutBreederScreen;
import com.moonjew.nutt.blocks.screen.NutDryerScreen;
import com.moonjew.nutt.reg.ModBlocks;
import com.moonjew.nutt.blocks.screen.NutGrinderScreen;
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
        ScreenManager.registerFactory(ModBlocks.NUTDRYER_CONTAINER, NutDryerScreen::new); //Couples Container to GUI on client
        ScreenManager.registerFactory(ModBlocks.NUTBREEDER_CONTAINER, NutBreederScreen::new); //Couples Container to GUI on client
        System.out.println("init() called (ClientProxy.java)");
    }

    @Override
    public PlayerEntity getClientPlayer() {
        System.out.println("getClientPlayer() called (ClientProxy.java)");
        return Minecraft.getInstance().player;
    }
}
//Fuck you github