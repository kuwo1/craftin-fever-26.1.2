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
                    })
                    .build());

    public static final CreativeModeTab STRAWBERRY_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, "strawberry_blocks"),
                FabricCreativeModeTab.builder().icon(() -> new ItemStack(FeverBlocks.WHITE_QUILT_BLOCK))
                        .title(Component.translatable("creativemodetab.craftinfever.strawberry_blocks"))
                        .displayItems((parameters, output) -> {

                            output.accept(FeverBlocks.WHITE_QUILT_BLOCK);
                        })
                        .build());


    public static void registerFeverCreativeModeTabs() {
        CraftinFever.LOGGER.info("Registering Creative Mode Tabs for" + CraftinFever.MOD_ID);
    }
}
