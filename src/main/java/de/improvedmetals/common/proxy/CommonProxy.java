package de.improvedmetals.common.proxy;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.IMItems;
import de.improvedmetals.IMRecipes;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.lib.OreDictHelper;
import de.improvedmetals.common.world.IMBedrockGenerator;
import de.improvedmetals.common.world.IMWorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e){
				
		IMItems.init();
		IMBlocks.init();
		OreDictHelper.init();
		
	}
	
	public void init(FMLInitializationEvent e){
		
		registerWorldGen(new IMWorldGenerator(), 0);
		
		if(ConfigValues.flatBedrockGen){
			
		registerWorldGen(new IMBedrockGenerator(), 1);
		
		}
		
		
	}

	public void postInit(FMLPostInitializationEvent e){
	
		IMRecipes.init();
		
		
	}
	
	private void registerWorldGen(IWorldGenerator gen, int weight){
		GameRegistry.registerWorldGenerator(gen, weight);
	}
	
}
