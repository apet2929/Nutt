package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.items.*;
import com.moonjew.nutt.items.penisite.PenisitePickaxe;
import com.moonjew.nutt.items.penisite.PenisiteSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;



public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Nutt.MODID);

    @ObjectHolder("nutt:firstitem")
    public static final FirstItem FIRSTITEM = new FirstItem();
    @ObjectHolder("nutt:penisite_sword")
    public static final PenisiteSword PENISITE_SWORD = new PenisiteSword("penisite_sword");
    @ObjectHolder("nutt:penisite_pickaxe")
    public static final PenisitePickaxe PENISITE_PICKAXE = new PenisitePickaxe("penisite_pickaxe");
    @ObjectHolder("nutt:almond_nut")
    public static final NutItem ALMOND = new NutItem("almond_nut", ModFoods.ALMOND);
    @ObjectHolder("nutt:pistachio_nut")
    public static NutItem PISTACHIO_NUT = new NutItem("pistachio_nut", ModFoods.PISTACHIO);
    @ObjectHolder("nutt:peanut_nut")
    public static NutItem PEANUT_NUT = new NutItem("peanut_nut", ModFoods.PEANUT);
    @ObjectHolder("nutt:macadamia_nut")
    public static NutItem MACADAMIA_NUT = new NutItem("macadamia_nut", ModFoods.MACADAMIA);
    @ObjectHolder("nutt:cashew_nut")
    public static NutItem CASHEW_NUT = new NutItem("cashew_nut", ModFoods.CASHEW);

    @ObjectHolder("nutt:crushed_nuts")
    public static CrushedNuts CRUSHED_NUTS = new CrushedNuts("crushed_nuts");

    @ObjectHolder("nutt:roasted_nut")
    public static RoastedNut ROASTED_NUT = new RoastedNut("roasted_nut", ModFoods.ROASTED_NUT);

}
