package com.moonjew.nutt.blocks;

import com.moonjew.nutt.items.NutBlockItem;
import com.moonjew.nutt.reg.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class AbstractTeleporterBlock extends Block {

    private static BlockPos paired;

    public AbstractTeleporterBlock(Block.Properties properties, String name) {
        super(properties);
        ModBlocks.BLOCKS.register(name, () -> this);
        NutBlockItem ITEM = new NutBlockItem(this, name);
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
