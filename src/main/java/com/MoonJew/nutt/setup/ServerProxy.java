package com.MoonJew.nutt.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only use this on the client!");
    }

    @Override
    public void init() {

    }
}
