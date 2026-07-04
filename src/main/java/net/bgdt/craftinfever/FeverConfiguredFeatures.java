package net.bgdt.craftinfever;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//what am I even doing dog
public class FeverConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> AMERICAN_BEECH_TREE = registerKey("american_beech_tree");


    public static void configure(BootstrapContext<ConfiguredFeature<?,?>> context){

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name));
    }
}
