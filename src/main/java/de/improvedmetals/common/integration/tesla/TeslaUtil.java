package de.improvedmetals.common.integration.tesla;

import java.util.HashMap;
import java.util.Map;

import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.darkhax.tesla.api.ITeslaConsumer;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.ITeslaProducer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class TeslaUtil {
	
    @CapabilityInject(ITeslaConsumer.class)
    public static Capability<ITeslaConsumer> teslaConsumer;
    @CapabilityInject(ITeslaProducer.class)
    public static Capability<ITeslaProducer> teslaProducer;
    @CapabilityInject(ITeslaHolder.class)
    public static Capability<ITeslaHolder> teslaHolder;

    public static void doWrappedTeslaRFInteraction(TileEntity tileFrom, TileEntity tileTo, EnumFacing side, int maxTransfer){
        if(tileTo.hasCapability(teslaConsumer, side.getOpposite()) && tileFrom.hasCapability(teslaProducer, side)){
            ITeslaConsumer handlerTo = tileTo.getCapability(teslaConsumer, side.getOpposite());
            ITeslaProducer handlerFrom = tileFrom.getCapability(teslaProducer, side);

            long drain = handlerFrom.takePower(maxTransfer, true);
            if(drain > 0){
                long filled = handlerTo.givePower(drain, false);
                handlerFrom.takePower(filled, false);
            }
        }
    }

	
}
