package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.blocks.*;
import com.moonjew.nutt.blocks.crops.AlmondCrop;
import com.moonjew.nutt.blocks.crops.CustomPlant;
import com.moonjew.nutt.blocks.crops.PeanutCrop;
import com.moonjew.nutt.blocks.crops.PistachioCrop;
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

    public static final RegistryObject<Block> TEST_CROP = BLOCKS.register("testcrop", CustomPlant::new);
    public static final RegistryObject<Block> ALMOND_CROP = BLOCKS.register("almond_crop", AlmondCrop::new);
    public static final RegistryObject<Block> PISTACHIO_CROP = BLOCKS.register("pistachio_crop", PistachioCrop::new);
    public static final RegistryObject<Block> PEANUT_CROP = BLOCKS.register("peanut_crop", PeanutCrop::new);

}

