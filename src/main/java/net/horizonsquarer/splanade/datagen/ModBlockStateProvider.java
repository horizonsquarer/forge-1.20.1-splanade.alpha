package net.horizonsquarer.splanade.datagen;

import net.horizonsquarer.splanade.Splanade;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.horizonsquarer.splanade.block.ModBlocks;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Splanade.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.TENEBRITE_ORE);
        blockWithItem(ModBlocks.REFINED_TENEBRITE_BLOCK);
        blockWithItem(ModBlocks.MYCOSTATIC_CRUST);
        blockWithItem(ModBlocks.PETRIFIED_MYCOSTRATUM);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
