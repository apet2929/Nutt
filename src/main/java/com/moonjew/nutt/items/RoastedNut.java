package com.moonjew.nutt.items;


import com.moonjew.nutt.reg.ModItems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

import static com.moonjew.nutt.Nutt.setup;

public class RoastedNut extends Item{

    public RoastedNut(String name, Food food){
        super(prop(food));
        ModItems.ITEMS.register(name, () -> this); //Add this line to any item not extending the NutItem class
    }


    private static Item.Properties prop(Food food) {
        return new Item.Properties().group(setup.itemGroup).food(food);
    }

}
