package com.moonjew.nutt.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class AbstractTeleporterBlock extends Block {

    private static BlockPos paired;

    public AbstractTeleporterBlock(Block.Properties properties, String name) {
        super(properties);
        System.out.println("AbstractTeleporterBlock instantiated (HomeBlock.java)");
    }

    public void setPaired(BlockPos pos) {
        paired = new BlockPos(pos);
        System.out.println("The paired block is " + paired);
    }
    public BlockPos getPaired(){
        return paired;
    }
}
