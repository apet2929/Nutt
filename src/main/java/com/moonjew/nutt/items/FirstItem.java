package com.moonjew.nutt.items;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class FirstItem extends Item {
    public FirstItem(){
        super(new Item.Properties()
                .maxStackSize(1)
                .maxDamage(10)
                .group(setup.itemGroup)
        );
        ModItems.ITEMS.register("firstitem", () -> this);
    }
}
