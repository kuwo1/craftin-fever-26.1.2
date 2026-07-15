package net.bgdt.craftinfever.datagen;

import net.bgdt.craftinfever.block.FeverBlocks;
import net.bgdt.craftinfever.item.FeverItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.references.BlockIds;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.awt.*;
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


                shaped(RecipeCategory.MISC, FeverBlocks.WHITE_QUILT_BLOCK, 4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.WHITE))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.WHITE)), has(Blocks.WOOL.pick(DyeColor.WHITE)))
                        .group("wool")
                        .save(output, "white_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BLACK_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.BLACK))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.BLACK)), has(Blocks.WOOL.pick(DyeColor.BLACK)))
                        .group("wool")
                        .save(output, "black_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIGHT_GRAY_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.LIGHT_GRAY))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.LIGHT_GRAY)), has(Blocks.WOOL.pick(DyeColor.LIGHT_GRAY)))
                        .group("wool")
                        .save(output, "light_gray_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.GRAY_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.GRAY))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.GRAY)), has(Blocks.WOOL.pick(DyeColor.GRAY)))
                        .group("wool")
                        .save(output, "gray_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BLUE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.BLUE))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.BLUE)), has(Blocks.WOOL.pick(DyeColor.BLUE)))
                        .group("wool")
                        .save(output, "blue_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIGHT_BLUE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.LIGHT_BLUE))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.LIGHT_BLUE)), has(Blocks.WOOL.pick(DyeColor.LIGHT_BLUE)))
                        .group("wool")
                        .save(output, "light_blue_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.PURPLE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.PURPLE))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.PURPLE)), has(Blocks.WOOL.pick(DyeColor.PURPLE)))
                        .group("wool")
                        .save(output, "purple_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.PINK_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.PINK))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.PINK)), has(Blocks.WOOL.pick(DyeColor.PINK)))
                        .group("wool")
                        .save(output, "pink_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.BROWN_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.BROWN))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.BROWN)), has(Blocks.WOOL.pick(DyeColor.BROWN)))
                        .group("wool")
                        .save(output, "brown_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.YELLOW_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.YELLOW))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.YELLOW)), has(Blocks.WOOL.pick(DyeColor.YELLOW)))
                        .group("wool")
                        .save(output, "yellow_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.RED_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.RED))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.RED)), has(Blocks.WOOL.pick(DyeColor.RED)))
                        .group("wool")
                        .save(output, "red_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.ORANGE_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.ORANGE))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.ORANGE)), has(Blocks.WOOL.pick(DyeColor.ORANGE)))
                        .group("wool")
                        .save(output, "orange_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.GREEN_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.GREEN))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.GREEN)), has(Blocks.WOOL.pick(DyeColor.GREEN)))
                        .group("wool")
                        .save(output, "green_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.LIME_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.LIME))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.LIME)), has(Blocks.WOOL.pick(DyeColor.LIME)))
                        .group("wool")
                        .save(output, "lime_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.CYAN_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.CYAN))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.CYAN)), has(Blocks.WOOL.pick(DyeColor.CYAN)))
                        .group("wool")
                        .save(output, "cyan_quilt_block");
                shaped(RecipeCategory.MISC, FeverBlocks.MAGENTA_QUILT_BLOCK,4)
                        .pattern(" A ")
                        .pattern("AFA")
                        .pattern(" A ")
                        .define('A', FeverItems.FELT)
                        .define('F', Blocks.WOOL.pick(DyeColor.MAGENTA))
                        .unlockedBy(getHasName(Blocks.WOOL.pick(DyeColor.MAGENTA)), has(Blocks.WOOL.pick(DyeColor.MAGENTA)))
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
                shaped(RecipeCategory.MISC, Blocks.CRAFTING_TABLE,1)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F', FeverBlocks.AMERICAN_BEECH_PLANKS)
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_PLANKS), has(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .group("wood");
                shaped(RecipeCategory.MISC, FeverItems.FELT)
                        .pattern("FFF")
                        .define('F',Items.STRING)
                        .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
                        .group("string");

                stairBuilder(FeverBlocks.AMERICAN_BEECH_STAIRS, Ingredient.of(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_PLANKS), has(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .group("wood")
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, FeverBlocks.AMERICAN_BEECH_SLAB, FeverBlocks.AMERICAN_BEECH_PLANKS);

                doorBuilder(FeverBlocks.AMERICAN_BEECH_DOOR, Ingredient.of(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_PLANKS), has(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .group("wood")
                        .save(output);
                trapdoorBuilder(FeverBlocks.AMERICAN_BEECH_TRAPDOOR, Ingredient.of(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .unlockedBy(getHasName(FeverBlocks.AMERICAN_BEECH_PLANKS), has(FeverBlocks.AMERICAN_BEECH_PLANKS))
                        .group("wood")
                        .save(output);




                

//lalallalalalalala



            }
        };
    }

    @Override
    public String getName() {
        return "CraftinFever Recipes ";
    }
}
