package com.MoonJew.nutt.items;

import net.minecraft.item.Item;

import static com.MoonJew.nutt.Nutt.modFoods;
import static com.MoonJew.nutt.Nutt.setup;


public class Pistachio_Nut extends Item {
    public Pistachio_Nut(){
        super(new Item.Properties()
            .food(ModFoods.pistachio)
            .group(setup.itemGroup)
        );
        setRegistryName("pistachio_nut");

    }

}
