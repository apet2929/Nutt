package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;

import com.moonjew.nutt.blocks.tile.NutBreederTile;
import com.moonjew.nutt.blocks.tile.NutDryerTile;
import com.moonjew.nutt.blocks.tile.NutGrinderTile;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILEENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Nutt.MODID);

    public static final RegistryObject<TileEntityType<NutGrinderTile>> NUTGRINDER_TILE = TILEENTITY_TYPES.register("nutgrinder", () -> TileEntityType.Builder.create(NutGrinderTile::new).build(null));
    public static final RegistryObject<TileEntityType<NutDryerTile>> NUTDRYER_TILE = TILEENTITY_TYPES.register("nutdryer", () -> TileEntityType.Builder.create(NutDryerTile::new).build(null));
    public static final RegistryObject<TileEntityType<NutBreederTile>> NUTBREEDER_TILE = TILEENTITY_TYPES.register("nutbreeder", () -> TileEntityType.Builder.create(NutBreederTile::new).build(null));



}
