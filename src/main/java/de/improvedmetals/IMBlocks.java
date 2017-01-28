package de.improvedmetals;

import java.util.ArrayList;
import java.util.List;

import de.improvedmetals.common.blocks.BlockMetal;
import de.improvedmetals.common.blocks.BlockOre;
import de.improvedmetals.common.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IMBlocks {

	public static List<Block> BLOCKS = new ArrayList();
	
	public static Block COPPER_ORE, TIN_ORE, SILVER_ORE, LEAD_ORE, PRISMARINE_ORE, EXPERIENCE_ORE;

	public static Block COPPER_BLOCK, TIN_BLOCK, BRONZE_BLOCK, SILVER_BLOCK, LEAD_BLOCK, DIAMOND_BLOCK,
			EMERALD_BLOCK, OBSIDIAN_BLOCK, GLOWSTONE_BLOCK, PRISMARINE_BLOCK, IMPROVED_DIAMOND_BLOCK,
			IMPROVED_EMERALD_BLOCK, IMPROVED_OBSIDIAN_BLOCK, IMPROVED_GLOWSTONE_BLOCK, WITHER_BLOCK, DRAGON_BLOCK;


	public static void init() {

		COPPER_ORE = new BlockOre(1, Names.oreCopper);
		TIN_ORE = new BlockOre(1, Names.oreTin);
		SILVER_ORE = new BlockOre(2, Names.oreSilver);
		LEAD_ORE = new BlockOre(2, Names.oreLead);
		PRISMARINE_ORE = new BlockOre(2, Names.orePrismarine);
		EXPERIENCE_ORE = new BlockOre(1, Names.oreExperience);
		
		COPPER_BLOCK = new BlockMetal(1, Names.blockCopper);
		TIN_BLOCK = new BlockMetal(1, Names.blockTin);
		BRONZE_BLOCK = new BlockMetal(1, Names.blockBronze);
		SILVER_BLOCK = new BlockMetal(1, Names.blockSilver);
		LEAD_BLOCK = new BlockMetal(1, Names.blockLead);
		DIAMOND_BLOCK = new BlockMetal(1, Names.blockDiamond);
		EMERALD_BLOCK = new BlockMetal(1, Names.blockEmerald);
		OBSIDIAN_BLOCK = new BlockMetal(1, Names.blockObsidian);
		GLOWSTONE_BLOCK = new BlockMetal(1, Names.blockGlowstone);
		PRISMARINE_BLOCK = new BlockMetal(1, Names.blockPrismarine);
		IMPROVED_DIAMOND_BLOCK = new BlockMetal(1, Names.blockImprovedDiamond);
		IMPROVED_EMERALD_BLOCK = new BlockMetal(1, Names.blockImprovedEmerald);
		IMPROVED_OBSIDIAN_BLOCK = new BlockMetal(1, Names.blockImprovedObsidian);
		IMPROVED_GLOWSTONE_BLOCK = new BlockMetal(1, Names.blockImprovedGlowstone);
		WITHER_BLOCK = new BlockMetal(1, Names.blockWither);
		DRAGON_BLOCK = new BlockMetal(1, Names.blockDragon);

		reg();

	}

	private static void reg() {

		BLOCKS.add(COPPER_ORE);
		BLOCKS.add(TIN_ORE);
		BLOCKS.add(SILVER_ORE);
		BLOCKS.add(LEAD_ORE);
		BLOCKS.add(PRISMARINE_ORE);
		BLOCKS.add(EXPERIENCE_ORE);

		BLOCKS.add(COPPER_BLOCK);
		BLOCKS.add(TIN_BLOCK);
		BLOCKS.add(BRONZE_BLOCK);
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


		for (Block block : BLOCKS) {
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}

	}

}
