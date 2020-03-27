package com.moonjew.nutt.reg;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Register {
    public static void register(){
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
