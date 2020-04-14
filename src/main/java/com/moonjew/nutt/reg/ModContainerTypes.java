package com.moonjew.nutt.reg;

import com.moonjew.nutt.Nutt;

import com.moonjew.nutt.blocks.container.NutBreederContainer;
import com.moonjew.nutt.blocks.container.NutDryerContainer;
import com.moonjew.nutt.blocks.container.NutGrinderContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, Nutt.MODID);

    public static final RegistryObject<ContainerType<NutGrinderContainer>> NUTGRINDER_CONTAINER = CONTAINER_TYPES.register("nutgrinder", () -> IForgeContainerType.create(
            (windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                return new NutGrinderContainer(windowId, Nutt.proxy.getClientWorld(), pos, inv, Nutt.proxy.getClientPlayer());
    }));
    public static final RegistryObject<ContainerType<NutDryerContainer>> NUTDRYER_CONTAINER = CONTAINER_TYPES.register("nutdryer", () -> IForgeContainerType.create(
            (windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                return new NutDryerContainer(windowId, Nutt.proxy.getClientWorld(), pos, inv, Nutt.proxy.getClientPlayer());
            }));
    public static final RegistryObject<ContainerType<NutBreederContainer>> NUTBREEDER_CONTAINER = CONTAINER_TYPES.register("nutbreeder", () -> IForgeContainerType.create(
            (windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                return new NutBreederContainer(windowId, Nutt.proxy.getClientWorld(), pos, inv, Nutt.proxy.getClientPlayer());
            }));


}