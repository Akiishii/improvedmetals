package de.improvedmetals.common.proxy;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.IMItems;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.items.material.ItemIngot;
import de.improvedmetals.common.items.material.ItemNugget;
import de.improvedmetals.common.items.material.ItemPlate;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		
		ModelBakery.registerItemVariants(IMItems.INGOT, 
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_copper"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_tin"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_bronze"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_silver"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_lead"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_diamond"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_emerald"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_obsidian"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_glowstone"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_prismarine"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_improved_diamond"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_improved_emerald"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_improved_obsidian"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_improved_glowstone"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_wither"),
				new ResourceLocation(ImprovedMetals.MODID + ":ingot_dragon")
		
		);
		
		ModelBakery.registerItemVariants(IMItems.NUGGET, 
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_copper"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_tin"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_bronze"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_silver"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_lead"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_diamond"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_emerald"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_obsidian"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_glowstone"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_prismarine"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_improved_diamond"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_improved_emerald"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_improved_obsidian"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_improved_glowstone"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_wither"),
				new ResourceLocation(ImprovedMetals.MODID + ":nugget_dragon")
		
		);
		
		ModelBakery.registerItemVariants(IMItems.PLATE, 
				new ResourceLocation(ImprovedMetals.MODID + ":plate_copper"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_tin"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_bronze"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_silver"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_lead"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_diamond"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_emerald"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_obsidian"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_glowstone"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_prismarine"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_improved_diamond"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_improved_emerald"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_improved_obsidian"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_improved_glowstone"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_wither"),
				new ResourceLocation(ImprovedMetals.MODID + ":plate_dragon")
		
		);
		
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_COPPER, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_TIN, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_tin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_BRONZE, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_SILVER, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_LEAD, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_lead", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_DIAMOND, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_diamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_EMERALD, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_emerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_OBSIDIAN, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_obsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_GLOWSTONE, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_glowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_PRISMARINE, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_prismarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_IMPROVED_DIAMOND, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_improved_diamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_IMPROVED_EMERALD, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_improved_emerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_IMPROVED_OBSIDiAN, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_improved_obsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_IMPROVED_GLOWSTONE, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_improved_glowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_WITHER, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_wither", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.INGOT, ItemIngot.INGOT_DRAGON, new ModelResourceLocation(ImprovedMetals.MODID + ":ingot_dragon", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_COPPER, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_TIN, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_tin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_BRONZE, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_SILVER, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_LEAD, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_lead", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_DIAMOND, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_diamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_EMERALD, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_emerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_OBSIDIAN, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_obsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_GLOWSTONE, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_glowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_PRISMARINE, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_prismarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_IMPROVED_DIAMOND, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_improved_diamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_IMPROVED_EMERALD, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_improved_emerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_IMPROVED_OBSIDiAN, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_improved_obsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_IMPROVED_GLOWSTONE, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_improved_glowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_WITHER, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_wither", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PLATE, ItemPlate.PLATE_DRAGON, new ModelResourceLocation(ImprovedMetals.MODID + ":plate_dragon", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_COPPER, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_copper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_TIN, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_tin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_BRONZE, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_bronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_SILVER, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_silver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_LEAD, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_lead", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_DIAMOND, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_diamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_EMERALD, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_emerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_OBSIDIAN, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_obsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_GLOWSTONE, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_glowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_PRISMARINE, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_prismarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_IMPROVED_DIAMOND, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_improved_diamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_IMPROVED_EMERALD, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_improved_emerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_IMPROVED_OBSIDiAN, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_improved_obsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_IMPROVED_GLOWSTONE, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_improved_glowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_WITHER, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_wither", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.NUGGET, ItemNugget.NUGGET_DRAGON, new ModelResourceLocation(ImprovedMetals.MODID + ":nugget_dragon", "inventory"));
				
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_CLAW, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_claw", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_SCALE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_scale", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_BONE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_bone", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.EXPERIENCE_PEARL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":experience_pearl", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.COPPER_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":copper_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.BRONZE_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":bronze_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.GLOWSTONE_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":glowstone_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PRISMARINE_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":prismarine_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_DIAMOND_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_diamond_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_EMERALD_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_emerald_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_GLOWSTONE_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_glowstone_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_OBSIDIAN_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_obsidian_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_axe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_AXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_axe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.COPPER_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":copper_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.BRONZE_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":bronze_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.GLOWSTONE_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":glowstone_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PRISMARINE_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":prismarine_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_DIAMOND_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_diamond_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_EMERALD_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_emerald_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_GLOWSTONE_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_glowstone_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_OBSIDIAN_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_obsidian_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_hoe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_HOE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_hoe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.COPPER_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":copper_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.BRONZE_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":bronze_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.GLOWSTONE_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":glowstone_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PRISMARINE_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":prismarine_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_DIAMOND_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_diamond_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_EMERALD_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_emerald_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_GLOWSTONE_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_glowstone_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_OBSIDIAN_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_obsidian_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_pickaxe", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_PICKAXE, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_pickaxe", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.COPPER_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":copper_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.BRONZE_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":bronze_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.GLOWSTONE_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":glowstone_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PRISMARINE_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":prismarine_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_DIAMOND_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_diamond_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_EMERALD_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_emerald_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_GLOWSTONE_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_glowstone_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_OBSIDIAN_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_obsidian_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_shovel", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_SHOVEL, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_shovel", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.COPPER_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":copper_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.BRONZE_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":bronze_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.GLOWSTONE_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":glowstone_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.PRISMARINE_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":prismarine_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_DIAMOND_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_diamond_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_EMERALD_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_emerald_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_GLOWSTONE_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_glowstone_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMPROVED_OBSIDIAN_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":improved_obsidian_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_sword", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_SWORD, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_sword", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.FORGE_HAMMER, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":forge_hammer", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.COPPER_ORE), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":oreCopper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.TIN_ORE), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":oreTin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SILVER_ORE), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":oreSilver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.LEAD_ORE), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":oreLead", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.PRISMARINE_ORE), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":orePrismarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.EXPERIENCE_ORE), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":oreExperience", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.COPPER_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockCopper", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.TIN_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockTin", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.BRONZE_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockBronze", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SILVER_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSilver", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.LEAD_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockLead", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.DIAMOND_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockDiamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.EMERALD_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockEmerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.OBSIDIAN_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockObsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.GLOWSTONE_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockGlowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.PRISMARINE_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockPrismarine", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.IMPROVED_DIAMOND_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockImprovedDiamond", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.IMPROVED_EMERALD_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockImprovedEmerald", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.IMPROVED_OBSIDIAN_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockImprovedObsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.IMPROVED_GLOWSTONE_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockImprovedGlowstone", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.WITHER_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockWither", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.DRAGON_BLOCK), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockDragon", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.WITHER_OBSIDIAN), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockWitherObsidian", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.DRAGON_OBSIDIAN), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockDragonObsidian", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.COMBINATOR_TIER1), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockCombinatorTier1", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.COMBINATOR_TIER2), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockCombinatorTier2", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.COMBINATOR_TIER3), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockCombinatorTier3", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.COMBINATOR_TIER4), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockCombinatorTier4", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER1), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier1", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER2), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier2", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER3), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier3", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER4), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier4", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER5), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier5", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER6), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier6", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER7), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier7", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER8), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier8", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER9), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier9", "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(IMBlocks.SOLAR_TIER10), 0, new ModelResourceLocation(ImprovedMetals.MODID + ":blockSolarPanelTier10", "inventory"));
		
		
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.EMERALD_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":emerald_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.OBSIDIAN_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":obsidian_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.IMDIAMOND_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imdiamond_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMDIAMOND_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imdiamond_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMDIAMOND_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imdiamond_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMDIAMOND_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imdiamond_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.IMEMERALD_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imemerald_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMEMERALD_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imemerald_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMEMERALD_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imemerald_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMEMERALD_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imemerald_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.IMOBSIDIAN_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imobsidian_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMOBSIDIAN_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imobsidian_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMOBSIDIAN_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imobsidian_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.IMOBSIDIAN_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":imobsidian_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.WITHER_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":wither_boots", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_HELMET, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_CHEST, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_chest", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_LEGGS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_leggs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(IMItems.DRAGON_BOOTS, 0, new ModelResourceLocation(ImprovedMetals.MODID + ":dragon_boots", "inventory"));

	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		// TODO Auto-generated method stub
		super.init(e);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		// TODO Auto-generated method stub
		super.postInit(e);
	}
	
	
}
