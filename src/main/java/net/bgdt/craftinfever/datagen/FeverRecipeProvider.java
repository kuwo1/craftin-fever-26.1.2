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




            }
        };
    }

    @Override
    public String getName() {
        return "CraftinFever Recipes";
    }
}
