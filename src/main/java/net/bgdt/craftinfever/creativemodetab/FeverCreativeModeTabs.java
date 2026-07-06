package net.bgdt.craftinfever.creativemodetab;

import net.bgdt.craftinfever.CraftinFever;
import net.bgdt.craftinfever.block.FeverBlocks;
import net.bgdt.craftinfever.item.FeverItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FeverCreativeModeTabs {

    public static final CreativeModeTab STRAWBERRY_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, "strawberry_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(FeverItems.STRAWBERRY))
                    .title(Component.translatable("creativemodetab.craftinfever.strawberry_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(FeverItems.STRAWBERRY);
                        output.accept(FeverItems.OMELETTE);
                        output.accept(FeverItems.FELT);
                        output.accept(FeverItems.GRAPES);
                        output.accept(FeverItems.POPCORN);
                    })
                    .build());

    public static final CreativeModeTab STRAWBERRY_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, "strawberry_blocks"),
                FabricCreativeModeTab.builder().icon(() -> new ItemStack(FeverBlocks.WHITE_QUILT_BLOCK))
                        .title(Component.translatable("creativemodetab.craftinfever.strawberry_blocks"))
                        .displayItems((parameters, output) -> {

                            output.accept(FeverBlocks.WHITE_QUILT_BLOCK);
                            output.accept(FeverBlocks.LIGHT_GRAY_QUILT_BLOCK);
                            output.accept(FeverBlocks.GRAY_QUILT_BLOCK);
                            output.accept(FeverBlocks.BLACK_QUILT_BLOCK);
                            output.accept(FeverBlocks.LIGHT_BLUE_QUILT_BLOCK);
                            output.accept(FeverBlocks.BLUE_QUILT_BLOCK);
                            output.accept(FeverBlocks.PURPLE_QUILT_BLOCK);
                            output.accept(FeverBlocks.PINK_QUILT_BLOCK);
                            output.accept(FeverBlocks.BROWN_QUILT_BLOCK);
                            output.accept(FeverBlocks.YELLOW_QUILT_BLOCK);
                            output.accept(FeverBlocks.RED_QUILT_BLOCK);
                            output.accept(FeverBlocks.ORANGE_QUILT_BLOCK);
                            output.accept(FeverBlocks.GREEN_QUILT_BLOCK);
                            output.accept(FeverBlocks.LIME_QUILT_BLOCK);
                            output.accept(FeverBlocks.CYAN_QUILT_BLOCK);
                            output.accept(FeverBlocks.MAGENTA_QUILT_BLOCK);
                            output.accept(FeverBlocks.AMERICAN_BEECH_LOG);
                            output.accept(FeverBlocks.AMERICAN_BEECH_LEAVES);
                            output.accept(FeverBlocks.AMERICAN_BEECH_PLANKS);

                            output.accept(FeverBlocks.AMERICAN_BEECH_SLAB);
                            output.accept(FeverBlocks.AMERICAN_BEECH_STAIRS);
                        })
                        .build());


    public static void registerFeverCreativeModeTabs() {
        CraftinFever.LOGGER.info("Registering Creative Mode Tabs for" + CraftinFever.MOD_ID);
    }
}
