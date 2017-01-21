package de.improvedmetals.common.integration.tconstruct;

import de.improvedmetals.IMItems;
import de.improvedmetals.common.items.material.ItemIngot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.tools.ToolNBT;
import slimeknights.tconstruct.library.utils.TagUtil;

public class ModExtraModifier extends Modifier {

	public ModExtraModifier() {
		super("extra-modifier");
		this.addAspects(new ModifierAspect.SingleAspect(this), new ModifierAspect.DataAspect(this, 0xDECC00));
		this.addItem(new ItemStack(IMItems.INGOT, 1, ItemIngot.INGOT_GLOWSTONE), 1, 1);
	}

	@Override
	public boolean isHidden() {
		return false;
	}

	@Override
	public void applyEffect(NBTTagCompound rootCompound, NBTTagCompound modifierTag) {
		ToolNBT data = TagUtil.getToolStats(rootCompound);
		data.modifiers++;

		TagUtil.setToolTag(rootCompound, data.get());
	}

}
