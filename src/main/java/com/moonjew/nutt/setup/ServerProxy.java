package com.moonjew.nutt.setup;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only use this on the client!");
    }

    @Override
    public void init() {
        System.out.println("init() called (ServerProxy.java)");
    }

    @Override
    public PlayerEntity getClientPlayer() {
        throw new IllegalStateException("Only use this on the client!");
    }
}
