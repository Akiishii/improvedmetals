package de.improvedmetals.common.blocks;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.items.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockBase extends Block{

	private String name;

	public BlockBase(String name) {
		super(Material.ROCK);

		this.name = name;

		setHardness(1.9F);
		setRegistryName(ImprovedMetals.MODID, name);
		setCreativeTab(ImprovedMetals.INSTANCE.tab);

	}

	@Override
	public String getUnlocalizedName() {
		return "block." + ImprovedMetals.MODID + ":" + name;
	}

	public Item createItem() {
		return new ItemBlockBase(this, false);
	}
	
}
