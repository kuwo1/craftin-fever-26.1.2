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
        valueLookupBuilder(BlockTags.WOOL)
                .add(FeverBlocks.BLACK_QUILT_BLOCK)
                .add(FeverBlocks.WHITE_QUILT_BLOCK)
                .add(FeverBlocks.GRAY_QUILT_BLOCK)
                .add(FeverBlocks.LIGHT_GRAY_QUILT_BLOCK)
                .add(FeverBlocks.LIGHT_BLUE_QUILT_BLOCK)
                .add(FeverBlocks.BLUE_QUILT_BLOCK)
                .add(FeverBlocks.PURPLE_QUILT_BLOCK)
                .add(FeverBlocks.PINK_QUILT_BLOCK)
                .add(FeverBlocks.BROWN_QUILT_BLOCK)
                .add(FeverBlocks.YELLOW_QUILT_BLOCK)
                .add(FeverBlocks.RED_QUILT_BLOCK)
                .add(FeverBlocks.ORANGE_QUILT_BLOCK)
                .add(FeverBlocks.GREEN_QUILT_BLOCK)
                .add(FeverBlocks.LIME_QUILT_BLOCK)
                .add(FeverBlocks.CYAN_QUILT_BLOCK)
                .add(FeverBlocks.MAGENTA_QUILT_BLOCK);


        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(FeverBlocks.AMERICAN_BEECH_LOG);

        valueLookupBuilder(BlockTags.LOGS)
                .add(FeverBlocks.AMERICAN_BEECH_LOG);

        valueLookupBuilder(BlockTags.LEAVES)
                .add(FeverBlocks.AMERICAN_BEECH_LEAVES);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(FeverBlocks.AMERICAN_BEECH_PLANKS);

    }
}
