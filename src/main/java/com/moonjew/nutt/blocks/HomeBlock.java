package com.moonjew.nutt.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class HomeBlock extends AbstractTeleporterBlock {
    public HomeBlock() {
        super(Properties.create(Material.GLASS)
                .sound(SoundType.GLASS)
                .noDrops()
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(5.0f), "home");
        System.out.println("HomeBlock instantiated (HomeBlock.java)");
    }

    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
        setPaired(pos);
        return ActionResultType.SUCCESS;
    }
}
