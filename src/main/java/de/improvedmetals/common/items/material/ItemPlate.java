package de.improvedmetals.common.items.material;

import java.util.List;

import de.improvedmetals.common.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPlate extends ItemBase{

	public static final int PLATE_COPPER = 0;
	public static final int PLATE_TIN = 1;
	public static final int PLATE_BRONZE = 2;
	public static final int PLATE_SILVER = 3;
	public static final int PLATE_LEAD = 4;
	public static final int PLATE_DIAMOND = 5;
	public static final int PLATE_EMERALD = 6;
	public static final int PLATE_OBSIDIAN = 7;
	public static final int PLATE_GLOWSTONE = 8;
	public static final int PLATE_PRISMARINE = 9;
	public static final int PLATE_IMPROVED_DIAMOND = 10;
	public static final int PLATE_IMPROVED_EMERALD = 11;
	public static final int PLATE_IMPROVED_OBSIDiAN = 12;
	public static final int PLATE_IMPROVED_GLOWSTONE = 13;
	public static final int PLATE_WITHER = 14;
	public static final int PLATE_DRAGON = 15;
	
	public ItemPlate() {
		super("plate");
		
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
