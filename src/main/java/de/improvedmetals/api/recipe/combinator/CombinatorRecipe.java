package de.improvedmetals.api.recipe.combinator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.item.ItemStack;

public class CombinatorRecipe {

	public static final ArrayList<CombinatorRecipe> allRecipes = new ArrayList<CombinatorRecipe>();
	public static final Set<CombinatorRecipeObject> allIngredients = Sets.newHashSet();

	public static final int MAX_INPUTS = 4;
	
	private CombinatorRecipeObject[] inputs;
	private ItemStack output;
	private int cookTime;
	private float experience;

	public CombinatorRecipe(ItemStack output, int cookTime, float experience, Object... inputs) {

	    this.inputs = CombinatorRecipeObject.getFromObjectArray(inputs);
	    this.output = output;
	    this.cookTime = cookTime;
	    this.experience = experience;
	  }

	public static void addRecipe(ItemStack output, int cookTime, float experience, Object... inputs) {

		CombinatorRecipe newRecipe = new CombinatorRecipe(output, cookTime, experience, inputs);
		for (CombinatorRecipeObject recipeObject : newRecipe.getInputs()) {
			allIngredients.add(recipeObject);
		}
		allRecipes.add(newRecipe);
	}
	
	public static CombinatorRecipe getMatchingRecipe(List<ItemStack> inputList) {

		for (CombinatorRecipe recipe : allRecipes) {
			if (recipe.matches(inputList)) {
				return recipe;
			}
		}

		return null;
	}

	public static CombinatorRecipe getRecipeByOutput(ItemStack stack) {

		for (CombinatorRecipe recipe : allRecipes) {
			if (recipe.getOutput().isItemEqual(stack)) {
				return recipe;
			}
		}

		return null;
	}

	public static boolean isValidIngredient(ItemStack stack) {

		ItemStack copy = stack.copy();
		copy.stackSize = 64;
		for (CombinatorRecipeObject recipeObject : allIngredients) {
			if (recipeObject.matches(copy)) {
				return true;
			}
		}
		return false;
	}

	public boolean matches(List<ItemStack> inputList) {

		// No inputs?
		if (inputs.length == 0) {
			return false;
		}

		// No outputs?
		if (output == null) {
			return false;
		}

		// Check that inputs match recipe. Order does not matter.
		boolean[] matches = new boolean[MAX_INPUTS];
		int i;
		for (ItemStack inputStack : inputList) {
			for (i = 0; i < inputs.length; ++i) {
				if (inputs[i] == null) {
					// Inputs shouldn't be null, but that is acceptable.
					matches[i] = true;
				} else if (inputs[i].matches(inputStack)) {
					// Correct item.
					matches[i] = true;
				}
			}
		}
		for (i = inputs.length; i < MAX_INPUTS; ++i) {
			matches[i] = true;
		}

		// All ingredients match up (or are null)?
		for (i = 0; i < MAX_INPUTS; ++i) {
			if (!matches[i]) {
				return false;
			}
		}

		return true;
	}

	public int getCookTime() {

		return cookTime;
	}

	public float getExperience() {

		return experience;
	}

	public CombinatorRecipeObject[] getInputs() {

		return inputs.clone();
	}

	public ItemStack getOutput() {

		return output.copy();
	}
	
}
