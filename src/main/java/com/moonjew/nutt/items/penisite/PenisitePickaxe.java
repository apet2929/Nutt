package com.moonjew.nutt.items.penisite;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.item.*;

import static com.moonjew.nutt.Nutt.setup;

public class PenisitePickaxe extends PickaxeItem {

    public PenisitePickaxe(String name) {
        super(ItemTier.DIAMOND, 1, -2.5f, new Item.Properties()
                .group(setup.itemGroup)
                .maxStackSize(1)
                .rarity(Rarity.EPIC)
        );
        ModItems.ITEMS.register(name, () -> this);
    }
}
