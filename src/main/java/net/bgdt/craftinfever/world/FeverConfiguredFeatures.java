package net.bgdt.craftinfever.world;

import net.bgdt.craftinfever.CraftinFever;
import net.bgdt.craftinfever.block.FeverBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

//what am I even doing dog
public class FeverConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> AMERICAN_BEECH_TREE = registerKey("american_beech_tree");

    public static void bootstrap(final BootstrapContext<ConfiguredFeature<?,?>> context){
        register(context, AMERICAN_BEECH_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(FeverBlocks.AMERICAN_BEECH_LOG),
                new StraightTrunkPlacer(5, 2,2),
                BlockStateProvider.simple(FeverBlocks.AMERICAN_BEECH_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1,0,1)
        ).build());
    }


    public static void configure(BootstrapContext<ConfiguredFeature<?,?>> context){

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(final BootstrapContext<ConfiguredFeature<?,?>> context,
                                                                                         final ResourceKey<ConfiguredFeature<?,?>> id,
                                                                                         final F feature,
                                                                                         final FC config){
        context.register(id, new ConfiguredFeature(feature, config));
    }
}
