package de.improvedmetals;

import java.util.ArrayList;
import java.util.List;

import de.improvedmetals.common.blocks.BlockDragonObsidian;
import de.improvedmetals.common.blocks.BlockMetal;
import de.improvedmetals.common.blocks.BlockOre;
import de.improvedmetals.common.blocks.BlockWitherObsidian;
import de.improvedmetals.common.blocks.machine.BlockCombinator;
import de.improvedmetals.common.blocks.machine.BlockCombinator2;
import de.improvedmetals.common.blocks.machine.BlockCombinator3;
import de.improvedmetals.common.blocks.machine.BlockCombinator4;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier1;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier10;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier2;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier3;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier4;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier5;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier6;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier7;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier8;
import de.improvedmetals.common.blocks.machine.solar.BlockSolarPanelTier9;
import de.improvedmetals.common.utils.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IMBlocks {

	public static List<Block> BLOCKS = new ArrayList();
	public static BlockOre COPPER_ORE = new BlockOre(1, Names.oreCopper);
	public static BlockOre TIN_ORE = new BlockOre(1, Names.oreTin);
	public static BlockOre SILVER_ORE = new BlockOre(2, Names.oreSilver);
	public static BlockOre LEAD_ORE = new BlockOre(2, Names.oreLead);
	public static BlockOre PRISMARINE_ORE = new BlockOre(2, Names.orePrismarine);
	public static BlockOre EXPERIENCE_ORE = new BlockOre(1, Names.oreExperience);
	
	public static BlockWitherObsidian WITHER_OBSIDIAN = new BlockWitherObsidian(3, Names.witherObsidian);
	public static BlockDragonObsidian DRAGON_OBSIDIAN = new BlockDragonObsidian(3, Names.dragonObsidian);
	
	public static BlockMetal COPPER_BLOCK = new BlockMetal(1, Names.blockCopper);
	public static BlockMetal TIN_BLOCK = new BlockMetal(1, Names.blockTin);
	public static BlockMetal BRONZE_BLOCK = new BlockMetal(1, Names.blockBronze);
	public static BlockMetal SILVER_BLOCK = new BlockMetal(1, Names.blockSilver);
	public static BlockMetal LEAD_BLOCK = new BlockMetal(1, Names.blockLead);
	public static BlockMetal DIAMOND_BLOCK = new BlockMetal(1, Names.blockDiamond);
	public static BlockMetal EMERALD_BLOCK = new BlockMetal(1, Names.blockEmerald);
	public static BlockMetal OBSIDIAN_BLOCK = new BlockMetal(1, Names.blockObsidian);
	public static BlockMetal GLOWSTONE_BLOCK = new BlockMetal(1, Names.blockGlowstone);
	public static BlockMetal PRISMARINE_BLOCK = new BlockMetal(1, Names.blockPrismarine);
	public static BlockMetal IMPROVED_DIAMOND_BLOCK = new BlockMetal(1, Names.blockImprovedDiamond);
	public static BlockMetal IMPROVED_EMERALD_BLOCK = new BlockMetal(1, Names.blockImprovedEmerald);
	public static BlockMetal IMPROVED_OBSIDIAN_BLOCK = new BlockMetal(1, Names.blockImprovedObsidian);
	public static BlockMetal IMPROVED_GLOWSTONE_BLOCK = new BlockMetal(1, Names.blockImprovedGlowstone);
	public static BlockMetal WITHER_BLOCK = new BlockMetal(1, Names.blockWither);
	public static BlockMetal DRAGON_BLOCK = new BlockMetal(1, Names.blockDragon);

	public static BlockCombinator COMBINATOR_TIER1 = new BlockCombinator();
	public static BlockCombinator2 COMBINATOR_TIER2 = new BlockCombinator2();
	public static BlockCombinator3 COMBINATOR_TIER3 = new BlockCombinator3();
	public static BlockCombinator4 COMBINATOR_TIER4 = new BlockCombinator4();
	
	public static BlockSolarPanelTier1 SOLAR_TIER1 = new BlockSolarPanelTier1();
	public static BlockSolarPanelTier2 SOLAR_TIER2 = new BlockSolarPanelTier2();
	public static BlockSolarPanelTier3 SOLAR_TIER3 = new BlockSolarPanelTier3();
	public static BlockSolarPanelTier4 SOLAR_TIER4 = new BlockSolarPanelTier4();
	public static BlockSolarPanelTier5 SOLAR_TIER5 = new BlockSolarPanelTier5();
	public static BlockSolarPanelTier6 SOLAR_TIER6 = new BlockSolarPanelTier6();
	public static BlockSolarPanelTier7 SOLAR_TIER7 = new BlockSolarPanelTier7();
	public static BlockSolarPanelTier8 SOLAR_TIER8 = new BlockSolarPanelTier8();
	public static BlockSolarPanelTier9 SOLAR_TIER9 = new BlockSolarPanelTier9();
	public static BlockSolarPanelTier10 SOLAR_TIER10 = new BlockSolarPanelTier10();
	
	public static void init(){
		
		BLOCKS.add(COPPER_ORE);
		BLOCKS.add(TIN_ORE);
		BLOCKS.add(BRONZE_BLOCK);
		BLOCKS.add(SILVER_ORE);
		BLOCKS.add(LEAD_ORE);
		BLOCKS.add(PRISMARINE_ORE);
		BLOCKS.add(EXPERIENCE_ORE);
		
		BLOCKS.add(WITHER_OBSIDIAN);
		BLOCKS.add(DRAGON_OBSIDIAN);
		
		BLOCKS.add(COPPER_BLOCK);
		BLOCKS.add(TIN_BLOCK);
		BLOCKS.add(SILVER_BLOCK);
		BLOCKS.add(LEAD_BLOCK);
		BLOCKS.add(DIAMOND_BLOCK);
		BLOCKS.add(EMERALD_BLOCK);
		BLOCKS.add(OBSIDIAN_BLOCK);
		BLOCKS.add(GLOWSTONE_BLOCK);
		BLOCKS.add(PRISMARINE_BLOCK);
		BLOCKS.add(IMPROVED_DIAMOND_BLOCK);
		BLOCKS.add(IMPROVED_EMERALD_BLOCK);
		BLOCKS.add(IMPROVED_OBSIDIAN_BLOCK);
		BLOCKS.add(IMPROVED_GLOWSTONE_BLOCK);
		BLOCKS.add(WITHER_BLOCK);
		BLOCKS.add(DRAGON_BLOCK);
		
		BLOCKS.add(COMBINATOR_TIER1);
		BLOCKS.add(COMBINATOR_TIER2);
		BLOCKS.add(COMBINATOR_TIER3);
		BLOCKS.add(COMBINATOR_TIER4);
		
		BLOCKS.add(SOLAR_TIER1);
		BLOCKS.add(SOLAR_TIER2);
		BLOCKS.add(SOLAR_TIER3);
		BLOCKS.add(SOLAR_TIER4);
		BLOCKS.add(SOLAR_TIER5);
		BLOCKS.add(SOLAR_TIER6);
		BLOCKS.add(SOLAR_TIER7);
		BLOCKS.add(SOLAR_TIER8);
		BLOCKS.add(SOLAR_TIER9);
		BLOCKS.add(SOLAR_TIER10);
		
		
		for(Block block : BLOCKS){
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
		
	}
	
}
