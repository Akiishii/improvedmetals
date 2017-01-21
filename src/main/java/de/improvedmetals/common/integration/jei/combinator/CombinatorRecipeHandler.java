package de.improvedmetals.common.integration.jei.combinator;

import javax.annotation.Nonnull;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class CombinatorRecipeHandler implements IRecipeHandler<CombinatorRecipeJEI> {

	 @Override
	  public String getRecipeCategoryUid() {

	    return CombinatorRecipeCategory.CATEGORY;
	  }
	 
	  //@Override // TODO: Uncomment in 1.10.x
	  public String getRecipeCategoryUid(CombinatorRecipeJEI arg0) {

	    return CombinatorRecipeCategory.CATEGORY;
	  }

	  @Override
	  public Class<CombinatorRecipeJEI> getRecipeClass() {

	    return CombinatorRecipeJEI.class;
	  }

	  @Override
	  public IRecipeWrapper getRecipeWrapper(@Nonnull CombinatorRecipeJEI recipe) {

	    return recipe;
	  }

	  @Override
	  public boolean isRecipeValid(CombinatorRecipeJEI recipe) {

	    return recipe.getInputObjects().size() > 0 && recipe.getOutputs().size() > 0;
	  }

}
