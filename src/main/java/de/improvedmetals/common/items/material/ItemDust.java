package de.improvedmetals.common.items.material;

import java.util.List;

import de.improvedmetals.common.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDust extends ItemBase{

	public static final int DUST_COPPER = 0;
	public static final int DUST_TIN = 1;
	public static final int DUST_BRONZE = 2;
	public static final int DUST_SILVER = 3;
	public static final int DUST_LEAD = 4;
	public static final int DUST_PRISMARINE = 5;
	public static final int DUST_WITHER = 6;
	public static final int DUST_DRAGON = 7;
	
	public ItemDust() {
		super("dust");
		
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list) {
		for (int i = 0; i<=7; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
}
