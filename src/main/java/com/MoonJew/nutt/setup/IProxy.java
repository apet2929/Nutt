package com.MoonJew.nutt.setup;

import net.minecraft.world.World;

public interface IProxy {
    World getClientWorld();
    void init();
}
