package de.improvedmetals.common.integration.jei.combinator;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import de.improvedmetals.api.recipe.combinator.CombinatorRecipe;

public class CombinatorRecipeMaker {

	@Nonnull
	public static List<CombinatorRecipeJEI> getRecipes() {

		ArrayList<CombinatorRecipeJEI> recipes = new ArrayList<CombinatorRecipeJEI>();

		for (CombinatorRecipe smelterRecipe : CombinatorRecipe.allRecipes) {
			recipes.add(new CombinatorRecipeJEI(smelterRecipe));
		}

		return recipes;
	}
	
}
