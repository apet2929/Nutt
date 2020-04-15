package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Nutt.MODID);

    public static final RegistryObject<Block> FIRSTBLOCK = BLOCKS.register("firstblock", FirstBlock::new);

    public static final RegistryObject<Block> NUTGRINDER = BLOCKS.register("nutgrinder", NutGrinder::new);
    public static final RegistryObject<Block> NUTDRYER = BLOCKS.register("nutdryer", NutDryer::new);
    public static final RegistryObject<Block> NUTBREEDER = BLOCKS.register("nutbreeder", NutBreeder::new);
    public static final RegistryObject<Block> TELEPORTER = BLOCKS.register("teleporter", TeleporterBlock::new);
    public static final RegistryObject<Block> HOME = BLOCKS.register("home", HomeBlock::new);

}

