package de.improvedmetals.common.tiles.solar;

import de.improvedmetals.common.config.ConfigValues;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.ITeslaProducer;
import net.minecraftforge.energy.IEnergyStorage;
import scala.collection.generic.BitOperations.Int;

public class ContainerSolarPanelTier6 implements ITeslaHolder, ITeslaProducer, IEnergyStorage {

	/**
     * The power stored by the solar container.
     */
    private long storedPower = 0;
    
    @Override
    public long takePower (long tesla, boolean simulated) {
        
        final long removedPower = Math.min(this.storedPower, Math.min(ConfigValues.tier6PanelTransferRate, tesla));
        
        if (!simulated)
            this.storedPower -= removedPower;
            
        return removedPower;
    }
    
    @Override
    public long getStoredPower () {
        
        return this.storedPower;
    }
    
    @Override
    public long getCapacity () {
        
        return ConfigValues.tier6PanelCapacity;
    }
    
    /**
     * Handles the passive power generation of the tile.
     */
    public void generatePower () {
        
        this.storedPower += ConfigValues.tier6PanelPowerGen;
        
        if (this.storedPower > this.getCapacity())
            this.storedPower = this.getCapacity();
    }
    
    /**
     * Sets the power of the container. Should only be used internally!
     * 
     * @param power
     */
    protected void setPower (long power) {
        
        this.storedPower = power;
    }
    
    /**
     * Converts from long to int in a same way. If the long is outside of the int scope, the
     * max int scope value will be used.
     * 
     * @param power The power to convert.
     * @return An int safe version of the power.
     */
    public static int getIntPower (long power) {
        
        if (power < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
            
        if (power > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
            
        return (int) power;
    }
    
    /*
     * =========================== FORGE START ===========================
     */
    
    @Override
    public int extractEnergy (int maxExtract, boolean simulate) {
        
        return getIntPower(this.takePower(maxExtract, simulate));
    }
    
    @Override
    public int receiveEnergy (int maxReceive, boolean simulate) {
        
        return 0;
    }
    
    @Override
    public int getEnergyStored () {
        
        return getIntPower(this.storedPower);
    }
    
    @Override
    public int getMaxEnergyStored () {
        
        return getIntPower(this.getCapacity());
    }
    
    @Override
    public boolean canExtract () {
        
        return true;
    }
    
    @Override
    public boolean canReceive () {
        
        return false;
    }
}