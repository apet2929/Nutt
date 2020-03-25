package com.moonjew.nutt.items;

import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;


public class Pistachio_Nut extends Item {
    public Pistachio_Nut(){
        super(new Item.Properties()
            .food(ModFoods.pistachio)
            .group(setup.itemGroup)
        );
        setRegistryName("pistachio_nut");

    }

}
