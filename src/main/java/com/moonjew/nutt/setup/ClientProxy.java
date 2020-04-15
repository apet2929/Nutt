package com.moonjew.nutt.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{
    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public void init() {

        System.out.println("init() called (ClientProxy.java)");
    }

    @Override
    public PlayerEntity getClientPlayer() {
        System.out.println("getClientPlayer() called (ClientProxy.java)");
        return Minecraft.getInstance().player;
    }
}
//Fuck you github