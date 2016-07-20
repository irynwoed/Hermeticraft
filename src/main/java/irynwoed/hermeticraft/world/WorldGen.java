package irynwoed.hermeticraft.world;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGen {
    public static void init() {
    	HermeticraftWorldGen generator = HermeticraftWorldGen.instance;
        GameRegistry.registerWorldGenerator(generator, 3);
        MinecraftForge.EVENT_BUS.register(generator);
    }


}
