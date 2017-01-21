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
import de.improvedmetals.common.items.material.ItemIngot;
import de.improvedmetals.common.items.material.ItemMaterial;
import de.improvedmetals.common.items.material.ItemNugget;
import de.improvedmetals.common.items.material.ItemPlate;
import de.improvedmetals.common.items.stuff.ItemExperiencePearl;
import de.improvedmetals.common.items.tools.ToolAxe;
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
	public static ItemIngot INGOT = new ItemIngot();
	public static ItemNugget NUGGET = new ItemNugget();
	public static ItemPlate PLATE = new ItemPlate();
	public static ItemMaterial DRAGON_CLAW = new ItemMaterial("dragon_claw");
	public static ItemMaterial DRAGON_SCALE = new ItemMaterial("dragon_scale");
	public static ItemMaterial WITHER_BONE = new ItemMaterial("wither_bone");
	public static ItemMaterial SOLAR_PANEL_SCREEN = new ItemMaterial("solar_panel_screen");
	public static ItemExperiencePearl EXPERIENCE_PEARL = new ItemExperiencePearl("experience_orb");
	public static ToolAxe COPPER_AXE = new ToolAxe(MaterialHandler.TOOLS.COPPER, "copper_axe");
	public static ToolAxe BRONZE_AXE = new ToolAxe(MaterialHandler.TOOLS.BRONZE, "bronze_axe");
	public static ToolAxe EMERALD_AXE = new ToolAxe(MaterialHandler.TOOLS.EMERALD, "emerald_axe");
	public static ToolAxe OBSIDIAN_AXE = new ToolAxe(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_axe");
	public static ToolAxe GLOWSTONE_AXE = new ToolAxe(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_axe");
	public static ToolAxe PRISMARINE_AXE = new ToolAxe(MaterialHandler.TOOLS.PRISMARINE, "prismarine_axe");
	public static ToolAxe IMPROVED_DIAMOND_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_axe");
	public static ToolAxe IMPROVED_EMERALD_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_axe");
	public static ToolAxe IMPROVED_OBSIDIAN_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_axe");
	public static ToolAxe IMPROVED_GLOWSTONE_AXE = new ToolAxe(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_axe");
	public static ToolAxe WITHER_AXE = new ToolAxe(MaterialHandler.TOOLS.WITHER, "wither_axe");
	public static ToolAxe DRAGON_AXE = new ToolAxe(MaterialHandler.TOOLS.DRAGON, "dragon_axe");
	public static ToolHoe COPPER_HOE = new ToolHoe(MaterialHandler.TOOLS.COPPER, "copper_hoe");
	public static ToolHoe BRONZE_HOE = new ToolHoe(MaterialHandler.TOOLS.BRONZE, "bronze_hoe");
	public static ToolHoe EMERALD_HOE = new ToolHoe(MaterialHandler.TOOLS.EMERALD, "emerald_hoe");
	public static ToolHoe OBSIDIAN_HOE = new ToolHoe(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_hoe");
	public static ToolHoe GLOWSTONE_HOE = new ToolHoe(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_hoe");
	public static ToolHoe PRISMARINE_HOE = new ToolHoe(MaterialHandler.TOOLS.PRISMARINE, "prismarine_hoe");
	public static ToolHoe IMPROVED_DIAMOND_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_hoe");
	public static ToolHoe IMPROVED_EMERALD_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_hoe");
	public static ToolHoe IMPROVED_OBSIDIAN_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_hoe");
	public static ToolHoe IMPROVED_GLOWSTONE_HOE = new ToolHoe(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_hoe");
	public static ToolHoe WITHER_HOE = new ToolHoe(MaterialHandler.TOOLS.WITHER, "wither_hoe");
	public static ToolHoe DRAGON_HOE = new ToolHoe(MaterialHandler.TOOLS.DRAGON, "dragon_hoe");
	public static ToolPickaxe COPPER_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.COPPER, "copper_pickaxe");
	public static ToolPickaxe BRONZE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.BRONZE, "bronze_pickaxe");
	public static ToolPickaxe EMERALD_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.EMERALD, "emerald_pickaxe");
	public static ToolPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_pickaxe");
	public static ToolPickaxe GLOWSTONE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_pickaxe");
	public static ToolPickaxe PRISMARINE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.PRISMARINE, "prismarine_pickaxe");
	public static ToolPickaxe IMPROVED_DIAMOND_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_pickaxe");
	public static ToolPickaxe IMPROVED_EMERALD_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_pickaxe");
	public static ToolPickaxe IMPROVED_OBSIDIAN_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_pickaxe");
	public static ToolPickaxe IMPROVED_GLOWSTONE_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_pickaxe");
	public static ToolPickaxe WITHER_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.WITHER, "wither_pickaxe");
	public static ToolPickaxe DRAGON_PICKAXE = new ToolPickaxe(MaterialHandler.TOOLS.DRAGON, "dragon_pickaxe");
	public static ToolShovel COPPER_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.COPPER, "copper_shovel");
	public static ToolShovel BRONZE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.BRONZE, "bronze_shovel");
	public static ToolShovel EMERALD_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.EMERALD, "emerald_shovel");
	public static ToolShovel OBSIDIAN_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_shovel");
	public static ToolShovel GLOWSTONE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_shovel");
	public static ToolShovel PRISMARINE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.PRISMARINE, "prismarine_shovel");
	public static ToolShovel IMPROVED_DIAMOND_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_shovel");
	public static ToolShovel IMPROVED_EMERALD_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_shovel");
	public static ToolShovel IMPROVED_OBSIDIAN_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_shovel");
	public static ToolShovel IMPROVED_GLOWSTONE_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_shovel");
	public static ToolShovel WITHER_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.WITHER, "wither_shovel");
	public static ToolShovel DRAGON_SHOVEL = new ToolShovel(MaterialHandler.TOOLS.DRAGON, "dragon_shovel");
	public static ToolSword COPPER_SWORD = new ToolSword(MaterialHandler.TOOLS.COPPER, "copper_sword");
	public static ToolSword BRONZE_SWORD = new ToolSword(MaterialHandler.TOOLS.BRONZE, "bronze_sword");
	public static ToolSword EMERALD_SWORD = new ToolSword(MaterialHandler.TOOLS.EMERALD, "emerald_sword");
	public static ToolSword OBSIDIAN_SWORD = new ToolSword(MaterialHandler.TOOLS.OBSIDIAN, "obsidian_sword");
	public static ToolSword GLOWSTONE_SWORD = new ToolSword(MaterialHandler.TOOLS.GLOWSTONE, "glowstone_sword");
	public static ToolSword PRISMARINE_SWORD = new ToolSword(MaterialHandler.TOOLS.PRISMARINE, "prismarine_sword");
	public static ToolSword IMPROVED_DIAMOND_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_DIAMOND, "improved_diamond_sword");
	public static ToolSword IMPROVED_EMERALD_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_EMERALD, "improved_emerald_sword");
	public static ToolSword IMPROVED_OBSIDIAN_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_OBSIDIAN, "improved_obsidian_sword");
	public static ToolSword IMPROVED_GLOWSTONE_SWORD = new ToolSword(MaterialHandler.TOOLS.IMPROVED_GLOWSTONE, "improved_glowstone_sword");
	public static ToolSword WITHER_SWORD = new ToolSword(MaterialHandler.TOOLS.WITHER, "wither_sword");
	public static ToolSword DRAGON_SWORD = new ToolSword(MaterialHandler.TOOLS.DRAGON, "dragon_sword");
	public static ToolForgeHammer FORGE_HAMMER = new ToolForgeHammer(256);
	public static ItemDragonBoots DRAGON_BOOTS = new ItemDragonBoots("dragon_boots", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.FEET);
	public static ItemDragonChest DRAGON_CHEST = new ItemDragonChest("dragon_chest", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.CHEST);
	public static ItemDragonLeggs DRAGON_LEGGS = new ItemDragonLeggs("dragon_leggs", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.LEGS);
	public static ItemDragonHelmet DRAGON_HELMET = new ItemDragonHelmet("dragon_helmet", MaterialHandler.ARMOR.DRAGON, 0, EntityEquipmentSlot.HEAD);
	public static ItemEmeraldBoots EMERALD_BOOTS = new ItemEmeraldBoots("emerald_boots", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.FEET);
	public static ItemEmeraldChest EMERALD_CHEST = new ItemEmeraldChest("emerald_chest", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.CHEST);
	public static ItemEmeraldLeggs EMERALD_LEGGS = new ItemEmeraldLeggs("emerald_leggs", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.LEGS);
	public static ItemEmeraldHelmet EMERALD_HELMET = new ItemEmeraldHelmet("emerald_helmet", MaterialHandler.ARMOR.EMERALD, 0, EntityEquipmentSlot.HEAD);
	public static ItemObsidianBoots OBSIDIAN_BOOTS = new ItemObsidianBoots("obsidian_boots", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.FEET);
	public static ItemObsidianChest OBSIDIAN_CHEST = new ItemObsidianChest("obsidian_chest", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.CHEST);
	public static ItemObsidianLeggs OBSIDIAN_LEGGS = new ItemObsidianLeggs("obsidian_leggs", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.LEGS);
	public static ItemObsidianHelmet OBSIDIAN_HELMET = new ItemObsidianHelmet("obsidian_helmet", MaterialHandler.ARMOR.OBSIDIAN, 0, EntityEquipmentSlot.HEAD);
	public static ItemIMObsidianBoots IMOBSIDIAN_BOOTS = new ItemIMObsidianBoots("imobsidian_boots", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.FEET);
	public static ItemIMObsidianChest IMOBSIDIAN_CHEST = new ItemIMObsidianChest("imobsidian_chest", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.CHEST);
	public static ItemIMObsidianLeggs IMOBSIDIAN_LEGGS = new ItemIMObsidianLeggs("imobsidian_leggs", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.LEGS);
	public static ItemIMObsidianHelmet IMOBSIDIAN_HELMET = new ItemIMObsidianHelmet("imobsidian_helmet", MaterialHandler.ARMOR.IMPROVED_OBSIDIAN, 0, EntityEquipmentSlot.HEAD);
	public static ItemIMDiamondBoots IMDIAMOND_BOOTS = new ItemIMDiamondBoots("imdiamond_boots", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.FEET);
	public static ItemIMDiamondChest IMDIAMOND_CHEST = new ItemIMDiamondChest("imdiamond_chest", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.CHEST);
	public static ItemIMDiamondLeggs IMDIAMOND_LEGGS = new ItemIMDiamondLeggs("imdiamond_leggs", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.LEGS);
	public static ItemIMDiamondHelmet IMDIAMOND_HELMET = new ItemIMDiamondHelmet("imdiamond_helmet", MaterialHandler.ARMOR.IMPROVED_DIAMOND, 0, EntityEquipmentSlot.HEAD);
	public static ItemIMEmeraldBoots IMEMERALD_BOOTS = new ItemIMEmeraldBoots("imemerald_boots", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.FEET);
	public static ItemIMEmeraldChest IMEMERALD_CHEST = new ItemIMEmeraldChest("imemerald_chest", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.CHEST);
	public static ItemIMEmeraldLeggs IMEMERALD_LEGGS = new ItemIMEmeraldLeggs("imemerald_leggs", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.LEGS);
	public static ItemIMEmeraldHelmet IMEMERALD_HELMET = new ItemIMEmeraldHelmet("imemerald_helmet", MaterialHandler.ARMOR.IMPROVED_EMERALD, 0, EntityEquipmentSlot.HEAD);
	public static ItemWitherBoots WITHER_BOOTS = new ItemWitherBoots("wither_boots", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.FEET);
	public static ItemWitherChest WITHER_CHEST = new ItemWitherChest("wither_chest", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.CHEST);
	public static ItemWitherLeggs WITHER_LEGGS = new ItemWitherLeggs("wither_leggs", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.LEGS);
	public static ItemWitherHelmet WITHER_HELMET = new ItemWitherHelmet("wither_helmet", MaterialHandler.ARMOR.WITHER, 0, EntityEquipmentSlot.HEAD);
	public static Item TESLA_HELMET = (Item) new ItemTeslaChargedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD, 150000L, 200L, 200L).setRegistryName("charged.helmet");
	public static Item TESLA_CHEST = (Item) new ItemTeslaChargedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.CHEST, 150000L, 200L, 200L).setRegistryName("charged.chest");
	public static Item TESLA_LEGGS = (Item) new ItemTeslaChargedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.LEGS, 150000L, 200L, 200L).setRegistryName("charged.leggs");
	public static Item TESLA_BOOTS = (Item) new ItemTeslaChargedArmor(ItemArmor.ArmorMaterial.DIAMOND, EntityEquipmentSlot.FEET, 150000L, 200L, 200L).setRegistryName("charged.feet");
	
	public static void init(){
		
		ITEMS.add(INGOT);
		ITEMS.add(NUGGET);
		ITEMS.add(PLATE);
		ITEMS.add(DRAGON_CLAW);
		ITEMS.add(DRAGON_SCALE);
		ITEMS.add(WITHER_BONE);
		//ITEMS.add(SOLAR_PANEL_SCREEN);
		ITEMS.add(EXPERIENCE_PEARL);
		ITEMS.add(FORGE_HAMMER);
		
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
		ITEMS.add(TESLA_LEGGS);
		ITEMS.add(TESLA_BOOTS);
		
		for (Item item : ITEMS){
			GameRegistry.register(item);
		}
		
	}
}
