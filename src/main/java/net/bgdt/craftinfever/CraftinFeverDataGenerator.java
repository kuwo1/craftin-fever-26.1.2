package net.bgdt.craftinfever;

import net.bgdt.craftinfever.datagen.FeverBlockTagsProvider;
import net.bgdt.craftinfever.datagen.FeverModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CraftinFeverDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(FeverModelProvider::new);
        pack.addProvider(FeverBlockTagsProvider::new);

	}
}
