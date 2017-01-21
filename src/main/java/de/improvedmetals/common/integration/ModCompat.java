package de.improvedmetals.common.integration;

import java.util.ArrayList;
import java.util.List;

import de.improvedmetals.common.integration.tconstruct.CompatibilityTConstruct;
import net.minecraftforge.fml.common.Loader;
import tehnut.lib.iface.ICompatibility;

public class ModCompat {

	private static List<ICompatibility> compatibilities = new ArrayList<ICompatibility>();
	
	public static void registerModCompat() {
        compatibilities.add(new CompatibilityTConstruct());
    }

    public static void loadCompat(ICompatibility.InitializationPhase phase) {
        for (ICompatibility compatibility : compatibilities)
            if (Loader.isModLoaded(compatibility.getModId()) && compatibility.enableCompat())
                compatibility.loadCompatibility(phase);
    }
	
}
