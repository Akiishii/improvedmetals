package de.improvedmetals.common.items.energy;

import java.text.NumberFormat;
import java.util.List;

import cofh.api.energy.ItemEnergyContainer;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.integration.tesla.ItemTesla;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnergy extends ItemEnergyContainer {

	public ItemEnergy(int cap, int maxOut, String name, String reg) {
		super(cap, maxOut);
		this.setUnlocalizedName(name);
		this.setRegistryName(ImprovedMetals.MODID, reg);
		this.setHasSubtypes(true);
		this.setMaxStackSize(1);
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
		NumberFormat format = NumberFormat.getInstance();
		list.add(format.format(this.getEnergyStored(stack)) + "/" + format.format(this.getMaxEnergyStored(stack))
				+ (" T"));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		ItemStack stackFull = new ItemStack(this);
		this.setEnergy(stackFull, this.getMaxEnergyStored(stackFull));
		list.add(stackFull);

		ItemStack stackEmpty = new ItemStack(this);
		this.setEnergy(stackEmpty, 0);
		list.add(stackEmpty);
	}

	@Override
	public boolean showDurabilityBar(ItemStack itemStack) {
		return true;
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		double maxAmount = this.getMaxEnergyStored(stack);
		double energyDif = maxAmount - this.getEnergyStored(stack);
		return energyDif / maxAmount;
	}

	public void setEnergy(ItemStack stack, int energy) {
		NBTTagCompound compound = stack.getTagCompound();
		if (compound == null) {
			compound = new NBTTagCompound();
		}
		compound.setInteger("Energy", energy);
		stack.setTagCompound(compound);
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
		return Loader.isModLoaded("tesla") ? new ItemTesla(stack, this) : null;
	}

}
