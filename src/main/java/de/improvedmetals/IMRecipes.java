package de.improvedmetals;

import de.improvedmetals.common.items.material.ItemDust;
import de.improvedmetals.common.items.material.ItemIngot;
import de.improvedmetals.common.items.material.ItemNugget;
import de.improvedmetals.common.items.material.ItemPlate;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class IMRecipes {

	public static void init(){
		normalCrafting();
		normalSmelting();
		normalCombiantor();
		normalNebulizer();
	}
	
	
	private static void normalCrafting(){
		
		ItemStack copper_axe = new ItemStack(IMItems.COPPER_AXE);
		GameRegistry.addRecipe(copper_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 'D', Items.STICK);
		ItemStack bronze_axe = new ItemStack(IMItems.BRONZE_AXE);
		GameRegistry.addRecipe(bronze_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack emerald_axe = new ItemStack(IMItems.EMERALD_AXE);
		GameRegistry.addRecipe(emerald_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'D', Items.STICK);
		ItemStack obsidian_axe = new ItemStack(IMItems.OBSIDIAN_AXE);
		GameRegistry.addRecipe(obsidian_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'D', Items.STICK);
		ItemStack glowstone_axe = new ItemStack(IMItems.GLOWSTONE_AXE);
		GameRegistry.addRecipe(glowstone_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 'D', Items.STICK);
		ItemStack prismarine_axe = new ItemStack(IMItems.PRISMARINE_AXE);
		GameRegistry.addRecipe(prismarine_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), 'D', Items.STICK);
		ItemStack improved_diamond_axe = new ItemStack(IMItems.IMPROVED_DIAMOND_AXE);
		GameRegistry.addRecipe(improved_diamond_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'D', Items.STICK);
		ItemStack improved_emerald_axe = new ItemStack(IMItems.IMPROVED_EMERALD_AXE);
		GameRegistry.addRecipe(improved_emerald_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'D', Items.STICK);
		ItemStack improved_obsidian_axe = new ItemStack(IMItems.IMPROVED_OBSIDIAN_AXE);
		GameRegistry.addRecipe(improved_obsidian_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'D', Items.STICK);
		ItemStack improved_glowstone_axe = new ItemStack(IMItems.IMPROVED_GLOWSTONE_AXE);
		GameRegistry.addRecipe(improved_glowstone_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), 'D', Items.STICK);
		ItemStack wither_axe = new ItemStack(IMItems.WITHER_AXE);
		GameRegistry.addRecipe(wither_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'D', Items.STICK);
		ItemStack dragon_axe = new ItemStack(IMItems.DRAGON_AXE);
		GameRegistry.addRecipe(dragon_axe, "SS ", "SD ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'D', Items.STICK);
		
		ItemStack copper_hoe = new ItemStack(IMItems.COPPER_HOE);
		GameRegistry.addRecipe(copper_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 'D', Items.STICK);
		ItemStack bronze_hoe = new ItemStack(IMItems.BRONZE_HOE);
		GameRegistry.addRecipe(bronze_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack emerald_hoe = new ItemStack(IMItems.EMERALD_HOE);
		GameRegistry.addRecipe(emerald_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'D', Items.STICK);
		ItemStack obsidian_hoe = new ItemStack(IMItems.OBSIDIAN_HOE);
		GameRegistry.addRecipe(obsidian_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'D', Items.STICK);
		ItemStack glowstone_hoe = new ItemStack(IMItems.GLOWSTONE_HOE);
		GameRegistry.addRecipe(glowstone_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 'D', Items.STICK);
		ItemStack prismarine_hoe = new ItemStack(IMItems.PRISMARINE_HOE);
		GameRegistry.addRecipe(prismarine_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), 'D', Items.STICK);
		ItemStack improved_diamond_hoe = new ItemStack(IMItems.IMPROVED_DIAMOND_HOE);
		GameRegistry.addRecipe(improved_diamond_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'D', Items.STICK);
		ItemStack improved_emerald_hoe = new ItemStack(IMItems.IMPROVED_EMERALD_HOE);
		GameRegistry.addRecipe(improved_emerald_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'D', Items.STICK);
		ItemStack improved_obsidian_hoe = new ItemStack(IMItems.IMPROVED_OBSIDIAN_HOE);
		GameRegistry.addRecipe(improved_obsidian_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'D', Items.STICK);
		ItemStack improved_glowstone_hoe = new ItemStack(IMItems.IMPROVED_GLOWSTONE_HOE);
		GameRegistry.addRecipe(improved_glowstone_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), 'D', Items.STICK);
		ItemStack wither_hoe = new ItemStack(IMItems.WITHER_HOE);
		GameRegistry.addRecipe(wither_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'D', Items.STICK);
		ItemStack dragon_hoe = new ItemStack(IMItems.DRAGON_HOE);
		GameRegistry.addRecipe(dragon_hoe, "SS ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'D', Items.STICK);
		
		ItemStack copper_pickaxe = new ItemStack(IMItems.COPPER_PICKAXE);
		GameRegistry.addRecipe(copper_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 'D', Items.STICK);
		ItemStack bronze_pickaxe = new ItemStack(IMItems.BRONZE_PICKAXE);
		GameRegistry.addRecipe(bronze_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack emerald_pickaxe = new ItemStack(IMItems.EMERALD_PICKAXE);
		GameRegistry.addRecipe(emerald_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'D', Items.STICK);
		ItemStack obsidian_pickaxe = new ItemStack(IMItems.OBSIDIAN_PICKAXE);
		GameRegistry.addRecipe(obsidian_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'D', Items.STICK);
		ItemStack glowstone_pickaxe = new ItemStack(IMItems.GLOWSTONE_PICKAXE);
		GameRegistry.addRecipe(glowstone_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 'D', Items.STICK);
		ItemStack prismarine_pickaxe = new ItemStack(IMItems.PRISMARINE_PICKAXE);
		GameRegistry.addRecipe(prismarine_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), 'D', Items.STICK);
		ItemStack improved_diamond_pickaxe = new ItemStack(IMItems.IMPROVED_DIAMOND_PICKAXE);
		GameRegistry.addRecipe(improved_diamond_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'D', Items.STICK);
		ItemStack improved_emerald_pickaxe = new ItemStack(IMItems.IMPROVED_EMERALD_PICKAXE);
		GameRegistry.addRecipe(improved_emerald_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'D', Items.STICK);
		ItemStack improved_obsidian_pickaxe = new ItemStack(IMItems.IMPROVED_OBSIDIAN_PICKAXE);
		GameRegistry.addRecipe(improved_obsidian_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'D', Items.STICK);
		ItemStack improved_glowstone_pickaxe = new ItemStack(IMItems.IMPROVED_GLOWSTONE_PICKAXE);
		GameRegistry.addRecipe(improved_glowstone_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), 'D', Items.STICK);
		ItemStack wither_pickaxe = new ItemStack(IMItems.WITHER_PICKAXE);
		GameRegistry.addRecipe(wither_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'D', Items.STICK);
		ItemStack dragon_pickaxe = new ItemStack(IMItems.DRAGON_PICKAXE);
		GameRegistry.addRecipe(dragon_pickaxe, "SSS", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'D', Items.STICK);
		
		ItemStack copper_shovel = new ItemStack(IMItems.COPPER_SHOVEL);
		GameRegistry.addRecipe(copper_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 'D', Items.STICK);
		ItemStack bronze_shovel = new ItemStack(IMItems.BRONZE_SHOVEL);
		GameRegistry.addRecipe(bronze_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack emerald_shovel = new ItemStack(IMItems.EMERALD_SHOVEL);
		GameRegistry.addRecipe(emerald_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'D', Items.STICK);
		ItemStack obsidian_shovel = new ItemStack(IMItems.OBSIDIAN_SHOVEL);
		GameRegistry.addRecipe(obsidian_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'D', Items.STICK);
		ItemStack glowstone_shovel = new ItemStack(IMItems.GLOWSTONE_SHOVEL);
		GameRegistry.addRecipe(glowstone_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 'D', Items.STICK);
		ItemStack prismarine_shovel = new ItemStack(IMItems.PRISMARINE_SHOVEL);
		GameRegistry.addRecipe(prismarine_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), 'D', Items.STICK);
		ItemStack improved_diamond_shovel = new ItemStack(IMItems.IMPROVED_DIAMOND_SHOVEL);
		GameRegistry.addRecipe(improved_diamond_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'D', Items.STICK);
		ItemStack improved_emerald_shovel = new ItemStack(IMItems.IMPROVED_EMERALD_SHOVEL);
		GameRegistry.addRecipe(improved_emerald_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'D', Items.STICK);
		ItemStack improved_obsidian_shovel = new ItemStack(IMItems.IMPROVED_OBSIDIAN_SHOVEL);
		GameRegistry.addRecipe(improved_obsidian_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'D', Items.STICK);
		ItemStack improved_glowstone_shovel = new ItemStack(IMItems.IMPROVED_GLOWSTONE_SHOVEL);
		GameRegistry.addRecipe(improved_glowstone_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), 'D', Items.STICK);
		ItemStack wither_shovel = new ItemStack(IMItems.WITHER_SHOVEL);
		GameRegistry.addRecipe(wither_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'D', Items.STICK);
		ItemStack dragon_shovel = new ItemStack(IMItems.DRAGON_SHOVEL);
		GameRegistry.addRecipe(dragon_shovel, " S ", " D ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'D', Items.STICK);
		
		ItemStack copper_sword = new ItemStack(IMItems.COPPER_SWORD);
		GameRegistry.addRecipe(copper_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 'D', Items.STICK);
		ItemStack bronze_sword = new ItemStack(IMItems.BRONZE_SWORD);
		GameRegistry.addRecipe(bronze_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 'D', Items.STICK);
		ItemStack emerald_sword = new ItemStack(IMItems.EMERALD_SWORD);
		GameRegistry.addRecipe(emerald_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'D', Items.STICK);
		ItemStack obsidian_sword = new ItemStack(IMItems.OBSIDIAN_SWORD);
		GameRegistry.addRecipe(obsidian_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'D', Items.STICK);
		ItemStack glowstone_sword = new ItemStack(IMItems.GLOWSTONE_SWORD);
		GameRegistry.addRecipe(glowstone_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 'D', Items.STICK);
		ItemStack prismarine_sword = new ItemStack(IMItems.PRISMARINE_SWORD);
		GameRegistry.addRecipe(prismarine_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), 'D', Items.STICK);
		ItemStack improved_diamond_sword = new ItemStack(IMItems.IMPROVED_DIAMOND_SWORD);
		GameRegistry.addRecipe(improved_diamond_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1,ItemIngot.INGOT_IMPROVED_DIAMOND), 'D', Items.STICK);
		ItemStack improved_emerald_sword = new ItemStack(IMItems.IMPROVED_EMERALD_SWORD);
		GameRegistry.addRecipe(improved_emerald_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1,ItemIngot.INGOT_IMPROVED_EMERALD), 'D', Items.STICK);
		ItemStack improved_obsidian_sword = new ItemStack(IMItems.IMPROVED_OBSIDIAN_SWORD);
		GameRegistry.addRecipe(improved_obsidian_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1,ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'D', Items.STICK);
		ItemStack improved_glowstone_sword = new ItemStack(IMItems.IMPROVED_GLOWSTONE_SWORD);
		GameRegistry.addRecipe(improved_glowstone_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1,ItemIngot.INGOT_IMPROVED_GLOWSTONE), 'D', Items.STICK);
		ItemStack wither_sword = new ItemStack(IMItems.WITHER_SWORD);
		GameRegistry.addRecipe(wither_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'D', Items.STICK);
		ItemStack dragon_sword = new ItemStack(IMItems.DRAGON_SWORD);
		GameRegistry.addRecipe(dragon_sword, " S ", " S ", " D ", 'S', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'D', Items.STICK);
		
		GameRegistry.addRecipe(new ItemStack(IMItems.EMERALD_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'H', Items.DIAMOND_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.EMERALD_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'C', Items.DIAMOND_CHESTPLATE);
		GameRegistry.addRecipe(new ItemStack(IMItems.EMERALD_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'L', Items.DIAMOND_LEGGINGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.EMERALD_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), 'B', Items.DIAMOND_BOOTS);
		
		GameRegistry.addRecipe(new ItemStack(IMItems.OBSIDIAN_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'H', IMItems.EMERALD_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.OBSIDIAN_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'C', IMItems.EMERALD_CHEST);
		GameRegistry.addRecipe(new ItemStack(IMItems.OBSIDIAN_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'L', IMItems.EMERALD_LEGGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.OBSIDIAN_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), 'B', IMItems.EMERALD_BOOTS);
		
		GameRegistry.addRecipe(new ItemStack(IMItems.IMDIAMOND_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'H', IMItems.OBSIDIAN_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMDIAMOND_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'C', IMItems.OBSIDIAN_CHEST);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMDIAMOND_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'L', IMItems.OBSIDIAN_LEGGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMDIAMOND_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), 'B', IMItems.OBSIDIAN_BOOTS);
		
		GameRegistry.addRecipe(new ItemStack(IMItems.IMEMERALD_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'H', IMItems.IMDIAMOND_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMEMERALD_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'C', IMItems.IMDIAMOND_CHEST);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMEMERALD_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'L', IMItems.IMDIAMOND_LEGGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMEMERALD_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), 'B', IMItems.IMDIAMOND_BOOTS);
		
		GameRegistry.addRecipe(new ItemStack(IMItems.IMOBSIDIAN_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'H', IMItems.IMEMERALD_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMOBSIDIAN_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'C', IMItems.IMEMERALD_CHEST);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMOBSIDIAN_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'L', IMItems.IMEMERALD_LEGGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.IMOBSIDIAN_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), 'B', IMItems.IMEMERALD_BOOTS);

		GameRegistry.addRecipe(new ItemStack(IMItems.WITHER_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'H', IMItems.IMOBSIDIAN_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.WITHER_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'C', IMItems.IMOBSIDIAN_CHEST);
		GameRegistry.addRecipe(new ItemStack(IMItems.WITHER_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'L', IMItems.IMOBSIDIAN_LEGGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.WITHER_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), 'B', IMItems.IMOBSIDIAN_BOOTS);
		
		GameRegistry.addRecipe(new ItemStack(IMItems.DRAGON_HELMET), "XXX", "XHX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'H', IMItems.WITHER_HELMET);
		GameRegistry.addRecipe(new ItemStack(IMItems.DRAGON_CHEST), "X X", "XCX", "XXX", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'C', IMItems.WITHER_CHEST);
		GameRegistry.addRecipe(new ItemStack(IMItems.DRAGON_LEGGS), "XXX", "XLX", "X X", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'L', IMItems.WITHER_LEGGS);
		GameRegistry.addRecipe(new ItemStack(IMItems.DRAGON_BOOTS), "X X", "XBX", "   ", 'X', new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), 'B', IMItems.WITHER_BOOTS);
		
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_COPPER), new ItemStack(IMBlocks.COPPER_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_TIN), new ItemStack(IMBlocks.TIN_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_BRONZE), new ItemStack(IMBlocks.BRONZE_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_SILVER), new ItemStack(IMBlocks.SILVER_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_LEAD), new ItemStack(IMBlocks.LEAD_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_DIAMOND), new ItemStack(IMBlocks.DIAMOND_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_EMERALD), new ItemStack(IMBlocks.EMERALD_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_OBSIDIAN), new ItemStack(IMBlocks.OBSIDIAN_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_GLOWSTONE), new ItemStack(IMBlocks.GLOWSTONE_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_PRISMARINE), new ItemStack(IMBlocks.PRISMARINE_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_IMPROVED_DIAMOND), new ItemStack(IMBlocks.IMPROVED_DIAMOND_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_IMPROVED_EMERALD), new ItemStack(IMBlocks.IMPROVED_EMERALD_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_IMPROVED_OBSIDiAN), new ItemStack(IMBlocks.IMPROVED_OBSIDIAN_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_IMPROVED_GLOWSTONE), new ItemStack(IMBlocks.IMPROVED_GLOWSTONE_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_WITHER), new ItemStack(IMBlocks.WITHER_BLOCK));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.INGOT, 4, ItemIngot.INGOT_DRAGON), new ItemStack(IMBlocks.DRAGON_BLOCK));

		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_COPPER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_TIN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_BRONZE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_SILVER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_LEAD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_OBSIDIAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_PRISMARINE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_IMPROVED_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_IMPROVED_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_IMPROVED_OBSIDiAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_IMPROVED_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_WITHER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.PLATE, 1, ItemPlate.PLATE_DRAGON), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), new ItemStack(IMItems.FORGE_HAMMER, 1, OreDictionary.WILDCARD_VALUE));
		
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_COPPER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_TIN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_BRONZE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_SILVER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_LEAD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_OBSIDIAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_PRISMARINE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_IMPROVED_DIAMOND), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_IMPROVED_EMERALD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_IMPROVED_OBSIDiAN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_IMPROVED_GLOWSTONE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_WITHER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER));
		GameRegistry.addShapelessRecipe(new ItemStack(IMItems.NUGGET, 9, ItemNugget.NUGGET_DRAGON), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON));
	
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_COPPER));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_TIN));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_BRONZE));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_SILVER));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_LEAD));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_DIAMOND));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_EMERALD));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_OBSIDIAN));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_GLOWSTONE));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_PRISMARINE));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_IMPROVED_DIAMOND));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_IMPROVED_EMERALD));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_IMPROVED_OBSIDiAN));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_IMPROVED_GLOWSTONE));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_WITHER));
		GameRegistry.addRecipe(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON), "XXX", "XXX", "XXX", 'X', new ItemStack(IMItems.NUGGET, 1, ItemNugget.NUGGET_DRAGON));
		
	}
	
	private static void normalSmelting(){
		
		GameRegistry.addSmelting(IMBlocks.COPPER_ORE, new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 0.1F);
		GameRegistry.addSmelting(IMBlocks.TIN_ORE, new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), 0.1F);
		GameRegistry.addSmelting(IMBlocks.SILVER_ORE, new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), 0.1F);
		GameRegistry.addSmelting(IMBlocks.LEAD_ORE, new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), 0.1F);
		GameRegistry.addSmelting(IMBlocks.PRISMARINE_ORE, new ItemStack(Items.PRISMARINE_SHARD), 0.1F);
		GameRegistry.addSmelting(new ItemStack(IMItems.DUST, 1, ItemDust.DUST_COPPER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER), 0.1F);
		GameRegistry.addSmelting(new ItemStack(IMItems.DUST, 1, ItemDust.DUST_TIN), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN), 0.1F);
		GameRegistry.addSmelting(new ItemStack(IMItems.DUST, 1, ItemDust.DUST_BRONZE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE), 0.1F);
		GameRegistry.addSmelting(new ItemStack(IMItems.DUST, 1, ItemDust.DUST_LEAD), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD), 0.1F);
		GameRegistry.addSmelting(new ItemStack(IMItems.DUST, 1, ItemDust.DUST_SILVER), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER), 0.1F);
		GameRegistry.addSmelting(new ItemStack(IMItems.DUST, 1, ItemDust.DUST_PRISMARINE), new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE), 0.1F);
		
	}
	
	private static void normalCombiantor(){
		
	}
	
	private static void normalNebulizer(){

		
	}
	
}
