package de.improvedmetals.common.integration.tconstruct;

import javax.annotation.Nonnull;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import tehnut.lib.iface.ICompatibility;

public class CompatibilityTConstruct implements ICompatibility {

	@Override
    public void loadCompatibility(InitializationPhase phase) {
        if (phase == InitializationPhase.PRE_INIT) {
            HandlerTConstruct.init();
            if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
                HandlerTConstruct.initRender();
        }
    }

    @Override
    @Nonnull
    public String getModId() {
        return "tconstruct";
    }

    @Override
    public boolean enableCompat() {
        return true;
    }

}
