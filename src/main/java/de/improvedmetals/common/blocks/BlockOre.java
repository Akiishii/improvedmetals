package de.improvedmetals.common.blocks;

import java.util.Random;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.IMItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockOre extends BlockBase {

	private String name;

	public BlockOre(int i, String name) {
		super(name);
		this.name = name;
		setHardness(0.5F);
		setHarvestLevel("pickaxe", i);
	}

	public int quantityDropped(int meta, int fortune, Random random) {
		return 1;
	}

	public Item getItemDropped(int inz, Random rand, int m) {
		return this == IMBlocks.COPPER_ORE ? new ItemStack(IMBlocks.COPPER_ORE).getItem()
				: (this == IMBlocks.TIN_ORE ? new ItemStack(IMBlocks.TIN_ORE).getItem()
						: (this == IMBlocks.LEAD_ORE ? new ItemStack(IMBlocks.LEAD_ORE).getItem()
								: (this == IMBlocks.SILVER_ORE ? new ItemStack(IMBlocks.SILVER_ORE).getItem()
										: (this == IMBlocks.PRISMARINE_ORE
												? new ItemStack(IMBlocks.PRISMARINE_BLOCK).getItem()
												: (this == IMBlocks.EXPERIENCE_ORE
														? new ItemStack(IMItems.EXPERIENCE_PEARL).getItem()
														: Item.getItemFromBlock(this))))));
	}

}
