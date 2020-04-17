package com.moonjew.nutt;


import com.moonjew.nutt.reg.ModBlocks;
import com.moonjew.nutt.reg.Register;
import com.moonjew.nutt.setup.ClientProxy;
import com.moonjew.nutt.setup.IProxy;
import com.moonjew.nutt.setup.ModSetup;
import com.moonjew.nutt.setup.ServerProxy;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("nutt")
public class Nutt {

    public static final String MODID = "nutt";
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    public static ModSetup setup = new ModSetup();
    private static final Logger LOGGER = LogManager.getLogger();
    private ResourceLocation uncookedNutTag = new ResourceLocation(MODID, "uncooked_nut");

    public Nutt() {
        // Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        Register.register();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        // do something that can only be done on the client
        RenderTypeLookup.setRenderLayer(ModBlocks.TEST_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ALMOND_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PEANUT_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.PISTACHIO_CROP.get(), RenderType.cutout());
    }
}
