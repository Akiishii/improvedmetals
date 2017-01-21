package de.improvedmetals.common.handler;

import java.util.Random;

import de.improvedmetals.IMItems;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEventHandler {

	public Random rand = new Random();
	
	@SubscribeEvent
	public void onLivingDrops(LivingDropsEvent e){
		if(e.getEntityLiving().worldObj != null && !e.getEntityLiving().worldObj.isRemote && e.getSource().getEntity() instanceof EntityPlayer){
			if(e.getEntityLiving() instanceof EntityDragon){
				if(rand.nextInt(20) <= e.getLootingLevel() * 2){
					e.getEntityLiving().entityDropItem(new ItemStack(IMItems.DRAGON_CLAW, rand.nextInt(2 + e.getLootingLevel()) + 1), 0);
					e.getEntityLiving().entityDropItem(new ItemStack(IMItems.DRAGON_SCALE, rand.nextInt(2 + e.getLootingLevel()) + 1), 0);
				}
			}
			if(e.getEntityLiving() instanceof EntityWither){
				if(rand.nextInt(20) <= e.getLootingLevel() * 2){
					e.getEntityLiving().entityDropItem(new ItemStack(IMItems.WITHER_BONE, rand.nextInt(2 + e.getLootingLevel()) + 1), 0);
				}
			}
		}	
	}
	
	
	
}
