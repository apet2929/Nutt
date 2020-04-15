package com.moonjew.nutt.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class NutBlock extends Block {


    public NutBlock(Material materialIn) {
        super(prop(materialIn));

    }

    private static Properties prop(Material materialIn){
        return Properties.create(materialIn);
    }
}