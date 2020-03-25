package com.moonjew.nutt.setup;

import com.moonjew.nutt.blocks.ModBlocks;
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
