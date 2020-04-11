package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.items.CrushedNuts;
import com.moonjew.nutt.items.FirstItem;
import com.moonjew.nutt.items.NutBlockItem;
import com.moonjew.nutt.items.NutItem;
import com.moonjew.nutt.items.penisite.PenisitePickaxe;
import com.moonjew.nutt.items.penisite.PenisiteSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Nutt.MODID);

    public static final RegistryObject<Item> FIRSTITEM = ITEMS.register("firstitem", FirstItem::new);
    public static final RegistryObject<Item> PENISITE_SWORD = ITEMS.register("penisite_sword", PenisiteSword::new);
    public static final RegistryObject<Item> PENISITE_PICKAXE = ITEMS.register("penisite_pickaxe", PenisitePickaxe::new);

    public static final RegistryObject<Item> ALMOND_NUT = ITEMS.register("almond_nut", () -> new NutItem( ModFoods.ALMOND));
    public static final RegistryObject<Item> PISTACHIO_NUT = ITEMS.register("pistachio_nut", () -> new NutItem(ModFoods.PISTACHIO));
    public static final RegistryObject<Item> PEANUT_NUT = ITEMS.register("peanut_nut", () -> new NutItem( ModFoods.PEANUT));
    public static final RegistryObject<Item> MACADAMIA_NUT = ITEMS.register("macadamia_nut", () -> new NutItem( ModFoods.MACADAMIA));
    public static final RegistryObject<Item> CASHEW_NUT = ITEMS.register("cashew_nut", () -> new NutItem( ModFoods.CASHEW));
    public static final RegistryObject<Item> CRUSHED_NUTS = ITEMS.register("crushed_nuts", CrushedNuts::new);
    public static final RegistryObject<Item> ROASTED_NUT = ITEMS.register("roasted_nut", () -> new NutItem( ModFoods.ROASTED_NUT));

    public static final RegistryObject<Item> FIRSTBLOCK = ITEMS.register("firstblock", () -> new NutBlockItem(ModBlocks.FIRSTBLOCK.get()));
    public static final RegistryObject<Item> NUTGRINDER = ITEMS.register("nutgrinder", () -> new NutBlockItem(ModBlocks.NUTGRINDER.get()));
    public static final RegistryObject<Item> NUTDRYER = ITEMS.register("nutdryer", () -> new NutBlockItem(ModBlocks.NUTDRYER.get()));
    public static final RegistryObject<Item> NUTBREEDER = ITEMS.register("nutbreeder", () -> new NutBlockItem(ModBlocks.NUTBREEDER.get()));
    public static final RegistryObject<Item> TELEPORTER = ITEMS.register("teleporter", () -> new NutBlockItem(ModBlocks.TELEPORTER.get()));
    public static final RegistryObject<Item> HOME = ITEMS.register("home", () -> new NutBlockItem(ModBlocks.HOME.get()));

}
