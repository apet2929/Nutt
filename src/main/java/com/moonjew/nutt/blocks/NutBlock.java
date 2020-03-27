package com.moonjew.nutt.blocks;

import com.moonjew.nutt.items.NutBlockItem;
import com.moonjew.nutt.reg.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class NutBlock extends Block {

    private final NutBlockItem ITEM;

    public NutBlock(String name, Material materialIn) {
        super(prop(materialIn));
        ModBlocks.BLOCKS.register(name, () -> this);
        ITEM = new NutBlockItem(this, name);
    }

    private static Properties prop(Material materialIn){
        return Properties.create(materialIn);
    }
}