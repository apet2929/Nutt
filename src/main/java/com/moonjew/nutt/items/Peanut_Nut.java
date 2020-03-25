package com.moonjew.nutt.items;

import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class Peanut_Nut extends Item{
    public Peanut_Nut() {
        super(new Item.Properties()
                .food(ModFoods.peanut)
                .group(setup.itemGroup)
        );
        setRegistryName("peanut_nut");
    }
}
