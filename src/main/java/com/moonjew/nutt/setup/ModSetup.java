package com.moonjew.nutt.setup;

import com.moonjew.nutt.blocks.ModBlocks;
import com.moonjew.nutt.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ModSetup {
    public static final NonNullList<ItemStack> extraItemGroupItems = NonNullList.create();
    public static final ItemGroup itemGroup = new ItemGroup("nutt"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.PEANUT_NUT);
        }

        @Override
        public void fill(NonNullList<ItemStack> list) {
            super.fill(list);

            list.addAll(extraItemGroupItems);
        }
    };
    //In en_us.json

    
    public void init() {
        System.out.println("init() called (ModSetup.java)");
    }
}
