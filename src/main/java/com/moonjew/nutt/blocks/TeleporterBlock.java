package com.moonjew.nutt.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class TeleporterBlock extends AbstractTeleporterBlock {
    public TeleporterBlock(){
        super(Block.Properties.create(Material.GLASS)
            .sound(SoundType.GLASS)
                .noDrops()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(5.0f), "teleporter");
    }

    @Override
    public void onEntityWalk(World world, BlockPos blockPos, Entity entityIn) {
        if(getPaired() != null && world.isRemote){

            entityIn.setPosition(getPaired().getX(), getPaired().getY()+1, getPaired().getZ());
            System.out.println("Player has been moved to " + getPaired());
        }

    }
}
