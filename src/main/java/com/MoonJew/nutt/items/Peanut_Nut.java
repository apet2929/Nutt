package com.MoonJew.nutt.items;

import net.minecraft.item.Item;

import static com.MoonJew.nutt.Nutt.modFoods;
import static com.MoonJew.nutt.Nutt.setup;

public class Peanut_Nut extends Item{
    public Peanut_Nut() {
        super(new Item.Properties()
                .food(ModFoods.peanut)
                .group(setup.itemGroup)
        );
        setRegistryName("peanut_nut");
    }
}
