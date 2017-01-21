package de.improvedmetals.common.gui;

import de.improvedmetals.ImprovedMetals;
import de.improvedmetals.common.container.combinator.ContainerCombinatorTier1;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;

public class GuiCombinator extends GuiContainer {

		private static final ResourceLocation guiTextures = new ResourceLocation(ImprovedMetals.MODID,
				"textures/gui/Combinator.png");
		private final InventoryPlayer playerInventory;
		private IInventory tileCombinator;

		public GuiCombinator(InventoryPlayer playerInventory, IInventory smelterInventory) {

			super(new ContainerCombinatorTier1(playerInventory, smelterInventory));
			this.playerInventory = playerInventory;
			this.tileCombinator = smelterInventory;
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.getTextureManager().bindTexture(guiTextures);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
			int i1;

			if (TileEntityFurnace.isBurning(this.tileCombinator)) {
				i1 = this.getBurnLeftScaled(13);
				this.drawTexturedModalRect(k + 14, l + 26 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
			}

			i1 = this.getCookProgressScaled(24);
			this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);

			// drawDebugInfo();
		}

		private int getCookProgressScaled(int pixels) {

			int j = this.tileCombinator.getField(2);
			int k = this.tileCombinator.getField(3);
			return k != 0 && j != 0 ? j * pixels / k : 0;
		}

		private int getBurnLeftScaled(int pixels) {

			int j = this.tileCombinator.getField(1);

			if (j == 0) {
				j = 200;
			}

			return this.tileCombinator.getField(0) * pixels / j;
		}
	
}
