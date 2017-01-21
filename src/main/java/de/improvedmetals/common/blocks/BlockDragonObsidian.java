package de.improvedmetals.common.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDragonObsidian extends BlockBase{

private String name;
	
	public BlockDragonObsidian(int i, String name) {
		super(name);
		this.name = name;
		setHardness(50F);
		setResistance(2000F);
		setHarvestLevel("pickaxe", i);
	}
	
	@Override
	public boolean canEntityDestroy(IBlockState state, IBlockAccess world, BlockPos pos, Entity entity) {
		return entity instanceof EntityPlayer;
	}

	@Override
	public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosionIn) {
		return false;
	}
	
}
