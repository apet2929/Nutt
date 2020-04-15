package com.moonjew.nutt;


import com.moonjew.nutt.reg.Register;
import com.moonjew.nutt.setup.ClientProxy;
import com.moonjew.nutt.setup.IProxy;
import com.moonjew.nutt.setup.ModSetup;
import com.moonjew.nutt.setup.ServerProxy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
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

        Register.register();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();

    }
}
