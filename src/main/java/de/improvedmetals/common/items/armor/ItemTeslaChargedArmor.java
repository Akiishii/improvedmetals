package de.improvedmetals.common.items.armor;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.utils.TeslaUtilities;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTeslaChargedArmor extends ItemTeslaArmor {

	public long cost = 10L;
	
	public ItemTeslaChargedArmor(ItemArmor.ArmorMaterial material, EntityEquipmentSlot slot, long maxCap, long input, long output) {
		super(material, material.getDamageReductionAmount(slot), slot, maxCap, input, output);
		if (slot == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName("improvedmetals.chargedarmor.helmet");
		}
		if (slot == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName("improvedmetals.chargedarmor.chestplate");
		}
		if (slot == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName("improvedmetals.chargedarmor.leggings");
		}
		if (slot == EntityEquipmentSlot.FEET) {
			setUnlocalizedName("improvedmetals.chargedarmor.boots");
		}
		setCreativeTab(ImprovedMetals.INSTANCE.tab);
	}

	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String layer)
	  {
	    if (this.armorType == EntityEquipmentSlot.LEGS) {
	      return "improvedmetals:textures/armor/charged_armor_layer_2.png";
	    }
	    return "improvedmetals:textures/armor/charged_armor_layer_1.png";
	  }
	  
	  public int getDamage(ItemStack stack)
	  {
	    TeslaUtilities.usePower(stack, this.cost);
	    
	    return stack.getMaxDamage();
	  }
	
}
