package de.improvedmetals.common.items.armor;

import java.util.List;

import de.improvedmetals.common.container.TeslaContainer;
import de.improvedmetals.common.utils.TeslaUtilities;
import net.darkhax.tesla.api.implementation.BaseTeslaContainer;
import net.darkhax.tesla.lib.TeslaUtils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class ItemTeslaArmor extends ItemArmor {

	private long maxCap;
	private long output;
	private long input;

	public ItemTeslaArmor(ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, long maxCap, long input, long output) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setMaxStackSize(1);
		this.maxCap = maxCap;
		this.input = input;
		this.output = output;
	}

	@Override
	public boolean isRepairable() {
		return false;
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {

		ItemStack charged = TeslaUtilities.createChargedStack(new ItemStack(itemIn));
		ItemStack uncharged = new ItemStack(itemIn);
		subItems.add(charged);
		subItems.add(uncharged);

	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		return 1.0D - TeslaUtilities.getStoredPower(stack) / TeslaUtilities.getMaxCapacity(stack);
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return true;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		TeslaUtils.createTooltip(stack, tooltip);
	}

	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
		return new TeslaContainer(new BaseTeslaContainer(), this.maxCap, this.output, this.input);
	}

}
