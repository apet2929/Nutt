package com.moonjew.nutt.items.penisite;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;

import static com.moonjew.nutt.Nutt.setup;

public class PenisiteSword extends SwordItem {

    public PenisiteSword(String name) {
        super(ItemTier.DIAMOND, 10, -2.6f, new Item.Properties()
                .group(setup.itemGroup)
                .rarity(Rarity.EPIC)
                .maxStackSize(1)
        );
        ModItems.ITEMS.register(name, () -> this);
    }


}
