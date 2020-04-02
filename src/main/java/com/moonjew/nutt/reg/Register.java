package com.moonjew.nutt.reg;

import com.moonjew.nutt.fluids.NutOilFluid;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Register {
    public static void register(){
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        NutOilFluid.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        NutOilFluid.FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        NutOilFluid.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
