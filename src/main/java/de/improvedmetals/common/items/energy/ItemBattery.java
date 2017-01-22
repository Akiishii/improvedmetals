package de.improvedmetals.common.items.energy;

import java.util.List;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.integration.tesla.TeslaUtil;
import de.improvedmetals.common.utils.ItemUtils;
import de.improvedmetals.common.utils.StackUtils;
import de.improvedmetals.common.utils.StringUtils;
import net.darkhax.tesla.api.ITeslaConsumer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.common.Loader;

public class ItemBattery extends ItemEnergy{

	public ItemBattery(int cap, int maxOut, String name, String reg) {
		super(cap, maxOut, name, reg);
		this.setMaxStackSize(1);
	}

	@Override
    public boolean hasEffect(ItemStack stack){
        return ItemUtils.isEnabled(stack);
    }
	
	@Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected){
        if(!world.isRemote && entity instanceof EntityPlayer && ItemUtils.isEnabled(stack)){
            EntityPlayer player = (EntityPlayer)entity;
            for(int i = 0; i < player.inventory.getSizeInventory(); i++){
                ItemStack slot = player.inventory.getStackInSlot(i);
                if(StackUtils.isValid(slot)){
                    int extractable = this.extractEnergy(stack, Integer.MAX_VALUE, true);
                    int received = 0;
                    if(Loader.isModLoaded("tesla") && slot.hasCapability(TeslaUtil.teslaConsumer, null)){
                        ITeslaConsumer cap = slot.getCapability(TeslaUtil.teslaConsumer, null);
                        if(cap != null){
                            received = (int)cap.givePower(extractable, false);
                        }
                    }

                    if(received > 0){
                        this.extractEnergy(stack, received, false);
                    }
                }
            }
        }
    }
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player, EnumHand hand){
        if(!worldIn.isRemote && player.isSneaking()){
            ItemUtils.changeEnabled(player, hand);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
        }
        return super.onItemRightClick(itemStackIn, worldIn, player, hand);
    }
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool){
        super.addInformation(stack, player, list, bool);
        list.add(StringUtils.localize("tooltip."+ImprovedMetals.MODID+".battery."+(ItemUtils.isEnabled(stack) ? "discharge" : "noDischarge")));
        list.add(StringUtils.localize("tooltip."+ImprovedMetals.MODID+".battery.changeMode"));
    }
	
}
