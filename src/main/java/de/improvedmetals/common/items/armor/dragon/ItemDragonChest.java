package de.improvedmetals.common.items.armor.dragon;

import java.util.List;

import de.improvedmetals.IMItems;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.items.material.ItemIngot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDragonChest extends ItemArmor{

	public ItemDragonChest(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
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
		if(stack.getItem() == IMItems.DRAGON_CHEST){
			int damage = stack.getMaxDamage() - stack.getItemDamage();
			if(damage == -16){
				tooltip.add("Durability: �cUNBREAKABLE");
			}else{
				tooltip.add("Durability: �6" + damage);
			}
			if(ConfigValues.allowFlight){
				tooltip.add("Set Bonus: �cFlight");
			}
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		ItemStack head = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
		ItemStack chest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
		ItemStack leggs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		ItemStack boots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		
		if(ConfigValues.allowFlight){
			if (((head != null) && ((head.getItem() instanceof ItemDragonHelmet)) && (chest != null) && ((chest.getItem() instanceof ItemDragonChest)) && (leggs != null) && ((leggs.getItem() instanceof ItemDragonLeggs)) && (boots != null) && ((boots.getItem() instanceof ItemDragonBoots))) || (player.capabilities.isCreativeMode) || (player.isSpectator())){
				if(player.isInWater()){
					player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0, true, false));
				}
				if(player.isInLava()){
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
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
	}
	
	@Override
	public int getItemEnchantability(){
		return 0;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_DRAGON).getItem();
	}
	
}
