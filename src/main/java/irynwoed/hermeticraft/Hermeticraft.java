package irynwoed.hermeticraft;

import irynwoed.hermeticraft.blocks.HermeticraftBlocks;
import irynwoed.hermeticraft.world.HermeticraftWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.apache.logging.log4j.Logger;

@Mod(modid = Hermeticraft.MODID, name = Hermeticraft.MODNAME, version = Hermeticraft.VERSION, dependencies = "required-after:Forge@[12.18.1.2011,)", useMetadata = true)

public class Hermeticraft {

	
	public static final String MODID = "hermeticraft";
	public static final String MODNAME = "Hermeticraft";
	public static final String VERSION = "0.0.2a";
	
	@SidedProxy
	    public static CommonProxy proxy;
	   
	    @Mod.Instance
	    public static Hermeticraft instance;

	    public static Logger logger;
	    
	    public static CreativeTabs tabHermeticraft = new CreativeTabs("Hermeticraft"){
	    	@Override
	    	@SideOnly(Side.CLIENT)
	    	public Item getTabIconItem(){
	    		return Item.getItemFromBlock(Blocks.ANVIL);
	    	}
	    };

	    @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        
	    	System.out.println("We are going to try some magic here.");
	    	logger = event.getModLog();
	        proxy.preInit(event);
	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent e) {
	        proxy.init(e);
	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	        proxy.postInit(e);
	    }


	    
	    public static class CommonProxy {
	        public void preInit(FMLPreInitializationEvent e) {
	        	
	        	HermeticraftBlocks.init();
	        	HermeticraftWorldGen.init();

	        }

	        public void init(FMLInitializationEvent e) {
	    
	        }

	        public void postInit(FMLPostInitializationEvent e) {
	    
	        }
	   }
	    
	    public static class ClientProxy extends CommonProxy {
	        @Override
	        public void preInit(FMLPreInitializationEvent e) {
	            super.preInit(e);
	            HermeticraftBlocks.initModels();

	        }
	    }

	    public static class ServerProxy extends CommonProxy{
	    

	    }


	    
}
