package de.improvedmetals.common.handler;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.config.ConfigValues;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	public static final class TOOLS{
		
		public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("Copper", 0, ConfigValues.copperToolsDurability, 3.8F, 1.2F, 6);
		public static final ToolMaterial BRONZE = EnumHelper.addToolMaterial("Bronze", 2, ConfigValues.bronzeToolsDurability, 6F, 2.0F, 6);
		public static final ToolMaterial EMERALD = EnumHelper.addToolMaterial("Emerald", 3, ConfigValues.emeraldToolsDurability, 10F, 4F, 6);
		public static final ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("Obsidian", 3, ConfigValues.obsidianToolsDurability, 2F, 2.5F, 6);
		public static final ToolMaterial GLOWSTONE = EnumHelper.addToolMaterial("Glowstone", 2, ConfigValues.glowstoneToolsDurability, 12F, 2F, 50);
		public static final ToolMaterial PRISMARINE = EnumHelper.addToolMaterial("Prismarine", 1, ConfigValues.prismarineToolsDurability, 3.8F, 1.8F, 6);
		public static final ToolMaterial IMPROVED_DIAMOND = EnumHelper.addToolMaterial("Improved_Diamond", 3, ConfigValues.improvedDiamondToolsDurability, 16F, 6F, 6);
		public static final ToolMaterial IMPROVED_EMERALD = EnumHelper.addToolMaterial("Improved_Emerald", 3, ConfigValues.improvedEmeraldToolsDurability, 20F, 8F, 6);
		public static final ToolMaterial IMPROVED_OBSIDIAN = EnumHelper.addToolMaterial("Improved_Obsidian", 3, ConfigValues.improvedObsidianToolsDurability, 5F, 5F, 6);
		public static final ToolMaterial IMPROVED_GLOWSTONE = EnumHelper.addToolMaterial("Improved_Glowstone", 3, ConfigValues.improvedGlowstoneToolsDurability, 27F, 4F, 80);
		public static final ToolMaterial WITHER = EnumHelper.addToolMaterial("Wither", 3, ConfigValues.witherToolsDurability, 23F, 11F, 30);
		public static final ToolMaterial DRAGON = EnumHelper.addToolMaterial("Dragon", 3, -1, 25F, 15F, 30);
		
	}
	
	public static final class ARMOR{
		
		public static final ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("Emerald", ImprovedMetals.MODID + ":emerald", 42, new int[]{6, 8, 10, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F);
		public static final ArmorMaterial OBSIDIAN = EnumHelper.addArmorMaterial("Obsidian", ImprovedMetals.MODID + ":obsidian", 50, new int[]{ 6, 9, 13, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F);
		public static final ArmorMaterial IMPROVED_DIAMOND = EnumHelper.addArmorMaterial("Improved_Diamond", ImprovedMetals.MODID + ":imdiamond", 66, new int[]{ 6, 8, 12, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
		public static final ArmorMaterial IMPROVED_EMERALD = EnumHelper.addArmorMaterial("Improved_Emerald", ImprovedMetals.MODID + ":imemerald", 84, new int[]{ 6, 9, 12, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
		public static final ArmorMaterial IMPROVED_OBSIDIAN = EnumHelper.addArmorMaterial("Improved_Obsidian", ImprovedMetals.MODID + ":imobsidian", 100, new int[]{ 6, 10, 14, 6}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5F);
		public static final ArmorMaterial WITHER = EnumHelper.addArmorMaterial("Wither", ImprovedMetals.MODID + ":wither", 150, new int[]{ 6, 9, 12, 6}, 100, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.5F);
		public static final ArmorMaterial DRAGON = EnumHelper.addArmorMaterial("Dragon", ImprovedMetals.MODID + ":dragon", -1, new int[] { 6, 10, 13, 6 }, 200, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
		
	}
	
}
