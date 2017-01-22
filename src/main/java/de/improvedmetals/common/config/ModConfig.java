package de.improvedmetals.common.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModConfig {
	
	public static Configuration config;
	public static final String categorySettings = "settings";
	public static final String categoryDurability = "durability";
	public static final String categoryOreGen = "oreGen";
	public static final String categoryPowerGen = "powerGen";

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e){
		
		if(e.getModID().equals("improvedmetals")){
			standardConfig();
		}
		
	}
	  
	
	public static void init(File file){
		config = new Configuration(file);
		standardConfig();
	}
	
	private static void standardConfig() {
		
		config.addCustomCategoryComment(categorySettings, "Settings for all things in Improved Metals");
		ConfigValues.copperTools = config.getBoolean("copperTools", categorySettings, ConfigValues.copperTools, "Enable/Disable Copper Tools");
		ConfigValues.bronzeTools = config.getBoolean("bronzeTools", categorySettings, ConfigValues.bronzeTools, "Enable/Disable Bronze Tools");
		ConfigValues.emeraldTools = config.getBoolean("emeraldTools", categorySettings, ConfigValues.emeraldTools, "Enable/Disable Emerald Tools");
		ConfigValues.obsidianTools = config.getBoolean("obsidianTools", categorySettings, ConfigValues.obsidianTools, "Enable/Disable Obsidian Tools");
		ConfigValues.glowstoneTools = config.getBoolean("glowstoneTools", categorySettings, ConfigValues.glowstoneTools, "Enable/Disable Glowstone Tools");
		ConfigValues.prismarineTools = config.getBoolean("prismarineTools", categorySettings, ConfigValues.prismarineTools, "Enable/Disable Prismarine Tools");
		ConfigValues.improvedDiamondTools = config.getBoolean("improvedDiamondTools", categorySettings, ConfigValues.improvedDiamondTools, "Enable/Disable Improved Diamond Tools");
		ConfigValues.improvedEmeraldTools = config.getBoolean("improvedEmeraldTools", categorySettings, ConfigValues.improvedEmeraldTools, "Enable/Disable Improved Emerald Tools");
		ConfigValues.improvedObsidianTools = config.getBoolean("improvedObsidianTools", categorySettings, ConfigValues.improvedObsidianTools, "Enable/Disable Improved Obsidian Tools");
		ConfigValues.improvedGlowstoneTools = config.getBoolean("improvedGlowstoneTools", categorySettings, ConfigValues.improvedGlowstoneTools, "Enable/Disable Improved Glowstone Tools");
		ConfigValues.witherTools = config.getBoolean("witherTools", categorySettings, ConfigValues.witherTools, "Enable/Disable Wither Tools");
		ConfigValues.dragonTools = config.getBoolean("dragonTools", categorySettings, ConfigValues.dragonTools, "Enable/Disable Dragon Tools");
		ConfigValues.flatBedrockGen = config.getBoolean("flatBedrockGen", categorySettings, ConfigValues.flatBedrockGen, "Enable/Disable the flat generation of Bedrock");
		
		config.addCustomCategoryComment(categoryDurability, "Set the Durability of Items, Tools and Armor");
		ConfigValues.copperToolsDurability = config.getInt("copperToolsDurability", categoryDurability, ConfigValues.copperToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Copper Tools should have!");
		ConfigValues.bronzeToolsDurability = config.getInt("bronzeToolsDurability", categoryDurability, ConfigValues.bronzeToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Bronze Tools should have!");
		ConfigValues.emeraldToolsDurability = config.getInt("emeraldToolsDurability", categoryDurability, ConfigValues.emeraldToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Emerald Tools should have!");
		ConfigValues.obsidianToolsDurability = config.getInt("obsidianToolsDurability", categoryDurability, ConfigValues.obsidianToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Obsidian Tools should have!");
		ConfigValues.glowstoneToolsDurability = config.getInt("glowstoneToolsDurability", categoryDurability, ConfigValues.glowstoneToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Glowstone Tools should have!");
		ConfigValues.prismarineToolsDurability = config.getInt("prismarineToolsDurability", categoryDurability, ConfigValues.prismarineToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Prismarine Tools should have!");
		ConfigValues.improvedDiamondToolsDurability = config.getInt("improvedDiamondToolsDurability", categoryDurability, ConfigValues.improvedDiamondToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Improved Diamond Tools should have!");
		ConfigValues.improvedEmeraldToolsDurability = config.getInt("improvedEmeraldToolsDurability", categoryDurability, ConfigValues.improvedEmeraldToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Improved Emerald Tools should have!");
		ConfigValues.improvedObsidianToolsDurability = config.getInt("improvedObsidianToolsDurability", categoryDurability, ConfigValues.improvedObsidianToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Improved Obsidian Tools should have!");
		ConfigValues.improvedGlowstoneToolsDurability = config.getInt("improvedGlowstoneToolsDurability", categoryDurability, ConfigValues.improvedGlowstoneToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Improved Glowstone Tools should have!");
		ConfigValues.witherToolsDurability = config.getInt("witherToolsDurability", categoryDurability, ConfigValues.witherToolsDurability, 1, Integer.MAX_VALUE, "Set the durability Wither Tools should have!");

		config.addCustomCategoryComment(categoryOreGen, "Enable/Disable Ore Generation and the Vein Size");
		ConfigValues.oreGenCopper = config.getBoolean("oreGenCopper", categoryOreGen, ConfigValues.oreGenCopper, "Enable/Disable the generation of Copper Ore");
		ConfigValues.oreGenCopperMinVeinSize = config.getInt("oreGenCopperMinVeinSize", categoryOreGen, ConfigValues.oreGenCopperMinVeinSize, 1, 3, "Set the min vein size of Copper Ore");
		ConfigValues.oreGenCopperMaxVeinSize = config.getInt("oreGenCopperMaxVeinSize", categoryOreGen, ConfigValues.oreGenCopperMaxVeinSize, 4, 8, "Set the max vein size of Copper Ore");
		ConfigValues.oreGenCopperMinY = config.getInt("oreGenCopperMinY", categoryOreGen, ConfigValues.oreGenCopperMinY, 1, 256, "Set the minY-Level for Copper Ore to generate");
		ConfigValues.oreGenCopperMaxY = config.getInt("oreGenCopperMaxY", categoryOreGen, ConfigValues.oreGenCopperMaxY, 1, 256, "Set the maxY-Level for Copper Ore to generate");
		
		ConfigValues.oreGenTin = config.getBoolean("oreGenTin", categoryOreGen, ConfigValues.oreGenTin, "Enable/Disable the generation of Tin Ore");
		ConfigValues.oreGenTinMinVeinSize = config.getInt("oreGenTinMinVeinSize", categoryOreGen, ConfigValues.oreGenTinMinVeinSize, 1, 3, "Set the min vein size of Tin Ore");
		ConfigValues.oreGenTinMaxVeinSize = config.getInt("oreGenTinMaxVeinSize", categoryOreGen, ConfigValues.oreGenTinMaxVeinSize, 4, 8, "Set the max vein size of Tin Ore");
		ConfigValues.oreGenTinMinY = config.getInt("oreGenTinMinY", categoryOreGen, ConfigValues.oreGenTinMinY, 1, 256, "Set the minY-Level for Tin Ore to generate");
		ConfigValues.oreGenTinMaxY = config.getInt("oreGenTinMaxY", categoryOreGen, ConfigValues.oreGenTinMaxY, 1, 256, "Set the maxY-Level for Tin Ore to generate");
		
		ConfigValues.oreGenSilver = config.getBoolean("oreGenSilver", categoryOreGen, ConfigValues.oreGenSilver, "Enable/Disable the generation of Silver Ore");
		ConfigValues.oreGenSilverMinVeinSize = config.getInt("oreGenSilverMinVeinSize", categoryOreGen, ConfigValues.oreGenSilverMinVeinSize, 1, 2, "Set the min vein size of Silver Ore");
		ConfigValues.oreGenSilverMaxVeinSize = config.getInt("oreGenSilverMaxVeinSize", categoryOreGen, ConfigValues.oreGenSilverMaxVeinSize, 3, 4, "Set the max vein size of Silver Ore");
		ConfigValues.oreGenSilverMinY = config.getInt("oreGenSilverMinY", categoryOreGen, ConfigValues.oreGenSilverMinY, 1, 256, "Set the minY-Level for Silver Ore to generate");
		ConfigValues.oreGenSilverMaxY = config.getInt("oreGenSilverMaxY", categoryOreGen, ConfigValues.oreGenSilverMaxY, 1, 256, "Set the maxY-Level for Silver Ore to generate");
		
		ConfigValues.oreGenLead = config.getBoolean("oreGenLead", categoryOreGen, ConfigValues.oreGenLead, "Enable/Disable the generation of Lead Ore");
		ConfigValues.oreGenLeadMinVeinSize = config.getInt("oreGenLeadMinVeinSize", categoryOreGen, ConfigValues.oreGenLeadMinVeinSize, 1, 2, "Set the min vein size of Lead Ore");
		ConfigValues.oreGenLeadMaxVeinSize = config.getInt("oreGenLeadMaxVeinSize", categoryOreGen, ConfigValues.oreGenLeadMaxVeinSize, 3, 4, "Set the max vein size of Lead Ore");
		ConfigValues.oreGenLeadMinY = config.getInt("oreGenLeadMinY", categoryOreGen, ConfigValues.oreGenLeadMinY, 1, 256, "Set the minY-Level for Lead Ore to generate");
		ConfigValues.oreGenLeadMaxY = config.getInt("oreGenLeadMaxY", categoryOreGen, ConfigValues.oreGenLeadMaxY, 1, 256, "Set the maxY-Level for Lead Ore to generate");
		
		ConfigValues.oreGenPrismarine = config.getBoolean("oreGenPrismarine", categoryOreGen, ConfigValues.oreGenPrismarine, "Enable/Disable the generation of Prismarine Ore");
		ConfigValues.oreGenPrismarineMinVeinSize = config.getInt("oreGenPrismarineMinVeinSize", categoryOreGen, ConfigValues.oreGenPrismarineMinVeinSize, 1, 2, "Set the min vein size of Prismarine Ore");
		ConfigValues.oreGenPrismarineMaxVeinSize = config.getInt("oreGenPrismarineMaxVeinSize", categoryOreGen, ConfigValues.oreGenPrismarineMaxVeinSize, 3, 4, "Set the max vein size of Prismarine Ore");
		ConfigValues.oreGenPrismarineMinY = config.getInt("oreGenPrismarineMinY", categoryOreGen, ConfigValues.oreGenPrismarineMinY, 1, 256, "Set the minY-Level for Prismarine Ore to generate");
		ConfigValues.oreGenPrismarineMaxY = config.getInt("oreGenPrismarineMaxY", categoryOreGen, ConfigValues.oreGenPrismarineMaxY, 1, 256, "Set the maxY-Level for Prismarine Ore to generate");
		
		ConfigValues.oreGenExperience = config.getBoolean("oreGenExperience", categoryOreGen, ConfigValues.oreGenExperience, "Enable/Disable the generation of Experience Ore");
		ConfigValues.oreGenExperienceMinVeinSize = config.getInt("oreGenExperienceMinVeinSize", categoryOreGen, ConfigValues.oreGenExperienceMinVeinSize, 1, 2, "Set the min vein size of Experience Ore");
		ConfigValues.oreGenExperienceMaxVeinSize = config.getInt("oreGenExperienceMaxVeinSize", categoryOreGen, ConfigValues.oreGenExperienceMaxVeinSize, 3, 4, "Set the max vein size of Experience Ore");
		ConfigValues.oreGenExperienceMinY = config.getInt("oreGenExperienceMinY", categoryOreGen, ConfigValues.oreGenExperienceMinY, 1, 256, "Set the minY-Level for Experience Ore to generate");
		ConfigValues.oreGenExperienceMaxY = config.getInt("oreGenExperienceMaxY", categoryOreGen, ConfigValues.oreGenExperienceMaxY, 1, 256, "Set the maxY-Level for Experience Ore to generate");
		
		config.addCustomCategoryComment(categoryPowerGen, "Configure Power Generation in Improved Metals");
		
		ConfigValues.tier1PanelCapacity = config.getInt("tier1PanelCapacity", categoryPowerGen, ConfigValues.tier1PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 1 Solar Panels");
		ConfigValues.tier1PanelPowerGen = config.getInt("tier1PanelPowerGen", categoryPowerGen, ConfigValues.tier1PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 1 Solar Panels");
		ConfigValues.tier1PanelTransferRate = config.getInt("tier1PanelTransferRate", categoryPowerGen, ConfigValues.tier1PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 1 Solar Panels");
		
		ConfigValues.tier2PanelCapacity = config.getInt("tier2PanelCapacity", categoryPowerGen, ConfigValues.tier2PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 2 Solar Panels");
		ConfigValues.tier2PanelPowerGen = config.getInt("tier2PanelPowerGen", categoryPowerGen, ConfigValues.tier2PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 2 Solar Panels");
		ConfigValues.tier2PanelTransferRate = config.getInt("tier2PanelTransferRate", categoryPowerGen, ConfigValues.tier2PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 2 Solar Panels");
		
		ConfigValues.tier3PanelCapacity = config.getInt("tier3PanelCapacity", categoryPowerGen, ConfigValues.tier3PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 3 Solar Panels");
		ConfigValues.tier3PanelPowerGen = config.getInt("tier3PanelPowerGen", categoryPowerGen, ConfigValues.tier3PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 3 Solar Panels");
		ConfigValues.tier3PanelTransferRate = config.getInt("tier3PanelTransferRate", categoryPowerGen, ConfigValues.tier3PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 3 Solar Panels");
		
		ConfigValues.tier4PanelCapacity = config.getInt("tier4PanelCapacity", categoryPowerGen, ConfigValues.tier4PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 4 Solar Panels");
		ConfigValues.tier4PanelPowerGen = config.getInt("tier4PanelPowerGen", categoryPowerGen, ConfigValues.tier4PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 4 Solar Panels");
		ConfigValues.tier4PanelTransferRate = config.getInt("tier4PanelTransferRate", categoryPowerGen, ConfigValues.tier4PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 4 Solar Panels");
		
		ConfigValues.tier5PanelCapacity = config.getInt("tier5PanelCapacity", categoryPowerGen, ConfigValues.tier5PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 5 Solar Panels");
		ConfigValues.tier5PanelPowerGen = config.getInt("tier5PanelPowerGen", categoryPowerGen, ConfigValues.tier5PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 5 Solar Panels");
		ConfigValues.tier5PanelTransferRate = config.getInt("tier5PanelTransferRate", categoryPowerGen, ConfigValues.tier5PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 5 Solar Panels");
		
		ConfigValues.tier6PanelCapacity = config.getInt("tier6PanelCapacity", categoryPowerGen, ConfigValues.tier6PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 6 Solar Panels");
		ConfigValues.tier6PanelPowerGen = config.getInt("tier6PanelPowerGen", categoryPowerGen, ConfigValues.tier6PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 6 Solar Panels");
		ConfigValues.tier6PanelTransferRate = config.getInt("tier6PanelTransferRate", categoryPowerGen, ConfigValues.tier6PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 6 Solar Panels");
		
		ConfigValues.tier7PanelCapacity = config.getInt("tier7PanelCapacity", categoryPowerGen, ConfigValues.tier7PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 7 Solar Panels");
		ConfigValues.tier7PanelPowerGen = config.getInt("tier7PanelPowerGen", categoryPowerGen, ConfigValues.tier7PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 7 Solar Panels");
		ConfigValues.tier7PanelTransferRate = config.getInt("tier7PanelTransferRate", categoryPowerGen, ConfigValues.tier7PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 7 Solar Panels");
		
		ConfigValues.tier8PanelCapacity = config.getInt("tier8PanelCapacity", categoryPowerGen, ConfigValues.tier8PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 8 Solar Panels");
		ConfigValues.tier8PanelPowerGen = config.getInt("tier8PanelPowerGen", categoryPowerGen, ConfigValues.tier8PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 8 Solar Panels");
		ConfigValues.tier8PanelTransferRate = config.getInt("tier8PanelTransferRate", categoryPowerGen, ConfigValues.tier8PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 8 Solar Panels");
		
		ConfigValues.tier9PanelCapacity = config.getInt("tier9PanelCapacity", categoryPowerGen, ConfigValues.tier9PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 9 Solar Panels");
		ConfigValues.tier9PanelPowerGen = config.getInt("tier9PanelPowerGen", categoryPowerGen, ConfigValues.tier9PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 9 Solar Panels");
		ConfigValues.tier9PanelTransferRate = config.getInt("tier9PanelTransferRate", categoryPowerGen, ConfigValues.tier9PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 9 Solar Panels");
		
		ConfigValues.tier10PanelCapacity = config.getInt("tier10PanelCapacity", categoryPowerGen, ConfigValues.tier10PanelCapacity, Integer.MIN_VALUE, Integer.MAX_VALUE, "Capacity of Tier 10 Solar Panels");
		ConfigValues.tier10PanelPowerGen = config.getInt("tier10PanelPowerGen", categoryPowerGen, ConfigValues.tier10PanelPowerGen, Integer.MIN_VALUE, Integer.MAX_VALUE, "Power Generation of Tier 10 Solar Panels");
		ConfigValues.tier10PanelTransferRate = config.getInt("tier10PanelTransferRate", categoryPowerGen, ConfigValues.tier10PanelTransferRate, Integer.MIN_VALUE, Integer.MAX_VALUE, "Transfer Rate of Tier 10 Solar Panels");
		
		if(config.hasChanged()){
			config.save();
		}
		
	}
	
}
