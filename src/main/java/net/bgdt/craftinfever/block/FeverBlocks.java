package net.bgdt.craftinfever.block;

import net.bgdt.craftinfever.CraftinFever;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class FeverBlocks {

    public static final Block WHITE_QUILT_BLOCK = registerBlock("white_quilt_block",
            properties -> new Block(properties.strength(0.8f)
                    .sound(SoundType.WOOL)));
    public static final Block LIGHT_GRAY_QUILT_BLOCK = registerBlock("light_gray_quilt_block",
            properties -> new Block(properties.strength(0.8f)
                    .sound(SoundType.WOOL)));
    public static final Block GRAY_QUILT_BLOCK = registerBlock("gray_quilt_block",
            properties -> new Block(properties.strength(0.8f)
                    .sound(SoundType.WOOL)));
    public static final Block BLACK_QUILT_BLOCK = registerBlock("black_quilt_block",
            properties -> new Block(properties.strength(0.8f)
                    .sound(SoundType.WOOL)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name)))));
    }


    public static void registerFeverBlocks() {
        CraftinFever.LOGGER.info("Registering Fever Blocks for" + CraftinFever.MOD_ID);
    }
}
