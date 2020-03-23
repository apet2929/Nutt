package com.MoonJew.nutt.setup;

import com.MoonJew.nutt.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public ItemGroup itemGroup = new ItemGroup("nutt"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }

    };

    public void init() {

    }
}
