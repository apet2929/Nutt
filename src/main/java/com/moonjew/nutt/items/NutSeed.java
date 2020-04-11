package com.moonjew.nutt.items;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class NutSeed extends BlockItem {

    public NutSeed(Block block, String name) {
        super(block, prop());
        ModItems.ITEMS.register(name, () -> this);
    }

    @Override public String getTranslationKey(){
        return this.getDefaultTranslationKey();
    }

    private static Properties prop() {
        return new Item.Properties().group(setup.itemGroup);
    }
}
