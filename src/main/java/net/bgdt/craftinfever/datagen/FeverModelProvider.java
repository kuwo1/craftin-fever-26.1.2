package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.bgdt.craftinfever.item.FeverItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;

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
        blockModelGenerators.createTrivialCube(FeverBlocks.AMERICAN_BEECH_LEAVES);
        blockModelGenerators.createAxisAlignedPillarBlock(FeverBlocks.AMERICAN_BEECH_LOG, TexturedModel.CUBE_TOP_BOTTOM);

        blockModelGenerators.family(FeverBlocks.AMERICAN_BEECH_PLANKS)
                .slab(FeverBlocks.AMERICAN_BEECH_SLAB)
                .stairs(FeverBlocks.AMERICAN_BEECH_STAIRS);

        blockModelGenerators.createDoor(FeverBlocks.AMERICAN_BEECH_DOOR);
        blockModelGenerators.createTrapdoor(FeverBlocks.AMERICAN_BEECH_TRAPDOOR);

        blockModelGenerators.createBarsAndItem(FeverBlocks.CHICKEN_WIRE);








    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(FeverItems.STRAWBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(FeverItems.OMELETTE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(FeverItems.FELT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(FeverItems.GRAPES, ModelTemplates.FLAT_ITEM);
    }
}
