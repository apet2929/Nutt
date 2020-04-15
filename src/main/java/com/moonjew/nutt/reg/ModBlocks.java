package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.crops.CustomPlant;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Nutt.MODID);
    public static final RegistryObject<Block> TEST_CROP = BLOCKS.register("testcrop", CustomPlant::new);


}

