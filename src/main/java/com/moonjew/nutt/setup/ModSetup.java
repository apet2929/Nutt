package com.moonjew.nutt.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;

public class ModSetup {
    public static final NonNullList<ItemStack> extraItemGroupItems = NonNullList.create();
    public static final ItemGroup itemGroup = new ItemGroup("nuttItemGroup"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.DIAMOND);
        }

        @Override
        public void fill(NonNullList<ItemStack> list) {
            super.fill(list);

            list.addAll(extraItemGroupItems);
        }
    };

    public void init() {

        System.out.println("init() called (ModSetup.java)");
    }
}
