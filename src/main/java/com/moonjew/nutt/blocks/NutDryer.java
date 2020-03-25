package com.moonjew.nutt.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class NutDryer extends Block {
    public NutDryer(){
        super(Properties.create(Material.IRON)
                .lightValue(12)
                .hardnessAndResistance(3.0f)
                .sound(SoundType.LANTERN)
        );
        setRegistryName("nutdryer");

    }
    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack){
        if(entity != null){
            world.setBlockState(pos, state.with(BlockStateProperties.FACING, getFacingFromEntity(pos, entity)), 2);
        }
    }
    public static Direction getFacingFromEntity(BlockPos clickedBlock, LivingEntity entity){
        return Direction.getFacingFromVector((float)(entity.getPosition().getX() - clickedBlock.getX()), (float)(entity.getPosition().getY() - clickedBlock.getY()), (float)(entity.getPosition().getZ() - clickedBlock.getZ()));
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder){
        builder.add(BlockStateProperties.FACING);
    }
}
