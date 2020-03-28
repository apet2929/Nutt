package com.moonjew.nutt.fluids;
//
//
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.fluid.Fluids;
//import net.minecraft.item.*;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.fluids.FluidAttributes;
//import net.minecraftforge.fluids.FluidStack;
//import net.minecraftforge.fluids.ForgeFlowingFluid;
//import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
//import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
//import org.apache.commons.lang3.Validate;
//
//import static com.moonjew.nutt.reg.ModFluids.nutoilfluid;
//import static com.moonjew.nutt.reg.ModBlocks.nutoil_block;
//import static com.moonjew.nutt.reg.ModBlocks.nutoilfluid_block;
//import static com.moonjew.nutt.reg.ModItems.nutoil_bucket;
//
//public class NutOilFluid {
//
//
//    public static final ResourceLocation FLUID_STILL = new ResourceLocation("minecraft:block/brown_mushroom_block");
//    public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("minecraft:block/mushroom_stem");
//    public static final ResourceLocation FLUID_OVERLAY = new ResourceLocation("minecraft:block/obsidian");
//
//
//
//
//
//    public static final ForgeFlowingFluid.Properties nutoil_properties =
//            new ForgeFlowingFluid.Properties(nutoilfluid, nutoilfluid_block, FluidAttributes.builder(FLUID_STILL, FLUID_FLOWING).overlay(FLUID_OVERLAY).color(0x3F1080FF))
//                    .bucket(nutoil_bucket).block(nutoilfluid_block);
//
//    public NutOilFluid()
//    {
//        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
//
//        modEventBus.addListener(this::loadComplete);
//
//        BLOCKS.register(modEventBus);
//        ITEMS.register(modEventBus);
//        FLUIDS.register(modEventBus);
//    }
//
//    public void loadComplete(FMLLoadCompleteEvent event)
//    {
//        // some sanity checks
//        BlockState state = Fluids.WATER.getDefaultState().getBlockState();
//        BlockState state2 = Fluids.WATER.getAttributes().getBlock(null,null,Fluids.WATER.getDefaultState());
//        Validate.isTrue(state.getBlock() == Blocks.WATER && state2 == state);
//        ItemStack stack = Fluids.WATER.getAttributes().getBucket(new FluidStack(Fluids.WATER, 1));
//        Validate.isTrue(stack.getItem() == Fluids.WATER.getFilledBucket());
//    }
//}
/*
 * Minecraft Forge
 * Copyright (c) 2016-2019.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */



import com.moonjew.nutt.Nutt;
import org.apache.commons.lang3.Validate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.moonjew.nutt.Nutt.setup;

public class NutOilFluid
{

    public static final ResourceLocation FLUID_STILL = new ResourceLocation("minecraft:block/brown_mushroom_block");
    public static final ResourceLocation FLUID_FLOWING = new ResourceLocation("minecraft:block/mushroom_stem");
    public static final ResourceLocation FLUID_OVERLAY = new ResourceLocation("minecraft:block/obsidian");

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Nutt.MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Nutt.MODID);
    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, Nutt.MODID);

    public static RegistryObject<FlowingFluid> nutoilfluid = FLUIDS.register("nutoilfluid", () ->
            new ForgeFlowingFluid.Source(NutOilFluid.nutoilfluid_properties)
    );
    public static RegistryObject<FlowingFluid> nutoilfluid_flowing = FLUIDS.register("test_fluid_flowing", () ->
            new ForgeFlowingFluid.Flowing(NutOilFluid.nutoilfluid_properties)
    );

    public static RegistryObject<FlowingFluidBlock> nutoilfluid_block = BLOCKS.register("nutoilfluid_block", () ->
            new FlowingFluidBlock(nutoilfluid, Block.Properties.create(net.minecraft.block.material.Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops())
    );
    public static RegistryObject<Item> nutoilfluid_bucket = ITEMS.register("nutoilfluid_bucket", () ->
            new BucketItem(nutoilfluid, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(setup.itemGroup))
    );

    public static final ForgeFlowingFluid.Properties nutoilfluid_properties =
            new ForgeFlowingFluid.Properties(nutoilfluid, nutoilfluid_flowing, FluidAttributes.builder(FLUID_STILL, FLUID_FLOWING).overlay(FLUID_OVERLAY).color(0x3F1080FF))
                    .bucket(nutoilfluid_bucket).block(nutoilfluid_block);

    public NutOilFluid()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::loadComplete);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        FLUIDS.register(modEventBus);
    }

    public void loadComplete(FMLLoadCompleteEvent event)
    {
        // some sanity checks
        BlockState state = Fluids.WATER.getDefaultState().getBlockState();
        BlockState state2 = Fluids.WATER.getAttributes().getBlock(null,null,Fluids.WATER.getDefaultState());
        Validate.isTrue(state.getBlock() == Blocks.WATER && state2 == state);
        ItemStack stack = Fluids.WATER.getAttributes().getBucket(new FluidStack(Fluids.WATER, 1));
        Validate.isTrue(stack.getItem() == Fluids.WATER.getFilledBucket());
    }
}
