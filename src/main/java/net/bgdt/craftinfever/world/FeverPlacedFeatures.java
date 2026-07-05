package net.bgdt.craftinfever.world;

import net.bgdt.craftinfever.CraftinFever;
import net.bgdt.craftinfever.block.FeverBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.state.predicate.BlockPredicate;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

import static net.bgdt.craftinfever.world.FeverConfiguredFeatures.registerKey;
import static net.minecraft.data.worldgen.placement.PlacementUtils.createKey;

public class FeverPlacedFeatures {
    public static final ResourceKey<PlacedFeature> AMERICAN_BEECH_PLACED = createKey("american_beech_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        var treeConfigured = configuredFeatures.getOrThrow(FeverConfiguredFeatures.AMERICAN_BEECH_TREE);

        context.register(AMERICAN_BEECH_PLACED, new PlacedFeature(treeConfigured,
                List.of(
                        PlacementUtils.countExtra(10, 0.1f, 1),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                                VerticalAnchor.absolute(30)), BiomeFilter.biome())));
    }

    public static ResourceKey<PlacedFeature> createKey(final String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID ,name));
    }

}
