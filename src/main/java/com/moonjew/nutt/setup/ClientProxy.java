package com.moonjew.nutt.setup;

import com.moonjew.nutt.blocks.screen.NutBreederScreen;
import com.moonjew.nutt.blocks.screen.NutDryerScreen;
import com.moonjew.nutt.blocks.screen.NutGrinderScreen;
import com.moonjew.nutt.reg.ModContainerTypes;
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
        ScreenManager.registerFactory(ModContainerTypes.NUTGRINDER_CONTAINER.get(), NutGrinderScreen::new); //Couples Container to GUI on client
        ScreenManager.registerFactory(ModContainerTypes.NUTDRYER_CONTAINER.get(), NutDryerScreen::new); //Couples Container to GUI on client
        ScreenManager.registerFactory(ModContainerTypes.NUTBREEDER_CONTAINER.get(), NutBreederScreen::new); //Couples Container to GUI on client
        System.out.println("init() called (ClientProxy.java)");
    }

    @Override
    public PlayerEntity getClientPlayer() {
        System.out.println("getClientPlayer() called (ClientProxy.java)");
        return Minecraft.getInstance().player;
    }
}
//Fuck you github