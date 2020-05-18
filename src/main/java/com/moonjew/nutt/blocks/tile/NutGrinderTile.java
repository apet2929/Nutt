package com.moonjew.nutt.blocks.tile;

import com.moonjew.nutt.Nutt;
import com.moonjew.nutt.blocks.container.NutGrinderContainer;
import com.moonjew.nutt.reg.ModItems;
import com.moonjew.nutt.tools.Config;
import com.moonjew.nutt.tools.CustomEnergyStorage;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.moonjew.nutt.reg.ModTileEntityTypes.NUTGRINDER_TILE;

public class NutGrinderTile extends TileEntity implements ITickableTileEntity, INamedContainerProvider {

    private int counter;
    private LazyOptional<IEnergyStorage> energy = LazyOptional.of(this::createEnergy);
    private LazyOptional<IItemHandler> handler = LazyOptional.of(this::createHandler);
    public NutGrinderTile(){
        super(NUTGRINDER_TILE.get());
        Nutt.LOGGER.info("NutGrinderTile instantiated");
    }

    @Override
    public void tick(){
        if(counter > 0){
            counter--;
            if(counter <= 0){
                energy.ifPresent(e -> ((CustomEnergyStorage)e).addEnergy(Config.NUTGRINDER_GENERATE.get()));

            }
        } else {
            handler.ifPresent(h -> {
                Nutt.LOGGER.info(h.getSlots());
                ItemStack stack = h.getStackInSlot(0);
                if(stack.getItem() == Items.DIAMOND){
                    h.extractItem(0,1,false);
                    counter = Config.NUTGRINDER_TICKS.get();
                }
                ItemStack stack2 = h.getStackInSlot(1);
                energy.ifPresent(e -> {
                    if (e.getEnergyStored() >= 10000){
                        ItemStack insert = new ItemStack(ModItems.NUTGRINDER.get(), stack2.getCount()+1);
                        h.insertItem(1, insert, false);
                        ((CustomEnergyStorage)e).addEnergy(-10000);
                    }
                });
            });
        }
    }

//    private void sendOutPower() {
//        energy.ifPresent(energy -> {
//            AtomicInteger capacity = new AtomicInteger(energy.getEnergyStored());
//            if(capacity.get() > 0) {
//                for (Direction direction : Direction.values()) {
//                    TileEntity te = world.getTileEntity(pos.offset(direction));
//                    if (te != null) {
//                        boolean doContinue = te.getCapability(CapabilityEnergy.ENERGY, direction).map(handler -> {
//                            if (handler.canReceive()) {
//                                int recieved = handler.receiveEnergy(Math.min(capacity.get(), 100), false);
//                                capacity.addAndGet(-recieved);
//                                ((CustomEnergyStorage)energy).consumeEnergy(recieved);
//                                markDirty();
//                                return capacity.get() > 0;
//                            } else {
//                                return true;
//                            }
//                        }).orElse(true);
//                        if(!doContinue){
//                            return;
//                        }
//                    }
//                }
//            }
//        });
//    }

    @Override
    public void read(CompoundNBT tag) {
        CompoundNBT invTag = tag.getCompound("inv");
        handler.ifPresent(h -> ((INBTSerializable<CompoundNBT>)h).deserializeNBT(invTag));
        CompoundNBT energyTag = tag.getCompound("energy");
        energy.ifPresent(h -> ((INBTSerializable<CompoundNBT>)h).deserializeNBT(energyTag));
        super.read(tag);
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        handler.ifPresent(h -> {
            CompoundNBT compound = ((INBTSerializable<CompoundNBT>)h).serializeNBT();
            tag.put("inv", compound);
        });
        energy.ifPresent(h -> {
            CompoundNBT compound = ((INBTSerializable<CompoundNBT>)h).serializeNBT();
            tag.put("energy", compound);
        });
        return super.write(tag);
    }

    private ItemStackHandler createHandler(){
        return new ItemStackHandler(2) {
            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                return stack.getItem() == Items.DIAMOND;
            }

            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if(slot == 0) {
                    if (stack.getItem() != Items.DIAMOND) {
                        return stack;
                    }
                } else if(slot == 1){
                    if(stack.getItem() != ModItems.NUTGRINDER.get()){
                        return stack;
                    }
                }

                return super.insertItem(slot, stack, simulate);
            }

            @Override
            protected void onContentsChanged(int slot) {
                markDirty();
            }
        };
    }

    private IEnergyStorage createEnergy(){
        return new CustomEnergyStorage(Config.NUTGRINDER_MAXPOWER.get(), 0);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return handler.cast();
        }
        if(cap == CapabilityEnergy.ENERGY){
            return energy.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent(getType().getRegistryName().getPath());
    }

    @Nullable
    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        assert world != null;
        return new NutGrinderContainer(i, world, pos, playerInventory, playerEntity);
    }
}
//Fuck you github