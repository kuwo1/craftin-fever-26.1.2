package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.bgdt.craftinfever.item.FeverItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class FeverModelProvider extends FabricModelProvider {
    public FeverModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(FeverBlocks.WHITE_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.LIGHT_GRAY_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.GRAY_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.BLACK_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.BLUE_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.LIGHT_BLUE_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.PURPLE_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.PINK_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.BROWN_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.YELLOW_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.RED_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.ORANGE_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.GREEN_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.LIME_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.CYAN_QUILT_BLOCK);
        blockModelGenerators.createTrivialCube(FeverBlocks.MAGENTA_QUILT_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(FeverItems.STRAWBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(FeverItems.OMELETTE, ModelTemplates.FLAT_ITEM);
    }
}
