package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.blocks.*;
import com.moonjew.nutt.blocks.container.NutBreederContainer;
import com.moonjew.nutt.blocks.container.NutDryerContainer;
import com.moonjew.nutt.blocks.container.NutGrinderContainer;
import com.moonjew.nutt.blocks.tile.NutBreederTile;
import com.moonjew.nutt.blocks.tile.NutDryerTile;
import com.moonjew.nutt.blocks.tile.NutGrinderTile;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Nutt.MODID);

    @ObjectHolder("nutt:firstblock")
    public static final FirstBlock FIRSTBLOCK = new FirstBlock();

    @ObjectHolder("nutt:nutgrinder")
    public static final NutGrinder NUTGRINDER = new NutGrinder();
    @ObjectHolder("nutt:nutgrinder")
    public static TileEntityType<NutGrinderTile> NUTGRINDER_TILE;
    @ObjectHolder("nutt:nutgrinder")
    public static  ContainerType<NutGrinderContainer> NUTGRINDER_CONTAINER;

    @ObjectHolder("nutt:nutdryer")
    public static final NutDryer NUTDRYER = new NutDryer();
    @ObjectHolder("nutt:nutdryer")
    public static TileEntityType<NutDryerTile> NUTDRYER_TILE;
    @ObjectHolder("nutt:nutdryer")
    public static ContainerType<NutDryerContainer> NUTDRYER_CONTAINER;

    @ObjectHolder("nutt:nutbreeder")
    public static final NutBreeder NUTBREEDER = new NutBreeder();
    @ObjectHolder("nutt:nutbreeder")
    public static TileEntityType<NutBreederTile> NUTBREEDER_TILE;
    @ObjectHolder("nutt:nutbreeder")
    public static ContainerType<NutBreederContainer> NUTBREEDER_CONTAINER;
    @ObjectHolder("nutt:teleporter")
    public static TeleporterBlock TELEPORTER = new TeleporterBlock();
    @ObjectHolder("nutt:home")
    public static HomeBlock HOME = new HomeBlock();





}

