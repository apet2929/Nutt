package com.moonjew.nutt.reg;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Register {
    public static void register(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModTileEntityTypes.TILEENTITY_TYPES.register(bus);
        ModContainerTypes.CONTAINER_TYPES.register(bus);

    }
}
