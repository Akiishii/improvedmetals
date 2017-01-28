package de.improvedmetals;

import java.util.Map;

import org.apache.logging.log4j.Logger;

import com.google.common.collect.Maps;

import de.improvedmetals.common.config.ModConfig;
import de.improvedmetals.common.handler.CommonEventHandler;
import de.improvedmetals.common.lib.LocalizationHelper;
import de.improvedmetals.common.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import tehnut.lib.LendingLibrary;

@Mod(modid = ImprovedMetals.MODID, name = ImprovedMetals.Name, version = ImprovedMetals.VersionFull, acceptedMinecraftVersions = "[1.10,1.11)", dependencies = "required-after:Forge@[12.18.3.2185,);")
public class ImprovedMetals {

	public static final String MODID = "improvedmetals";
	public static final String SnapshotVersion = "snapshot_1a";
	public static final String VersionFull = "0.0.1_alpha_" + SnapshotVersion;
	public static SimpleNetworkWrapper channel;
	public static final String Version = "0.0.1";
	public static final String Name = "Improved Metals";
	public static final String MIN_FORGE_VER = "12.18.1.2079";
	public static final String MCVersion = "1.10.2";
	
	@SidedProxy(clientSide = "de.improvedmetals.common.proxy.ClientProxy", serverSide = "de.improvedmetals.common.proxy.ServerProxy")
	public static CommonProxy PROXY;
	
	@Mod.Instance("improvedmetals")
	public static ImprovedMetals INSTANCE;
	
	private final Map<String, LocalizationHelper> locHelpers = Maps.newHashMap();

	public static LocalizationHelper localHelper;
	
	public static Logger logger;
	
	public final CreativeTabs tab = new CreativeTabs(MODID) {

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(Items.DIAMOND);
		}

		@Override
		public Item getTabIconItem() {
			return null;
		}

	};
	
	private final LendingLibrary library;

    public ImprovedMetals() {
        this.library = new LendingLibrary(MODID);
    }
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e){
		
		ModConfig.init(e.getSuggestedConfigurationFile());

		logger = e.getModLog();
		
		localHelper = new LocalizationHelper(MODID).setReplaceAmpersand(true);
		ImprovedMetals.INSTANCE.registerLocalizationHelperForMod(MODID, localHelper);
		
		
		
		PROXY.preInit(e);
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e){
		
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
		
		PROXY.init(e);

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
		PROXY.postInit(e);

	}
	
	public LocalizationHelper getLocalizationHelperForMod(String modId) {

		return locHelpers.get(modId.toLowerCase());
	}

	public void registerLocalizationHelperForMod(String modId, LocalizationHelper loc) {

		locHelpers.put(modId.toLowerCase(), loc);
	}
	
}
