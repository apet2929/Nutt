package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.crops.ItemSeedFood;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Nutt.MODID);

    public static final RegistryObject<Item> TEST_SEED = ITEMS.register("testseed", () -> new ItemSeedFood(ModBlocks.TEST_CROP.get(), new Item.Properties().food(ModFoods.ALMOND)));

}
