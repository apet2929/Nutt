package com.MoonJew.nutt.items;

import net.minecraft.item.Item;

import static com.MoonJew.nutt.Nutt.setup;

public class Almond_Nut extends Item {
    public Almond_Nut(){
        super(new Item.Properties()
                .food(ModFoods.almond)
                .group(setup.itemGroup)
        );
        setRegistryName("almond_nut");
    }
}
