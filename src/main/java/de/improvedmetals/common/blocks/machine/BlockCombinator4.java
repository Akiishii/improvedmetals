package de.improvedmetals.common.blocks.machine;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.tiles.TileCombinatorTier4;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCombinator4 extends BlockMachineBase{

	public BlockCombinator4() {
		
		super(Material.ROCK, "blockCombinatorTier4");
		setRegistryName(ImprovedMetals.MODID, "blockCombinatorTier4");
		
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		
		return new TileCombinatorTier4();
		
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if(worldIn.isRemote){
			return true;
		} else {
			TileEntity tile = worldIn.getTileEntity(pos);
			if(tile instanceof TileCombinatorTier4){
				playerIn.openGui(ImprovedMetals.INSTANCE, ConfigValues.GuiCombinator, worldIn, pos.getX(), pos.getY(), pos.getZ());
			}
			
			return true;
		}
		
	}

	
	
}
