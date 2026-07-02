package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.bgdt.craftinfever.item.FeverItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
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
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.WHITE_WOOL)
                        .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                        .group("wool")
                        .save(output, "white_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BLACK_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.BLACK_WOOL)
                        .unlockedBy(getHasName(Blocks.BLACK_WOOL), has(Blocks.BLACK_WOOL))
                        .group("wool")
                        .save(output, "black_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIGHT_GRAY_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.LIGHT_GRAY_WOOL)
                        .unlockedBy(getHasName(Blocks.LIGHT_GRAY_WOOL), has(Blocks.LIGHT_GRAY_WOOL))
                        .group("wool")
                        .save(output, "light_gray_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.GRAY_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.GRAY_WOOL)
                        .unlockedBy(getHasName(Blocks.GRAY_WOOL), has(Blocks.GRAY_WOOL))
                        .group("wool")
                        .save(output, "gray_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BLUE_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.BLUE_WOOL)
                        .unlockedBy(getHasName(Blocks.BLUE_WOOL), has(Blocks.BLUE_WOOL))
                        .group("wool")
                        .save(output, "blue_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIGHT_BLUE_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.LIGHT_BLUE_WOOL)
                        .unlockedBy(getHasName(Blocks.LIGHT_BLUE_WOOL), has(Blocks.LIGHT_BLUE_WOOL))
                        .group("wool")
                        .save(output, "light_blue_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.PURPLE_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.PURPLE_WOOL)
                        .unlockedBy(getHasName(Blocks.PURPLE_WOOL), has(Blocks.PURPLE_WOOL))
                        .group("wool")
                        .save(output, "purple_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.PINK_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.PINK_WOOL)
                        .unlockedBy(getHasName(Blocks.PINK_WOOL), has(Blocks.PINK_WOOL))
                        .group("wool")
                        .save(output, "pink_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BROWN_QUILT_BLOCK,4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', Blocks.BROWN_WOOL)
                        .unlockedBy(getHasName(Blocks.BROWN_WOOL), has(Blocks.BROWN_WOOL))
                        .group("wool")
                        .save(output, "brown_quilt_block");




            }
        };
    }

    @Override
    public String getName() {
        return "CraftinFever Recipes";
    }
}
