package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.bgdt.craftinfever.item.FeverItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FeverRecipeProvider extends FabricRecipeProvider {
    public FeverRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> STRAWBERRY_SMELTABLES = List.of(FeverItems.OMELETTE, FeverBlocks.WHITE_QUILT_BLOCK);


                shaped(RecipeCategory.MISC, FeverBlocks.WHITE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WHITE_WOOL)
                        .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                        .group("wool")
                        .save(output, "white_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BLACK_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.BLACK_WOOL)
                        .unlockedBy(getHasName(Blocks.BLACK_WOOL), has(Blocks.BLACK_WOOL))
                        .group("wool")
                        .save(output, "black_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIGHT_GRAY_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.LIGHT_GRAY_WOOL)
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_WOOL), has(Blocks.LIGHT_GRAY_WOOL))
                        .group("wool")
                        .save(output, "light_gray_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.GRAY_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.GRAY_WOOL)
                        .unlockedBy(getHasName(Blocks.GRAY_WOOL), has(Blocks.GRAY_WOOL))
                        .group("wool")
                        .save(output, "gray_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BLUE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.BLUE_WOOL)
                        .unlockedBy(getHasName(Blocks.BLUE_WOOL), has(Blocks.BLUE_WOOL))
                        .group("wool")
                        .save(output, "blue_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIGHT_BLUE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.LIGHT_BLUE_WOOL)
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_WOOL), has(Blocks.LIGHT_BLUE_WOOL))
                        .group("wool")
                        .save(output, "light_blue_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.PURPLE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.PURPLE_WOOL)
                        .unlockedBy(getHasName(Blocks.PURPLE_WOOL), has(Blocks.PURPLE_WOOL))
                        .group("wool")
                        .save(output, "purple_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.PINK_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.PINK_WOOL)
                        .unlockedBy(getHasName(Blocks.PINK_WOOL), has(Blocks.PINK_WOOL))
                        .group("wool")
                        .save(output, "pink_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BROWN_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.BROWN_WOOL)
                        .unlockedBy(getHasName(Blocks.BROWN_WOOL), has(Blocks.BROWN_WOOL))
                        .group("wool")
                        .save(output, "brown_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.YELLOW_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.YELLOW_WOOL)
                        .unlockedBy(getHasName(Blocks.YELLOW_WOOL), has(Blocks.YELLOW_WOOL))
                        .group("wool")
                        .save(output, "yellow_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.RED_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.RED_WOOL)
                        .unlockedBy(getHasName(Blocks.RED_WOOL), has(Blocks.RED_WOOL))
                        .group("wool")
                        .save(output, "red_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.ORANGE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.ORANGE_WOOL)
                        .unlockedBy(getHasName(Blocks.ORANGE_WOOL), has(Blocks.ORANGE_WOOL))
                        .group("wool")
                        .save(output, "orange_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.GREEN_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.GREEN_WOOL)
                        .unlockedBy(getHasName(Blocks.GREEN_WOOL), has(Blocks.GREEN_WOOL))
                        .group("wool")
                        .save(output, "green_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIME_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.LIME_WOOL)
                        .unlockedBy(getHasName(Blocks.LIME_WOOL), has(Blocks.LIME_WOOL))
                        .group("wool")
                        .save(output, "lime_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.CYAN_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.CYAN_WOOL)
                        .unlockedBy(getHasName(Blocks.CYAN_WOOL), has(Blocks.CYAN_WOOL))
                        .group("wool")
                        .save(output, "cyan_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.MAGENTA_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.MAGENTA_WOOL)
                        .unlockedBy(getHasName(Blocks.MAGENTA_WOOL), has(Blocks.MAGENTA_WOOL))
                        .group("wool")
                        .save(output, "magenta_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.AMERICAN_BEECH_PLANKS,4)
                        .pattern("F")
                        .define('F', FeverBlocks.AMERICAN_BEECH_LOG)
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_LOG), has(FeverBlocks.AMERICAN_BEECH_LOG))
                        .group("wood")
                        .save(output, "american_beech_planks");
                shaped(RecipeCategory.MISC, Items.STICK,4)
                        .pattern("F")
                        .pattern("F")
                        .define('F', FeverBlocks.AMERICAN_BEECH_PLANKS)
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_PLANKS), has(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .group("wood");
                shaped(RecipeCategory.MISC, Blocks.CRAFTING_TABLE)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', FeverBlocks.AMERICAN_BEECH_PLANKS)
                        .unlockedBy(getHasName(Blocks.CRAFTING_TABLE), has(Blocks.CRAFTING_TABLE))
                        .group("wood");

                stairBuilder(FeverBlocks.AMERICAN_BEECH_STAIRS, Ingredient.of(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_PLANKS), has(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .group("wood")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, FeverBlocks.AMERICAN_BEECH_SLAB, FeverBlocks.AMERICAN_BEECH_PLANKS);
                





            }
        };
    }

    @Override
    public String getName() {
        return "CraftinFever Recipes";
    }
}
