package net.bgdt.craftinfever.registries;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.fabricmc.fabric.api.registry.FuelValueEvents;

public class FeverFuels {
    public static void registerFuels(){
        FuelValueEvents.BUILD.register((builder, context) ->{
            builder.add(FeverBlocks.AMERICAN_BEECH_PLANKS, 300);
            builder.add(FeverBlocks.AMERICAN_BEECH_LOG, 300);
        } );

    }
}
