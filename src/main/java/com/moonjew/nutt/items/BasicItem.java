package com.moonjew.nutt.items;

import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class BasicItem extends Item{

    public BasicItem(Item.Properties properties){
        super(prop(properties));

    }


    private static Item.Properties prop(Item.Properties properties) {
        return properties.group(setup.itemGroup);
    }
}
