package net.bgdt.craftinfever;

import net.bgdt.craftinfever.datagen.FeverBlockLootTableProvider;
import net.bgdt.craftinfever.datagen.FeverBlockTagsProvider;
import net.bgdt.craftinfever.datagen.FeverModelProvider;
import net.bgdt.craftinfever.datagen.FeverRecipeProvider;
import net.bgdt.craftinfever.world.FeverConfiguredFeatures;
import net.bgdt.craftinfever.world.FeverPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class CraftinFeverDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(FeverModelProvider::new);
        pack.addProvider(FeverBlockTagsProvider::new);
        pack.addProvider(FeverBlockLootTableProvider::new);
        pack.addProvider(FeverFeatures::new);
        pack.addProvider(FeverRecipeProvider::new);

	}

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        DataGeneratorEntrypoint.super.buildRegistry(registryBuilder);

        registryBuilder.add(Registries.CONFIGURED_FEATURE, FeverConfiguredFeatures::configure);
        registryBuilder.add(Registries.PLACED_FEATURE, FeverPlacedFeatures::bootstrap);
    }
}
