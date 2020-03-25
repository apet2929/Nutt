package com.MoonJew.nutt.blocks;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import static com.MoonJew.nutt.blocks.ModBlocks.NUTGRINDER_TILE;

public class NutGrinderTile extends TileEntity implements ITickableTileEntity {
    public NutGrinderTile(){
        super(NUTGRINDER_TILE);
    }

    @Override
    public void tick() {
        if(world.isRemote){
            System.out.println("NutGrinderTile.tick()");
        }
    }


}
