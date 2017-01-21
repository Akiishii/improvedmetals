package de.improvedmetals.common.integration.jei.combinator;

import javax.annotation.Nonnull;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.api.recipe.combinator.CombinatorRecipeObject;
import de.improvedmetals.common.integration.IMPlugin;
import de.improvedmetals.common.tiles.TileCombinatorTier1;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class CombinatorRecipeCategory implements IRecipeCategory{

	public static final String CATEGORY = ImprovedMetals.MODID + ":Combinator";

	@Nonnull
	protected final IDrawable background;
	@Nonnull
	protected final IDrawableAnimated flame;
	@Nonnull
	protected final IDrawableAnimated arrow;
	@Nonnull
	private final String localizedName = ImprovedMetals.INSTANCE.localHelper.getLocalizedString(("jei.improvedmetals.recipe.Combinator"));
	
	public CombinatorRecipeCategory(IGuiHelper guiHelper) {

	    ResourceLocation backgroundLocation = new ResourceLocation(ImprovedMetals.MODID + ":textures/gui/jei/Combinator_JEI.png");

	    background = IMPlugin.jeiHelper.getGuiHelper().createDrawable(backgroundLocation, 0, 0, 120, 40);

	    ResourceLocation furnaceLocation = new ResourceLocation("minecraft","textures/gui/container/furnace.png");
	    IDrawableStatic flameDrawable = guiHelper.createDrawable(furnaceLocation, 176, 0, 14, 14);
	    flame = guiHelper.createAnimatedDrawable(flameDrawable, 300, IDrawableAnimated.StartDirection.TOP, true);

	    IDrawableStatic arrowDrawable = guiHelper.createDrawable(furnaceLocation, 176, 14, 24, 17);
	    this.arrow = guiHelper.createAnimatedDrawable(arrowDrawable, 200, IDrawableAnimated.StartDirection.LEFT, false);
	  }

	@Override
	public void drawAnimations(Minecraft mc) {

		flame.draw(mc, 2, 4);
		arrow.draw(mc, 62, 10);
	}

	@Override
	public void drawExtras(Minecraft mc) {

	}

	@Override
	public IDrawable getBackground() {

		return background;
	}

	@Override
	public String getTitle() {

		return localizedName;
	}

	@Override
	public String getUid() {

		return CATEGORY;
	}

	@Override
	public IDrawable getIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {

		recipeLayout.getItemStacks().init(0, true, 25, 1);
		recipeLayout.getItemStacks().init(1, true, 43, 1);
		recipeLayout.getItemStacks().init(2, true, 25, 19);
		recipeLayout.getItemStacks().init(3, true, 43, 19);
		recipeLayout.getItemStacks().init(TileCombinatorTier1.SLOT_FUEL, true, 0, 15);
		recipeLayout.getItemStacks().init(TileCombinatorTier1.SLOT_OUTPUT, false, 98, 10);

		if (recipeWrapper instanceof CombinatorRecipeJEI) {
			CombinatorRecipeJEI wrapper = (CombinatorRecipeJEI) recipeWrapper;
			// Set inputs
			for (int i = 0; i < wrapper.getInputObjects().size(); ++i) {
				Object obj = wrapper.getInputObjects().get(i);
				CombinatorRecipeObject recipeObject = (CombinatorRecipeObject) obj;
				recipeLayout.getItemStacks().set(i, recipeObject.getPossibleItemStacks());
			}
			// Set output
			recipeLayout.getItemStacks().set(TileCombinatorTier1.SLOT_OUTPUT, wrapper.getOutputs());
		}
		
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper) {

		setRecipe(recipeLayout, recipeWrapper, null);
		
	}
	
}
