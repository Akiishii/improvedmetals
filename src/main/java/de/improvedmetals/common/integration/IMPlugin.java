package de.improvedmetals.common.integration;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.common.gui.GuiCombinator;
import de.improvedmetals.common.integration.jei.combinator.CombinatorRecipeCategory;
import de.improvedmetals.common.integration.jei.combinator.CombinatorRecipeHandler;
import de.improvedmetals.common.integration.jei.combinator.CombinatorRecipeMaker;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import net.minecraft.item.ItemStack;

@JEIPlugin
public class IMPlugin implements IModPlugin{
	
	public static IJeiHelpers jeiHelper;

	@Override
	public void register(IModRegistry registry) {

		jeiHelper = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelper.getGuiHelper();

		registry.addRecipeCategories(new CombinatorRecipeCategory(guiHelper));
		registry.addRecipeHandlers(new CombinatorRecipeHandler());
		registry.addRecipes(CombinatorRecipeMaker.getRecipes());
		registry.addRecipeClickArea(GuiCombinator.class, 80, 34, 25, 16, CombinatorRecipeCategory.CATEGORY);
		registry.addRecipeCategoryCraftingItem(new ItemStack(IMBlocks.COMBINATOR_TIER1), CombinatorRecipeCategory.CATEGORY);

		registry.addDescription(new ItemStack(IMBlocks.COMBINATOR_TIER1), "jei.improvedmetals.desc.Combinator");
		
	}

	@Override
	public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {

	}

	@Override
	public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerIngredients(IModIngredientRegistration registry) {
		// TODO Auto-generated method stub
		
	}
	
}
