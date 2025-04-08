package net.horizonsquarer.splanade.datagen;

import net.horizonsquarer.splanade.Splanade;
import net.horizonsquarer.splanade.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Splanade.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.TENEBRITE);
        simpleItem(ModItems.REFINED_TENEBRITE);
        simpleItem(ModItems.TENEBRITE_DUST);
        simpleItem(ModItems.TENEBRITE_SOLUTION_POTION);
        simpleItem(ModItems.CRYSTALLISED_TENEBRITE_DUST);
        simpleItem(ModItems.CRYSTALLISED_TENEBRITE_SOLUTION_POTION);

        simpleItem(ModItems.TENEBRITE_BOOTS);
        simpleItem(ModItems.TENEBRITE_LEGGINGS);
        simpleItem(ModItems.TENEBRITE_CHESTPLATE);
        simpleItem(ModItems.TENEBRITE_HELMET);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                mcLoc("item/generated")) // from ItemModelProvider
                .texture("layer0", modLoc("item/" + item.getId().getPath()));
    }
}
