package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Nutt.MODID);
    @ObjectHolder("nutt:firstblock")
    public static final FirstBlock FIRSTBLOCK = new FirstBlock();
    @ObjectHolder("nutt:nutgrinder")
    public static final NutGrinder NUTGRINDER = new NutGrinder();
    @ObjectHolder("nutt:nutdryer")
    public static final NutDryer NUTDRYER = new NutDryer();
    @ObjectHolder("nutt:nutgrinder")
    public static TileEntityType<NutGrinderTile> NUTGRINDER_TILE;
    @ObjectHolder("nutt:nutgrinder")
    public static  ContainerType<NutGrinderContainer> NUTGRINDER_CONTAINER;

//    public static RegistryObject<FlowingFluidBlock> nutoilfluid_block = BLOCKS.register("nutoilfluid_flowing", () ->
//            new FlowingFluidBlock(nutoilfluid, Block.Properties.create(net.minecraft.block.material.Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops())
//    );



}

