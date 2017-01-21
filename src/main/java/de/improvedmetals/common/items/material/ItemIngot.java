package de.improvedmetals.common.items.material;

import java.util.List;

import de.improvedmetals.common.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngot extends ItemBase{

	public static final int INGOT_COPPER = 0;
	public static final int INGOT_TIN = 1;
	public static final int INGOT_BRONZE = 2;
	public static final int INGOT_SILVER = 3;
	public static final int INGOT_LEAD = 4;
	public static final int INGOT_DIAMOND = 5;
	public static final int INGOT_EMERALD = 6;
	public static final int INGOT_OBSIDIAN = 7;
	public static final int INGOT_GLOWSTONE = 8;
	public static final int INGOT_PRISMARINE = 9;
	public static final int INGOT_IMPROVED_DIAMOND = 10;
	public static final int INGOT_IMPROVED_EMERALD = 11;
	public static final int INGOT_IMPROVED_OBSIDiAN = 12;
	public static final int INGOT_IMPROVED_GLOWSTONE = 13;
	public static final int INGOT_WITHER = 14;
	public static final int INGOT_DRAGON = 15;
	
	public ItemIngot() {
		super("ingot");
		
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i<=15; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
}
