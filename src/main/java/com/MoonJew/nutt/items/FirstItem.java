package com.MoonJew.nutt.items;

import net.minecraft.item.Item;

import static com.MoonJew.nutt.Nutt.setup;

public class FirstItem extends Item {
    public FirstItem(){
        super(new Item.Properties()
                .maxStackSize(1)
                .maxDamage(10)
                .group(setup.itemGroup)
        );
        setRegistryName("firstitem");
    }
}
