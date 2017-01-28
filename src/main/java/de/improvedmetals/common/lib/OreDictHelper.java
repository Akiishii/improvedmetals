package de.improvedmetals.common.lib;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.IMItems;
import de.improvedmetals.common.items.material.ItemDust;
import de.improvedmetals.common.items.material.ItemIngot;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHelper {

	public static void init(){
		
		registerItemOreDict();
		registerBlockOreDict();
		
	}
	
	private static void registerItemOreDict(){
		
		OreDictionary.registerOre("ingotCopper", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_COPPER));
		OreDictionary.registerOre("ingotTin", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_TIN));
		OreDictionary.registerOre("ingotBronze", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_BRONZE));
		OreDictionary.registerOre("ingotSilver", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_SILVER));
		OreDictionary.registerOre("ingotLead", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_LEAD));
		OreDictionary.registerOre("ingotDiamond", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DIAMOND));
		OreDictionary.registerOre("ingotEmerald", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_EMERALD));
		OreDictionary.registerOre("ingotObsidian", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_OBSIDIAN));
		OreDictionary.registerOre("ingotGlowstone", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE));
		OreDictionary.registerOre("ingotPrismarine", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_PRISMARINE));
		OreDictionary.registerOre("ingotImprovedDiamond", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_DIAMOND));
		OreDictionary.registerOre("ingotImprovedEmerald", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_EMERALD));
		OreDictionary.registerOre("ingotImprovedObsidian", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_OBSIDiAN));
		OreDictionary.registerOre("ingotImprovedGlowstone", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_IMPROVED_GLOWSTONE));
		OreDictionary.registerOre("ingotWither", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_WITHER));
		OreDictionary.registerOre("ingotDragon", new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON));
		
		OreDictionary.registerOre("materialPrismarine", Items.PRISMARINE_SHARD);
		OreDictionary.registerOre("materialPrismarineCrystals", Items.PRISMARINE_CRYSTALS);
		OreDictionary.registerOre("materialCoal", Items.COAL);
		
		OreDictionary.registerOre("materialWitherBone", IMItems.WITHER_BONE);
		OreDictionary.registerOre("materialDragonClaw", IMItems.DRAGON_CLAW);
		OreDictionary.registerOre("materialDragonScale", IMItems.DRAGON_SCALE);
		
		OreDictionary.registerOre("dustGlowstone", Items.GLOWSTONE_DUST);
		OreDictionary.registerOre("dustCopper", new ItemStack(IMItems.DUST, 1, ItemDust.DUST_COPPER));
		OreDictionary.registerOre("dustTin", new ItemStack(IMItems.DUST, 1, ItemDust.DUST_TIN));
		OreDictionary.registerOre("dustBronze", new ItemStack(IMItems.DUST, 1, ItemDust.DUST_BRONZE));
		OreDictionary.registerOre("dustSilver", new ItemStack(IMItems.DUST, 1, ItemDust.DUST_SILVER));
		OreDictionary.registerOre("dustLead", new ItemStack(IMItems.DUST, 1, ItemDust.DUST_LEAD));
		OreDictionary.registerOre("dustPrismarine", new ItemStack(IMItems.DUST, 1, ItemDust.DUST_PRISMARINE));
		
	}
	
	private static void registerBlockOreDict(){
		
		OreDictionary.registerOre("oreCopper", IMBlocks.COPPER_ORE);
		OreDictionary.registerOre("oreTin", IMBlocks.TIN_ORE);
		OreDictionary.registerOre("oreSilver", IMBlocks.SILVER_ORE);
		OreDictionary.registerOre("oreLead", IMBlocks.LEAD_ORE);
		OreDictionary.registerOre("orePrismarine", IMBlocks.PRISMARINE_ORE);
		
		OreDictionary.registerOre("blockObsidian", Blocks.OBSIDIAN);
		
		OreDictionary.registerOre("blockMetalCopper", IMBlocks.COPPER_BLOCK);
		OreDictionary.registerOre("blockMetalTin", IMBlocks.TIN_BLOCK);
		OreDictionary.registerOre("blockMetalBronze", IMBlocks.BRONZE_BLOCK);
		OreDictionary.registerOre("blockMetalSilver", IMBlocks.SILVER_BLOCK);
		OreDictionary.registerOre("blockMetalLead", IMBlocks.LEAD_BLOCK);
		OreDictionary.registerOre("blockMetalDiamond", IMBlocks.DIAMOND_BLOCK);
		OreDictionary.registerOre("blockMetalEmerald", IMBlocks.EMERALD_BLOCK);
		OreDictionary.registerOre("blockMetalObsidian", IMBlocks.OBSIDIAN_BLOCK);
		OreDictionary.registerOre("blockMetalGlowstone", IMBlocks.GLOWSTONE_BLOCK);
		OreDictionary.registerOre("blockMetalImprovedDiamond", IMBlocks.IMPROVED_DIAMOND_BLOCK);
		OreDictionary.registerOre("blockMetalImprovedEmerald", IMBlocks.IMPROVED_EMERALD_BLOCK);
		OreDictionary.registerOre("blockMetalImprovedObsidian", IMBlocks.IMPROVED_OBSIDIAN_BLOCK);
		OreDictionary.registerOre("blockMetalImprovedGlowstone", IMBlocks.IMPROVED_GLOWSTONE_BLOCK);
		OreDictionary.registerOre("blockMetalWither", IMBlocks.WITHER_BLOCK);
		OreDictionary.registerOre("blockMetalDragon", IMBlocks.DRAGON_BLOCK);
		
	}
	
}
