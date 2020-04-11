package com.moonjew.nutt.items.penisite;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;

import static com.moonjew.nutt.Nutt.setup;

public class PenisitePickaxe extends PickaxeItem {

    public PenisitePickaxe() {
        super(ItemTier.DIAMOND, 1, -2.5f, new Item.Properties()
                .group(setup.itemGroup)
                .maxStackSize(1)
                .rarity(Rarity.EPIC)
        );
    }
}
