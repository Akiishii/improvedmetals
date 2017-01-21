package de.improvedmetals.common.items;

import de.improvedmetals.ImprovedMetals;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item{

	private String name;

	public ItemBase(String name) {
		
		this.name = name;
		
		setRegistryName(ImprovedMetals.MODID, name);
		setCreativeTab(ImprovedMetals.INSTANCE.tab);
		
	}
	
	@Override
	public String getUnlocalizedName(){
		return "item." + ImprovedMetals.MODID + ":" + name;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		if (getHasSubtypes()) {
			return getUnlocalizedName() + "." + stack.getItemDamage();
		}

		return getUnlocalizedName();
	}
}
