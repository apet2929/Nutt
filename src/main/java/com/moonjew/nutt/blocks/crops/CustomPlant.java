package com.moonjew.nutt.blocks.crops;

import com.moonjew.nutt.reg.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomPlant extends CropsBlock {
    public CustomPlant()
    {
        super(Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP));
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
        return state.getBlock() instanceof FarmlandBlock;
    }

    @OnlyIn(Dist.CLIENT)
    protected IItemProvider getSeedsItem()
    {
        return ModItems.TEST_SEED.get();
    }

    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
    {
        return new ItemStack(this.getSeedsItem());
    }
}
