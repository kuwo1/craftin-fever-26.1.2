package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class FeverBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public FeverBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.WOOL)
                .add(FeverBlocks.getRK(FeverBlocks.BLACK_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.WHITE_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.GRAY_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.LIGHT_GRAY_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.LIGHT_BLUE_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.BLUE_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.PURPLE_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.PINK_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.BROWN_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.YELLOW_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.RED_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.ORANGE_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.GREEN_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.LIME_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.CYAN_QUILT_BLOCK))
                .add(FeverBlocks.getRK(FeverBlocks.MAGENTA_QUILT_BLOCK));


        
        tag(BlockTags.LOGS)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_LOG));

        tag(BlockTags.LEAVES)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_LEAVES));

        tag(BlockTags.PLANKS)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_PLANKS));

        tag(BlockTags.SLABS)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_SLAB));

        tag(BlockTags.STAIRS)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_STAIRS));

        tag(BlockTags.LEAVES)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_LEAVES));

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_LOG))
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_PLANKS));

        tag(BlockTags.CROPS)
                .add(FeverBlocks.getRK(FeverBlocks.GRAPE_BUSH));

        tag(BlockTags.DOORS)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_DOOR));

        tag(BlockTags.TRAPDOORS)
                .add(FeverBlocks.getRK(FeverBlocks.AMERICAN_BEECH_TRAPDOOR));

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(FeverBlocks.getRK(FeverBlocks.CHICKEN_WIRE));



    }
}

