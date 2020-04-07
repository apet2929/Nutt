package com.moonjew.nutt.blocks;

import com.moonjew.nutt.items.NutBlockItem;
import com.moonjew.nutt.reg.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class TeleporterBlock extends Block {
    private final NutBlockItem ITEM;
    private static BlockPos paired;
    private static BlockPos justPlaced;
    private int counter;
    public TeleporterBlock() {
        super(Block.Properties.create(Material.GLASS)
                .sound(SoundType.GLASS)
                .noDrops()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(5.0f)
        );
        counter = 0;
        ITEM = new NutBlockItem(this, "teleporter");
        ModBlocks.BLOCKS.register("teleporter", () -> this);
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockPos, Entity entityIn) {
            if(paired != null && !posEquals(blockPos, paired)){
                entityIn.setPosition(paired.getX() + 1, paired.getY(), paired.getZ());
            }
            else if(paired != null){
                entityIn.setPosition(justPlaced.getX() + 1, justPlaced.getY(), justPlaced.getZ());
            }

        super.onEntityWalk(world, blockPos, entityIn);
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
        if(!world.isRemote) setPaired(pos);
        super.onBlockPlacedBy(world, pos, state, entity, stack);
    }

    private void setPaired(BlockPos pos) {
        if(justPlaced != null)  paired = new BlockPos(justPlaced);
        justPlaced = pos;
        System.out.println("The paired block is " + paired);
        System.out.println("The latest teleporter placed is " + justPlaced);
    }
    private boolean posEquals(BlockPos pos1, BlockPos pos2){
        return pos1.getX() == pos2.getX() && pos1.getY() == pos2.getY() && pos1.getZ() == pos2.getZ();
    }

}

