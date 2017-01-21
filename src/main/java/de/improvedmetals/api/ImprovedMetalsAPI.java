package de.improvedmetals.api;

import de.improvedmetals.api.recipe.combinator.CombinatorRecipe;
import net.minecraft.item.ItemStack;

public class ImprovedMetalsAPI {

	/** 
	 * @param output
	 *            The recipe result. You must set the stack size!
	 * @param cookTime
	 *            The time in ticks to smelt the recipe.
	 * @param experience
	 *            The experience awarded for smelting.
	 * @param inputs
	 *            The ingredients (see above for details).
	 */
	public static void addCombinatorRecipe(ItemStack output, int cookTime, float experience, Object... inputs) {

		CombinatorRecipe.addRecipe(output, cookTime, experience, inputs);
	}

	/**
	 * Same as above, but copies the output and sets its size for you. Handy.
	 * 
	 * @param output
	 *            The recipe result.
	 * @param outputCount
	 *            The stack size of the result.
	 * @param cookTime
	 *            The time in ticks to smelt the recipe.
	 * @param experience
	 *            The experience awarded for smelting.
	 * @param inputs
	 *            The ingredients (see previous method for details).
	 */
	public static void addCombinatorRecipe(ItemStack output, int outputCount, int cookTime, float experience,
			Object... inputs) {

		ItemStack newOutput = output.copy();
		newOutput.stackSize = outputCount;
		addCombinatorRecipe(newOutput, cookTime, experience, inputs);
	}
	
}
