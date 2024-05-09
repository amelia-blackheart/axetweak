package virtualaerotech.axetweak;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import virtualaerotech.axetweak.init.VanillaItems;

@Mod(AxeTweak.MODID)
public class AxeTweak
{
    public static final String MODID = "axetweak";

    public AxeTweak()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        VanillaItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
