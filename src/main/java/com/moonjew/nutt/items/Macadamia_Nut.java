package com.moonjew.nutt.items;

import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class Macadamia_Nut extends Item {
    public Macadamia_Nut(){
        super(new Item.Properties()
                .food(ModFoods.macadamia)
                .group(setup.itemGroup)

        );
        setRegistryName("macadamia_nut");

    }
}
