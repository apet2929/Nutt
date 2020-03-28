package com.moonjew.nutt.items;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class CrushedNuts extends Item {

    public CrushedNuts(String name) {
        super(new Item.Properties().group(setup.itemGroup));
        ModItems.ITEMS.register(name, () -> this);
    }
}
