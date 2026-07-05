package net.bgdt.craftinfever.world;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.state.predicate.BlockPredicate;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

import static net.bgdt.craftinfever.world.FeverConfiguredFeatures.registerKey;

public class FeverPlacedFeatures {
    public static final ResourceKey<PlacedFeature> AMERICAN_BEECH_PLACED = registerKey("american_beech_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context){
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        var treeConfigured = configuredFeatures.getOrThrow(FeverConfiguredFeatures.AMERICAN_BEECH_TREE);

        context.register(AMERICAN_BEECH_PLACED, new PlacedFeature(treeConfigured,
                List.of(
                        PlacementUtils.countExtra(10,0.1f, 1),
                       InSquarePlacementModifier.getInstance(),
                        HeightmapPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING),
                        BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(FeverBlocks.))
                )));
    }
}
