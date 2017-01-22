package de.improvedmetals.common.proxy;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.IMItems;
import de.improvedmetals.IMRecipes;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.lib.OreDictHelper;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier1;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier2;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier3;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier4;
import de.improvedmetals.common.tiles.solar.TileEntityTier10SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier1SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier2SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier3SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier4SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier5SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier6SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier7SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier8SolarPanel;
import de.improvedmetals.common.tiles.solar.TileEntityTier9SolarPanel;
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
		GameRegistry.registerTileEntity(TileCombinatorTier1.class, "tileCombinatorTier1");
		GameRegistry.registerTileEntity(TileCombinatorTier2.class, "tileCombinatorTier2");
		GameRegistry.registerTileEntity(TileCombinatorTier3.class, "tileCombinatorTier3");
		GameRegistry.registerTileEntity(TileCombinatorTier4.class, "tileCombinatorTier4");
		GameRegistry.registerTileEntity(TileEntityTier1SolarPanel.class, "tileSolarPanelTier1");
		GameRegistry.registerTileEntity(TileEntityTier2SolarPanel.class, "tileSolarPanelTier2");
		GameRegistry.registerTileEntity(TileEntityTier3SolarPanel.class, "tileSolarPanelTier3");
		GameRegistry.registerTileEntity(TileEntityTier4SolarPanel.class, "tileSolarPanelTier4");
		GameRegistry.registerTileEntity(TileEntityTier5SolarPanel.class, "tileSolarPanelTier5");
		GameRegistry.registerTileEntity(TileEntityTier6SolarPanel.class, "tileSolarPanelTier6");
		GameRegistry.registerTileEntity(TileEntityTier7SolarPanel.class, "tileSolarPanelTier7");
		GameRegistry.registerTileEntity(TileEntityTier8SolarPanel.class, "tileSolarPanelTier8");
		GameRegistry.registerTileEntity(TileEntityTier9SolarPanel.class, "tileSolarPanelTier9");
		GameRegistry.registerTileEntity(TileEntityTier10SolarPanel.class, "tileSolarPanelTier10");
		
	}
	
	public void init(FMLInitializationEvent e){
		
		NetworkRegistry.INSTANCE.registerGuiHandler(ImprovedMetals.INSTANCE, new GuiProxy());
		
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
