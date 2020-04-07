package com.moonjew.nutt.items;

import com.moonjew.nutt.Nutt;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NutItem extends BasicItem {
    ResourceLocation nutTag = new ResourceLocation(Nutt.MODID, "nut");
    public NutItem(String name, Food food){
        super(name, prop(food));
    }


    private static Properties prop(Food food) {
        return new Item.Properties().food(food);
    }

}
