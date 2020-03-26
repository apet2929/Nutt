package com.moonjew.nutt.blocks;

import com.moonjew.nutt.items.ModItems;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {


    @ObjectHolder("nutt:firstblock")
    public static FirstBlock FIRSTBLOCK;
    @ObjectHolder("nutt:nutgrinder")
    public static NutGrinder NUTGRINDER;
    @ObjectHolder("nutt:nutgrinder")
    public static TileEntityType<NutGrinderTile> NUTGRINDER_TILE;
    @ObjectHolder("nutt:nutgrinder")
    public static ContainerType<NutGrinderContainer> NUTGRINDER_CONTAINER;
    @ObjectHolder("nutt:nutdryer")
    public static NutDryer NUTDRYER;



}

