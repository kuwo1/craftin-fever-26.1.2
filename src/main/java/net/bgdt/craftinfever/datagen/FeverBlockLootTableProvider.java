package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class FeverBlockLootTableProvider extends FabricBlockLootSubProvider {
    public FeverBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(FeverBlocks.BLACK_QUILT_BLOCK);
        dropSelf(FeverBlocks.WHITE_QUILT_BLOCK);
        dropSelf(FeverBlocks.GRAY_QUILT_BLOCK);
        dropSelf(FeverBlocks.LIGHT_GRAY_QUILT_BLOCK);
        dropSelf(FeverBlocks.LIGHT_BLUE_QUILT_BLOCK);
        dropSelf(FeverBlocks.BLUE_QUILT_BLOCK);
        dropSelf(FeverBlocks.PURPLE_QUILT_BLOCK);
        dropSelf(FeverBlocks.PINK_QUILT_BLOCK);
        dropSelf(FeverBlocks.BROWN_QUILT_BLOCK);
        dropSelf(FeverBlocks.YELLOW_QUILT_BLOCK);
        dropSelf(FeverBlocks.RED_QUILT_BLOCK);
        dropSelf(FeverBlocks.ORANGE_QUILT_BLOCK);
        dropSelf(FeverBlocks.GREEN_QUILT_BLOCK);
        dropSelf(FeverBlocks.LIME_QUILT_BLOCK);
        dropSelf(FeverBlocks.CYAN_QUILT_BLOCK);
        dropSelf(FeverBlocks.MAGENTA_QUILT_BLOCK);

    }
}
