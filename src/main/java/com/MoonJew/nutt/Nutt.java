package com.MoonJew.nutt;

import com.MoonJew.nutt.blocks.*;
//import com.MoonJew.nutt.blocks.FirstBlockTile;
//import com.MoonJew.nutt.items.FirstItem;
import com.MoonJew.nutt.items.*;
import com.MoonJew.nutt.setup.ClientProxy;
import com.MoonJew.nutt.setup.IProxy;
import com.MoonJew.nutt.setup.ModSetup;
import com.MoonJew.nutt.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("nutt")
public class Nutt
{
    public static final String MODID = "nutt";
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    public static ModSetup setup = new ModSetup();
    public static ModFoods modFoods = new ModFoods();
    private static final Logger LOGGER = LogManager.getLogger();

    public Nutt() {
        // Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new FirstBlock());
            event.getRegistry().register(new NutGrinder());
            event.getRegistry().register(new NutDryer());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, properties).setRegistryName("firstblock"));
            event.getRegistry().register(new FirstItem());

            event.getRegistry().register(new Pistachio_Nut());
            event.getRegistry().register(new Peanut_Nut());
            event.getRegistry().register(new Macadamia_Nut());
            event.getRegistry().register(new Cashew_Nut());
            event.getRegistry().register(new Almond_Nut());

            event.getRegistry().register(new BlockItem(ModBlocks.NUTGRINDER, properties).setRegistryName("nutgrinder"));
            event.getRegistry().register(new BlockItem(ModBlocks.NUTDRYER, properties).setRegistryName("nutdryer"));

        }
        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
            event.getRegistry().register(TileEntityType.Builder.create(NutGrinderTile::new, ModBlocks.NUTGRINDER).build(null).setRegistryName("nutgrinder"));
        }
        @SubscribeEvent
        public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event){
            event.getRegistry().register(
                    IForgeContainerType.create(
                            (windowId, inv, data) -> {
                                BlockPos pos = data.readBlockPos();
                                return new NutGrinderContainer(windowId, pos, Nutt.proxy.getClientWorld(), inv, proxy.getClientPlayer());
                            }).setRegistryName("nutgrinder")
            );
        }

    }
}
