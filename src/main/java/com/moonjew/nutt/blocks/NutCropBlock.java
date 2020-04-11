package com.moonjew.nutt.blocks;

import com.moonjew.nutt.items.NutSeed;
import com.moonjew.nutt.reg.ModBlocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.PlantType;

public class NutCropBlock extends CropsBlock implements IGrowable {
    private NutSeed seedItem;
    public NutCropBlock(Properties properties, String name) {
        super(properties);
        ModBlocks.BLOCKS.register(name, () -> this);
        seedItem = new NutSeed(this, name);
    }

    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.Plains;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return seedItem;
    }

}
