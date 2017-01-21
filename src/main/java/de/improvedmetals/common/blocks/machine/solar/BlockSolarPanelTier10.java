package de.improvedmetals.common.blocks.machine.solar;

import java.util.List;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.blocks.BlockBase;
import de.improvedmetals.common.config.ConfigValues;
import de.improvedmetals.common.tiles.solar.ContainerSolarPanelTier10;
import de.improvedmetals.common.tiles.solar.TileEntityTier10SolarPanel;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSolarPanelTier10 extends BlockBase implements ITileEntityProvider{

	private static final AxisAlignedBB BOUNDS = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D);
    private static final int CHAT_ID = 98189813;
	
	public BlockSolarPanelTier10(){
		super("blockSolarPanelTier10");
		this.isBlockContainer = true;
		this.setHardness(0.2F);
		this.setSoundType(SoundType.GLASS);
		this.setCreativeTab(ImprovedMetals.INSTANCE.tab);
		this.setLightOpacity(0);
		
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		tooltip.add("Capacity: " + ConfigValues.tier10PanelCapacity);
		tooltip.add("Generation: " + ConfigValues.tier10PanelPowerGen + " T/t");
		tooltip.add("Transfer Rate: " + ConfigValues.tier10PanelTransferRate + " T/t");
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if(worldIn.isRemote){
			
			final TileEntity tile = worldIn.getTileEntity(pos);
			
			if(tile instanceof TileEntityTier10SolarPanel && !tile.isInvalid()){
				final TileEntityTier10SolarPanel panel = (TileEntityTier10SolarPanel) tile;
				final ContainerSolarPanelTier10 container = (ContainerSolarPanelTier10) panel.getCapability(TeslaCapabilities.CAPABILITY_HOLDER, EnumFacing.DOWN);
				
				sendSpamlessMessage(CHAT_ID, new TextComponentString(I18n.format("message.improvedmetals.panel.status",	container.getStoredPower(), container.getCapacity(), ConfigValues.tier10PanelPowerGen)));
			}
		}
		
		return true;
		
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		
		super.breakBlock(worldIn, pos, state);
		worldIn.removeTileEntity(pos);
		
	}
	
	@Override
	public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int id, int param) {
		
		super.eventReceived(state, worldIn, pos, id, param);
		final TileEntity tile = worldIn.getTileEntity(pos);
		return tile == null ? false : tile.receiveClientEvent(id, param);
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		
		return new TileEntityTier10SolarPanel();
		
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		
		return BOUNDS;
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered (IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        
        return side == EnumFacing.UP ? true : blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    
	}
    
    @Override
    public boolean doesSideBlockRendering (IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
        
        return face == EnumFacing.DOWN;
        
    }
	
    @SideOnly(Side.CLIENT)
    private static void sendSpamlessMessage (int messageID, ITextComponent message) {
        
        final GuiNewChat chat = Minecraft.getMinecraft().ingameGUI.getChatGUI();
        chat.printChatMessageWithOptionalDeletion(message, messageID);
        
    }
    
}
