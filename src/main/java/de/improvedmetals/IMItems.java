package de.improvedmetals;

import java.util.ArrayList;
import java.util.List;

import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.handler.MaterialHandler;
import de.improvedmetals.common.items.armor.ItemTeslaChargedArmor;
import de.improvedmetals.common.items.armor.dragon.ItemDragonBoots;
import de.improvedmetals.common.items.armor.dragon.ItemDragonChest;
import de.improvedmetals.common.items.armor.dragon.ItemDragonHelmet;
import de.improvedmetals.common.items.armor.dragon.ItemDragonLeggs;
import de.improvedmetals.common.items.armor.emerald.ItemEmeraldBoots;
import de.improvedmetals.common.items.armor.emerald.ItemEmeraldChest;
import de.improvedmetals.common.items.armor.emerald.ItemEmeraldHelmet;
import de.improvedmetals.common.items.armor.emerald.ItemEmeraldLeggs;
import de.improvedmetals.common.items.armor.imdiamond.ItemIMDiamondBoots;
import de.improvedmetals.common.items.armor.imdiamond.ItemIMDiamondChest;
import de.improvedmetals.common.items.armor.imdiamond.ItemIMDiamondHelmet;
import de.improvedmetals.common.items.armor.imdiamond.ItemIMDiamondLeggs;
import de.improvedmetals.common.items.armor.imemerald.ItemIMEmeraldBoots;
import de.improvedmetals.common.items.armor.imemerald.ItemIMEmeraldChest;
import de.improvedmetals.common.items.armor.imemerald.ItemIMEmeraldHelmet;
import de.improvedmetals.common.items.armor.imemerald.ItemIMEmeraldLeggs;
import de.improvedmetals.common.items.armor.imobsidian.ItemIMObsidianBoots;
import de.improvedmetals.common.items.armor.imobsidian.ItemIMObsidianChest;
import de.improvedmetals.common.items.armor.imobsidian.ItemIMObsidianHelmet;
import de.improvedmetals.common.items.armor.imobsidian.ItemIMObsidianLeggs;
import de.improvedmetals.common.items.armor.obsidian.ItemObsidianBoots;
import de.improvedmetals.common.items.armor.obsidian.ItemObsidianChest;
import de.improvedmetals.common.items.armor.obsidian.ItemObsidianHelmet;
import de.improvedmetals.common.items.armor.obsidian.ItemObsidianLeggs;
import de.improvedmetals.common.items.armor.wither.ItemWitherBoots;
import de.improvedmetals.common.items.armor.wither.ItemWitherChest;
import de.improvedmetals.common.items.armor.wither.ItemWitherHelmet;
import de.improvedmetals.common.items.armor.wither.ItemWitherLeggs;
import de.improvedmetals.common.items.energy.ItemBattery;
import de.improvedmetals.common.items.material.ItemExperiencePearl;
import de.improvedmetals.common.items.material.ItemIngot;
import de.improvedmetals.common.items.material.ItemMaterial;
import de.improvedmetals.common.items.material.ItemNugget;
import de.improvedmetals.common.items.material.ItemPlate;
import de.improvedmetals.common.items.tools.ToolAxe;
import de.improvedmetals.common.items.tools.ToolChargedAntiMaterializer;
import de.improvedmetals.common.items.tools.ToolForgeHammer;
import de.improvedmetals.common.items.tools.ToolHoe;
import de.improvedmetals.common.items.tools.ToolPickaxe;
import de.improvedmetals.common.items.tools.ToolShovel;
import de.improvedmetals.common.items.tools.ToolSword;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IMItems {

	public static List<Item> ITEMS = new ArrayList();
	
	//Materials
	public static Item INGOT, NUGGET, PLATE, DRAGON_CLAW, DRAGON_SCALE, WITHER_BONE, SOLAR_PANEL_SCREEN, EXPERIENCE_PEARL;
	
	//Tools
	public static Item COPPER_AXE, BRONZE_AXE, EMERALD_AXE, OBSIDIAN_AXE, GLOWSTONE_AXE,PRISMARINE_AXE,IMPROVED_DIAMOND_AXE,IMPROVED_EMERALD_AXE,IMPROVED_OBSIDIAN_AXE,IMPROVED_GLOWSTONE_AXE, WITHER_AXE, DRAGON_AXE;

	public static Item COPPER_HOE, BRONZE_HOE, EMERALD_HOE, OBSIDIAN_HOE, GLOWSTONE_HOE, PRISMARINE_HOE, IMPROVED_DIAMOND_HOE, IMPROVED_EMERALD_HOE, IMPROVED_OBSIDIAN_HOE, IMPROVED_GLOWSTONE_HOE, WITHER_HOE, DRAGON_HOE;

	public static Item COPPER_PICKAXE, BRONZE_PICKAXE, EMERALD_PICKAXE, OBSIDIAN_PICKAXE, GLOWSTONE_PICKAXE, PRISMARINE_PICKAXE, IMPROVED_DIAMOND_PICKAXE, IMPROVED_EMERALD_PICKAXE, IMPROVED_OBSIDIAN_PICKAXE, IMPROVED_GLOWSTONE_PICKAXE, WITHER_PICKAXE, DRAGON_PICKAXE;

	public static Item COPPER_SHOVEL, BRONZE_SHOVEL, EMERALD_SHOVEL, OBSIDIAN_SHOVEL, GLOWSTONE_SHOVEL, PRISMARINE_SHOVEL, IMPROVED_DIAMOND_SHOVEL, IMPROVED_EMERALD_SHOVEL, IMPROVED_OBSIDIAN_SHOVEL, IMPROVED_GLOWSTONE_SHOVEL, WITHER_SHOVEL, DRAGON_SHOVEL;

	public static Item COPPER_SWORD, BRONZE_SWORD, EMERALD_SWORD, OBSIDIAN_SWORD, GLOWSTONE_SWORD, PRISMARINE_SWORD, IMPROVED_DIAMOND_SWORD, IMPROVED_EMERALD_SWORD, IMPROVED_OBSIDIAN_SWORD, IMPROVED_GLOWSTONE_SWORD, WITHER_SWORD, DRAGON_SWORD;

	public static Item FORGE_HAMMER, ANTI_MATERIALIZER, BATTERY_2K, BATTERY_8K, BATTERY_32K, BATTERY_128K, BATTERY_512K, BATTERY_2M;
	
	//Armor
	public static Item DRAGON_BOOTS, DRAGON_CHEST, DRAGON_LEGGS, DRAGON_HELMET;
	
	public static Item EMERALD_BOOTS, EMERALD_CHEST, EMERALD_LEGGS, EMERALD_HELMET;

	public static Item OBSIDIAN_BOOTS, OBSIDIAN_CHEST, OBSIDIAN_LEGGS, OBSIDIAN_HELMET;

	public static Item IMOBSIDIAN_BOOTS, IMOBSIDIAN_CHEST, IMOBSIDIAN_LEGGS, IMOBSIDIAN_HELMET;

	public static Item IMDIAMOND_BOOTS, IMDIAMOND_CHEST, IMDIAMOND_LEGGS, IMDIAMOND_HELMET;

	public static Item IMEMERALD_BOOTS, IMEMERALD_CHEST, IMEMERALD_LEGGS,IMEMERALD_HELMET;

	public static Item WITHER_BOOTS, WITHER_CHEST, WITHER_LEGGS, WITHER_HELMET;

	public static Item TESLA_HELMET, TESLA_CHEST, TESLA_LEGGS, TESLA_BOOTS, TESLA_JET_CHEST;
	
	//Tools
	
	public static void init(){
		INGOT = new ItemIngot();
		NUGGET = new ItemNugget();
		PLATE = new ItemPlate();
		DRAGON_CLAW = new ItemMaterial("dragon_claw");
		DRAGON_SCALE = new ItemMaterial("dragon_scale");
		WITHER_BONE = new ItemMaterial("wither_bone");
		SOLAR_PANEL_SCREEN = new ItemMaterial("solar_panel_screen");
		EXPERIENCE_PEARL = new ItemExperiencePearl("experience_orb");
		
		COPPER_AXE = new ToolAxe(MaterialHandler.TOOLS.COPPER, "copper_axe");
		BRONZE_AXE = new ToolAxe(MaterialHandler.TOOLS.BRONZE, "bronze_axe");
		EMERALD_AXE = new ToolAxe(MaterialHandler.TOOLS.EMERALD, "emerald_axe");
		OBSIDIAN_AXE = new ToolAxe(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_axe");
		GLOWSTONE_AXE = new ToolAxe(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_axe");
		PRISMARINE_AXE = new ToolAxe(MaterialHandler.TOOLS.PRISMARINE, "prismarine_axe");
		IMPROVED_DIAMOND_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_axe");
		IMPROVED_EMERALD_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_axe");
		IMPROVED_OBSIDIAN_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_axe");
		IMPROVED_GLOWSTONE_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_axe");
		WITHER_AXE = new ToolAxe(MaterialHandler.TOOLS.WITHER, "wither_axe");
		DRAGON_AXE = new ToolAxe(MaterialHandler.TOOLS.DRAGON, "dragon_axe");
		
		COPPER_HOE = new ToolHoe(MaterialHandler.TOOLS.COPPER, "copper_hoe");
		BRONZE_HOE = new ToolHoe(MaterialHandler.TOOLS.BRONZE, "bronze_hoe");
		EMERALD_HOE = new ToolHoe(MaterialHandler.TOOLS.EMERALD, "emerald_hoe");
		OBSIDIAN_HOE = new ToolHoe(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_hoe");
		GLOWSTONE_HOE = new ToolHoe(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_hoe");
		PRISMARINE_HOE = new ToolHoe(MaterialHandler.TOOLS.PRISMARINE, "prismarine_hoe");
		IMPROVED_DIAMOND_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_hoe");
		IMPROVED_EMERALD_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_hoe");
		IMPROVED_OBSIDIAN_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_hoe");
		IMPROVED_GLOWSTONE_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_hoe");
		WITHER_HOE = new ToolHoe(MaterialHandler.TOOLS.WITHER, "wither_hoe");
		DRAGON_HOE = new ToolHoe(MaterialHandler.TOOLS.DRAGON, "dragon_hoe");
		
		COPPER_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.COPPER, "copper_pickaxe");
		BRONZE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.BRONZE, "bronze_pickaxe");
		EMERALD_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.EMERALD, "emerald_pickaxe");
		OBSIDIAN_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_pickaxe");
		GLOWSTONE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_pickaxe");
		PRISMARINE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.PRISMARINE, "prismarine_pickaxe");
		IMPROVED_DIAMOND_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_pickaxe");
		IMPROVED_EMERALD_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_pickaxe");
		IMPROVED_OBSIDIAN_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_pickaxe");
		IMPROVED_GLOWSTONE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_pickaxe");
		WITHER_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.WITHER, "wither_pickaxe");
		DRAGON_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.DRAGON, "dragon_pickaxe");
		
		COPPER_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.COPPER, "copper_shovel");
		BRONZE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.BRONZE, "bronze_shovel");
		EMERALD_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.EMERALD, "emerald_shovel");
		OBSIDIAN_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_shovel");
		GLOWSTONE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_shovel");
		PRISMARINE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.PRISMARINE, "prismarine_shovel");
		IMPROVED_DIAMOND_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_shovel");
		IMPROVED_EMERALD_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_shovel");
		IMPROVED_OBSIDIAN_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_shovel");
		IMPROVED_GLOWSTONE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_shovel");
		WITHER_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.WITHER, "wither_shovel");
		DRAGON_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.DRAGON, "dragon_shovel");
		
		COPPER_SWORD = new ToolSword(MaterialHandler.TOOLS.COPPER, "copper_sword");
		BRONZE_SWORD = new ToolSword(MaterialHandler.TOOLS.BRONZE, "bronze_sword");
		EMERALD_SWORD = new ToolSword(MaterialHandler.TOOLS.EMERALD, "emerald_sword");
		OBSIDIAN_SWORD = new ToolSword(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_sword");
		GLOWSTONE_SWORD = new ToolSword(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_sword");
		PRISMARINE_SWORD = new ToolSword(MaterialHandler.TOOLS.PRISMARINE, "prismarine_sword");
		IMPROVED_DIAMOND_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_sword");
		IMPROVED_EMERALD_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_sword");
		IMPROVED_OBSIDIAN_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_sword");
		IMPROVED_GLOWSTONE_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_sword");
		WITHER_SWORD = new ToolSword(MaterialHandler.TOOLS.WITHER, "wither_sword");
		DRAGON_SWORD = new ToolSword(MaterialHandler.TOOLS.DRAGON, "dragon_sword");
		
		FORGE_HAMMER = new ToolForgeHammer(256);
		
		ANTI_MATERIALIZER = new ToolChargedAntiMaterializer(40000, 120, 20, "antiMaterializer", "ItemAntiMaterializer");
		BATTERY_2K = new ItemBattery(2000, 50, "battery2k", "ItemBattery2K");
		BATTERY_8K = new ItemBattery(8000, 200, "battery8K", "ItemBattery8K");
		BATTERY_32K = new ItemBattery(32000, 800, "battery32k", "ItemBattery32K");
		BATTERY_128K = new ItemBattery(128000, 3200, "battery128k", "ItemBattery128K");
		BATTERY_512K = new ItemBattery(512000, 12800, "battery512k", "ItemBattery512K");
		BATTERY_2M = new ItemBattery(2048000, 51200, "battery2M", "ItemBattery2M");
		
		DRAGON_BOOTS = new ItemDragonBoots("dragon_boots", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.FEET);
		DRAGON_CHEST = new ItemDragonChest("dragon_chest", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.CHEST);
		DRAGON_LEGGS = new ItemDragonLeggs("dragon_leggs", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.LEGS);
		DRAGON_HELMET = new ItemDragonHelmet("dragon_helmet", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.HEAD);
		EMERALD_BOOTS = new ItemEmeraldBoots("emerald_boots", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.FEET);
		EMERALD_CHEST = new ItemEmeraldChest("emerald_chest", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.CHEST);
		EMERALD_LEGGS = new ItemEmeraldLeggs("emerald_leggs", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.LEGS);
		EMERALD_HELMET = new ItemEmeraldHelmet("emerald_helmet", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.HEAD);
		OBSIDIAN_BOOTS = new ItemObsidianBoots("obsidian_boots", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.FEET);
		OBSIDIAN_CHEST = new ItemObsidianChest("obsidian_chest", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.CHEST);
		OBSIDIAN_LEGGS = new ItemObsidianLeggs("obsidian_leggs", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.LEGS);
		OBSIDIAN_HELMET = new ItemObsidianHelmet("obsidian_helmet", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.HEAD);
		IMOBSIDIAN_BOOTS = new ItemIMObsidianBoots("imobsidian_boots", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.FEET);
		IMOBSIDIAN_CHEST = new ItemIMObsidianChest("imobsidian_chest", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.CHEST);
		IMOBSIDIAN_LEGGS = new ItemIMObsidianLeggs("imobsidian_leggs", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.LEGS);
		IMOBSIDIAN_HELMET = new ItemIMObsidianHelmet("imobsidian_helmet", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.HEAD);
		IMDIAMOND_BOOTS = new ItemIMDiamondBoots("imdiamond_boots", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.FEET);
		IMDIAMOND_CHEST = new ItemIMDiamondChest("imdiamond_chest", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.CHEST);
		IMDIAMOND_LEGGS = new ItemIMDiamondLeggs("imdiamond_leggs", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.LEGS);
		IMDIAMOND_HELMET = new ItemIMDiamondHelmet("imdiamond_helmet", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.HEAD);
		IMEMERALD_BOOTS = new ItemIMEmeraldBoots("imemerald_boots", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.FEET);
		IMEMERALD_CHEST = new ItemIMEmeraldChest("imemerald_chest", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.CHEST);
		IMEMERALD_LEGGS = new ItemIMEmeraldLeggs("imemerald_leggs", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.LEGS);
		IMEMERALD_HELMET = new ItemIMEmeraldHelmet("imemerald_helmet", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.HEAD);
		WITHER_BOOTS = new ItemWitherBoots("wither_boots", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.FEET);
		WITHER_CHEST = new ItemWitherChest("wither_chest", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.CHEST);
		WITHER_LEGGS = new ItemWitherLeggs("wither_leggs", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.LEGS);
		WITHER_HELMET = new ItemWitherHelmet("wither_helmet", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.HEAD);
		TESLA_HELMET = new ItemTeslaChargedArmor("charged_helmet", "ItemChargedHelmet", MaterialHandler.ARMOR.CHARGED, 1, EntityEquipmentSlot.HEAD);
		TESLA_CHEST = new ItemTeslaChargedArmor("charged_chest", "ItemChargedChest", MaterialHandler.ARMOR.CHARGED, 1, EntityEquipmentSlot.CHEST);
		TESLA_LEGGS = new ItemTeslaChargedArmor("charged_leggs", "ItemChargedLeggs", MaterialHandler.ARMOR.CHARGED, 2, EntityEquipmentSlot.LEGS);
		TESLA_BOOTS = new ItemTeslaChargedArmor("charged_boots", "ItemChargedBoots", MaterialHandler.ARMOR.CHARGED, 1, EntityEquipmentSlot.FEET);
		TESLA_JET_CHEST = new ItemTeslaChargedArmor("charged_jet_chest", "ItemChargedJetChest", MaterialHandler.ARMOR.CHARGED, 1, EntityEquipmentSlot.CHEST);
		
		reg();
		
	}
	
	public static void reg(){
		
		ITEMS.add(INGOT);
		ITEMS.add(NUGGET);
		ITEMS.add(PLATE);
		ITEMS.add(DRAGON_CLAW);
		ITEMS.add(DRAGON_SCALE);
		ITEMS.add(WITHER_BONE);
		//ITEMS.add(SOLAR_PANEL_SCREEN);
		ITEMS.add(EXPERIENCE_PEARL);
		
		ITEMS.add(FORGE_HAMMER);
		ITEMS.add(ANTI_MATERIALIZER);
		ITEMS.add(BATTERY_2K);
		ITEMS.add(BATTERY_8K);
		ITEMS.add(BATTERY_32K);
		ITEMS.add(BATTERY_128K);
		ITEMS.add(BATTERY_512K);
		ITEMS.add(BATTERY_2M);
		
		if(ConfigValues.copperTools){
			ITEMS.add(COPPER_AXE);
			ITEMS.add(COPPER_HOE);
			ITEMS.add(COPPER_PICKAXE);
			ITEMS.add(COPPER_SHOVEL);
			ITEMS.add(COPPER_SWORD);
		}
		if(ConfigValues.bronzeTools){
			ITEMS.add(BRONZE_AXE);
			ITEMS.add(BRONZE_HOE);
			ITEMS.add(BRONZE_PICKAXE);
			ITEMS.add(BRONZE_SHOVEL);
			ITEMS.add(BRONZE_SWORD);
		}
		if(ConfigValues.emeraldTools){
			ITEMS.add(EMERALD_AXE);
			ITEMS.add(EMERALD_HOE);
			ITEMS.add(EMERALD_PICKAXE);
			ITEMS.add(EMERALD_SHOVEL);
			ITEMS.add(EMERALD_SWORD);
		}
		if(ConfigValues.obsidianTools){
			ITEMS.add(OBSIDIAN_AXE);
			ITEMS.add(OBSIDIAN_HOE);
			ITEMS.add(OBSIDIAN_PICKAXE);
			ITEMS.add(OBSIDIAN_SHOVEL);
			ITEMS.add(OBSIDIAN_SWORD);
		}
		if(ConfigValues.glowstoneTools){
			ITEMS.add(GLOWSTONE_AXE);
			ITEMS.add(GLOWSTONE_HOE);
			ITEMS.add(GLOWSTONE_PICKAXE);
			ITEMS.add(GLOWSTONE_SHOVEL);
			ITEMS.add(GLOWSTONE_SWORD);
		}
		if(ConfigValues.prismarineTools){
			ITEMS.add(PRISMARINE_AXE);
			ITEMS.add(PRISMARINE_HOE);
			ITEMS.add(PRISMARINE_PICKAXE);
			ITEMS.add(PRISMARINE_SHOVEL);
			ITEMS.add(PRISMARINE_SWORD);
		}
		if(ConfigValues.improvedDiamondTools){
			ITEMS.add(IMPROVED_DIAMOND_AXE);
			ITEMS.add(IMPROVED_DIAMOND_HOE);
			ITEMS.add(IMPROVED_DIAMOND_PICKAXE);
			ITEMS.add(IMPROVED_DIAMOND_SHOVEL);
			ITEMS.add(IMPROVED_DIAMOND_SWORD);
		}
		if(ConfigValues.improvedEmeraldTools){
			ITEMS.add(IMPROVED_EMERALD_AXE);
			ITEMS.add(IMPROVED_EMERALD_HOE);
			ITEMS.add(IMPROVED_EMERALD_PICKAXE);
			ITEMS.add(IMPROVED_EMERALD_SHOVEL);
			ITEMS.add(IMPROVED_EMERALD_SWORD);
		}
		if(ConfigValues.improvedObsidianTools){
			ITEMS.add(IMPROVED_OBSIDIAN_AXE);
			ITEMS.add(IMPROVED_OBSIDIAN_HOE);
			ITEMS.add(IMPROVED_OBSIDIAN_PICKAXE);
			ITEMS.add(IMPROVED_OBSIDIAN_SHOVEL);
			ITEMS.add(IMPROVED_OBSIDIAN_SWORD);
		}
		if(ConfigValues.improvedGlowstoneTools){
			ITEMS.add(IMPROVED_GLOWSTONE_AXE);
			ITEMS.add(IMPROVED_GLOWSTONE_HOE);
			ITEMS.add(IMPROVED_GLOWSTONE_PICKAXE);
			ITEMS.add(IMPROVED_GLOWSTONE_SHOVEL);
			ITEMS.add(IMPROVED_GLOWSTONE_SWORD);
		}
		if(ConfigValues.witherTools){
			ITEMS.add(WITHER_AXE);
			ITEMS.add(WITHER_HOE);
			ITEMS.add(WITHER_PICKAXE);
			ITEMS.add(WITHER_SHOVEL);
			ITEMS.add(WITHER_SWORD);
		}
		if(ConfigValues.dragonTools){
			ITEMS.add(DRAGON_AXE);
			ITEMS.add(DRAGON_HOE);
			ITEMS.add(DRAGON_PICKAXE);
			ITEMS.add(DRAGON_SHOVEL);
			ITEMS.add(DRAGON_SWORD);
		}
		
		ITEMS.add(EMERALD_HELMET);
		ITEMS.add(EMERALD_CHEST);
		ITEMS.add(EMERALD_LEGGS);
		ITEMS.add(EMERALD_BOOTS);
		ITEMS.add(OBSIDIAN_HELMET);
		ITEMS.add(OBSIDIAN_CHEST);
		ITEMS.add(OBSIDIAN_LEGGS);
		ITEMS.add(OBSIDIAN_BOOTS);
		ITEMS.add(IMDIAMOND_HELMET);
		ITEMS.add(IMDIAMOND_CHEST);
		ITEMS.add(IMDIAMOND_LEGGS);
		ITEMS.add(IMDIAMOND_BOOTS);
		ITEMS.add(IMEMERALD_HELMET);
		ITEMS.add(IMEMERALD_CHEST);
		ITEMS.add(IMEMERALD_LEGGS);
		ITEMS.add(IMEMERALD_BOOTS);
		ITEMS.add(IMOBSIDIAN_HELMET);
		ITEMS.add(IMOBSIDIAN_CHEST);
		ITEMS.add(IMOBSIDIAN_LEGGS);
		ITEMS.add(IMOBSIDIAN_BOOTS);
		ITEMS.add(WITHER_HELMET);
		ITEMS.add(WITHER_CHEST);
		ITEMS.add(WITHER_LEGGS);
		ITEMS.add(WITHER_BOOTS);
		ITEMS.add(DRAGON_HELMET);
		ITEMS.add(DRAGON_CHEST);
		ITEMS.add(DRAGON_LEGGS);
		ITEMS.add(DRAGON_BOOTS);
		ITEMS.add(TESLA_HELMET);
		ITEMS.add(TESLA_CHEST);
		ITEMS.add(TESLA_JET_CHEST);
		ITEMS.add(TESLA_LEGGS);
		ITEMS.add(TESLA_BOOTS);
		
		
		for (Item item : ITEMS){
			GameRegistry.register(item);
		}
		
	}
	
}
