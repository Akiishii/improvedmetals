package de.improvedmetals.common.items.armor.imobsidian;

import java.util.List;

import de.improvedmetals.IMItems;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.items.material.ItemIngot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemIMObsidianChest extends ItemArmor{

	public ItemIMObsidianChest(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ImprovedMetals.INSTANCE.tab);
		setMaxStackSize(1);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		if(stack.getItem() == IMItems.IMOBSIDIAN_CHEST){
			int damage = stack.getMaxDamage() - stack.getItemDamage();
			if(damage == -1){
				tooltip.add("Durability: §cUNBREAKABLE");
			}else{
				tooltip.add("Durability: §6" + damage);
			}
		}
	}
	
	/*@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
		ItemStack leggs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		
		if(ConfigValues.allowFlight){
			if (((head != null) && ((head.getItem() instanceof ItemObsidianHelmet)) && (chest != null) && ((chest.getItem() instanceof ItemObsidianChest)) && (leggs != null) && ((leggs.getItem() instanceof ItemObsidianLeggs)) && (boots != null) && ((boots.getItem() instanceof ItemObsidianBoots))) || (player.capabilities.isCreativeMode) || (player.isSpectator())){
				if(player.isInWater()){
					player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0, true, false));
				}
				player.stepHeight = 1.0F;
				player.fallDistance = 0.0F;
				player.capabilities.allowFlying = true;
				
			}
			else
			{
				player.stepHeight = 0.5F;
				player.capabilities.isFlying = false;
				player.capabilities.allowFlying = false;
			}
		}
	}*/
	
	@Override
	public int getItemEnchantability(){
		return 0;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON).getItem();
	}
	
}
