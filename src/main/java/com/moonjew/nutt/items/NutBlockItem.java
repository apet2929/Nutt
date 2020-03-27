package com.moonjew.nutt.items;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


import static com.moonjew.nutt.Nutt.setup;

public class NutBlockItem extends BlockItem {
    public NutBlockItem(Block block, String name){
        super(block, prop());
        ModItems.ITEMS.register(name, () -> this);
    }
    private static Properties prop() {
        return new Item.Properties().group(setup.itemGroup);
    }
}
