package de.improvedmetals.common.integration.tconstruct;

import de.improvedmetals.IMItems;
import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.items.material.ItemIngot;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import slimeknights.tconstruct.common.ModelRegisterUtil;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.Util;
import slimeknights.tconstruct.library.client.MaterialRenderInfo;
import slimeknights.tconstruct.library.client.texture.MetalTextureTexture;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.tools.TinkerTraits;

public class HandlerTConstruct {

	public static Modifier extraModifier;
	public static Material materialGlowstone;

	public static void init() {

		extraModifier = new ModExtraModifier();
		extraModifier.addItem(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 16, 1);

		materialGlowstone = new Material("glowstone", 0xDECC00);

		materialGlowstone.setCraftable(true);
		materialGlowstone.addTrait(TinkerTraits.writable, HeadMaterialStats.TYPE);
		materialGlowstone.addItem(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 1, Material.VALUE_Ingot);
		materialGlowstone.setRepresentativeItem(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE));

		TinkerRegistry.addMaterial(materialGlowstone);
		TinkerRegistry.addMaterialStats(materialGlowstone, 
				new HeadMaterialStats(674, 12F, 4F, 3),
				new HandleMaterialStats(1.2F, 80), 
				new ExtraMaterialStats(70)
		);

	}

	@SideOnly(Side.CLIENT)
	public static void initRender() {
		
		ModelRegisterUtil.registerModifierModel(extraModifier, new ResourceLocation(ImprovedMetals.MODID, "models/item/modifiers/extraModifier"));
		
		materialGlowstone.setRenderInfo(new MaterialRenderInfo.AbstractMaterialRenderInfo() {
		
			@Override
			public TextureAtlasSprite getTexture(TextureAtlasSprite baseTexture, String location) {
				return new MetalTextureTexture(Util.resource("items/materials/ardite_rust"), baseTexture, location,
						0xDECC00, 0.6f, 1.0f, 0.1f);
			}
		});
	}

}
