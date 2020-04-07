package com.moonjew.nutt.items;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class BasicItem extends Item{

    public BasicItem(String name, Item.Properties properties){
        super(prop(properties));
        ModItems.ITEMS.register(name, () -> this); //Add this line to any item not extending the NutItem class
    }


    private static Item.Properties prop(Item.Properties properties) {
        return properties.group(setup.itemGroup);
    }
}
