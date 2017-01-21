package de.improvedmetals.common.items.tools;

import java.util.List;

import de.improvedmetals.common.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolForgeHammer extends ItemBase{

	public ToolForgeHammer(int i) {
		super("forge_hammer");
		setMaxDamage(i);
		setMaxStackSize(1);
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		
		ItemStack stack = itemStack.copy();
		
		stack.setItemDamage(stack.getItemDamage() + 1);
		stack.stackSize = 1;
		
		return stack;
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		
		int damage = stack.getMaxDamage() - stack.getItemDamage() + 1;
		tooltip.add("Durability: §c" + damage);
		super.addInformation(stack, playerIn, tooltip, advanced);
	}
	
}
