package de.improvedmetals.common.proxy;

import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.container.combinator.ContainerCombinatorTier1;
import de.improvedmetals.common.container.combinator.ContainerCombinatorTier2;
import de.improvedmetals.common.container.combinator.ContainerCombinatorTier3;
import de.improvedmetals.common.container.combinator.ContainerCombinatorTier4;
import de.improvedmetals.common.gui.GuiCombinator;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier1;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier2;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier3;
import de.improvedmetals.common.tiles.combinator.TileCombinatorTier4;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		BlockPos pos = new BlockPos(x, y, z);
		TileEntity tile = world.getTileEntity(pos);
		
		if(ID == ConfigValues.GuiCombinator){
			if(tile instanceof TileCombinatorTier1){
				TileCombinatorTier1 tileCombinator = (TileCombinatorTier1) tile;
				return new ContainerCombinatorTier1(player.inventory, tileCombinator);
			}
			else if(tile instanceof TileCombinatorTier2){
				TileCombinatorTier2 tileCombinator = (TileCombinatorTier2) tile;
				return new ContainerCombinatorTier2(player.inventory, tileCombinator);
			}
			else if(tile instanceof TileCombinatorTier3){
				TileCombinatorTier3 tileCombinator = (TileCombinatorTier3) tile;
				return new ContainerCombinatorTier3(player.inventory, tileCombinator);
			}
			else if(tile instanceof TileCombinatorTier4){
				TileCombinatorTier4 tileCombinator = (TileCombinatorTier4) tile;
				return new ContainerCombinatorTier4(player.inventory, tileCombinator);
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		BlockPos pos = new BlockPos(x, y, z);
		TileEntity tile = world.getTileEntity(pos);
		
		if (ID == ConfigValues.GuiCombinator) {

			if (tile instanceof TileCombinatorTier1) {

				TileCombinatorTier1 tileCombinator = (TileCombinatorTier1) tile;
				return new GuiCombinator(player.inventory, tileCombinator);

			}
			else if (tile instanceof TileCombinatorTier2) {

				TileCombinatorTier2 tileCombinator = (TileCombinatorTier2) tile;
				return new GuiCombinator(player.inventory, tileCombinator);

			}
			else if (tile instanceof TileCombinatorTier3) {

				TileCombinatorTier3 tileCombinator = (TileCombinatorTier3) tile;
				return new GuiCombinator(player.inventory, tileCombinator);

			}
			else if (tile instanceof TileCombinatorTier4) {

				TileCombinatorTier4 tileCombinator = (TileCombinatorTier4) tile;
				return new GuiCombinator(player.inventory, tileCombinator);

			}
		}
		return null;
	}
}
