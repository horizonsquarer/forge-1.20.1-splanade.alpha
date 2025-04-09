package net.horizonsquarer.splanade.datagen;

import net.horizonsquarer.splanade.Splanade;
import net.horizonsquarer.splanade.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

        handheldItem(ModItems.TENEBRITE_SWORD);
        handheldItem(ModItems.TENEBRITE_PICKAXE);
        handheldItem(ModItems.TENEBRITE_AXE);
        handheldItem(ModItems.TENEBRITE_SHOVEL);
        handheldItem(ModItems.TENEBRITE_HOE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                mcLoc("item/generated")) // from ItemModelProvider
                .texture("layer0", modLoc("item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                mcLoc("item/generated"))
                .texture("layer0", modLoc("block/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                mcLoc("item/handheld")).texture("layer0",
                modLoc ("item/" + item.getId().getPath()));
    }

}
