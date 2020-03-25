package com.MoonJew.nutt.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("nutt:firstblock")
    public static FirstBlock FIRSTBLOCK;
    @ObjectHolder("nutt:nutgrinder")
    public static NutGrinder NUTGRINDER;
    @ObjectHolder("nutt:nutgrinder")
    public static TileEntityType<NutGrinderTile> NUTGRINDER_TILE;
    @ObjectHolder("nutt:nutdryer")
    public static NutDryer NUTDRYER;

}
