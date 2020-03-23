package com.MoonJew.nutt.items;

import net.minecraft.item.Item;

import static com.MoonJew.nutt.Nutt.setup;

public class Cashew_Nut extends Item {
    public Cashew_Nut(){
        super(new Item.Properties()
                .food(ModFoods.cashew)
                .group(setup.itemGroup)
        );
        setRegistryName("cashew_nut");
    }
}

