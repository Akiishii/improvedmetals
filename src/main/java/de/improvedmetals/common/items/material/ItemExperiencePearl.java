package de.improvedmetals.common.items.material;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.items.ItemBase;
import de.improvedmetals.common.utils.StackUtils;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemExperiencePearl extends ItemBase{

	public ItemExperiencePearl(String name) {
		super(name);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {

		if(!world.isRemote){
            int amount;
            if(!player.isSneaking()){
                amount = 10;
                if(!player.capabilities.isCreativeMode){
                    stack.stackSize--;
                }
            }
            else{
                amount = 10 * StackUtils.getStackSize(stack);
                if(!player.capabilities.isCreativeMode){
                    stack.stackSize = 0;
                }
            }

            EntityXPOrb orb = new EntityXPOrb(world, player.posX + 0.5, player.posY + 0.5, player.posZ + 0.5, amount);
            orb.getEntityData().setBoolean(ImprovedMetals.MODID + "used", true);
            world.spawnEntityInWorld(orb);
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
		
	}
	
}
