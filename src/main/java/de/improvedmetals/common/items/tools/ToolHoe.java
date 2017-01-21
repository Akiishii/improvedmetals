package de.improvedmetals.common.items.tools;

import java.util.List;

import de.improvedmetals.ImprovedMetals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolHoe extends ItemHoe{
	
	private String name;

	public ToolHoe(ToolMaterial material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
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
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
		int damage = stack.getMaxDamage() - stack.getItemDamage();
		if(damage == -1 ){
			tooltip.add("Durability: §6" + "UNBREAKABLE");
		}else{
			tooltip.add("Durability: §6" + damage);
		}
		super.addInformation(stack, player, tooltip, advanced);
	}
	
}
