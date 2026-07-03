package net.bgdt.craftinfever.item;

import net.bgdt.craftinfever.CraftinFever;
import net.bgdt.craftinfever.food.FeverFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class FeverItems {
    public static final Item STRAWBERRY = registerItem("strawberry", properties -> new Item(properties
            .food(FeverFoods.STRAWBERRY, FeverFoods.STRAWBERRY_CONSUMABLE)));
    public static final Item OMELETTE = registerItem("omelette", Item::new);
    public static final Item FELT = registerItem("felt", Item::new);
    public static final Item GRAPES = registerItem("grapes", Item::new);




    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CraftinFever.MOD_ID, name)))));
    }


    public static void registerFeverItems() {
        CraftinFever.LOGGER.info("Registering Items for"+ CraftinFever.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(fabricCreativeModeTabOutput -> {
            fabricCreativeModeTabOutput.accept(STRAWBERRY);
            fabricCreativeModeTabOutput.accept(OMELETTE);
            fabricCreativeModeTabOutput.accept(FELT);
            fabricCreativeModeTabOutput.accept(GRAPES);
        });


    }
}
