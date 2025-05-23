package net.horizonsquarer.splanade.block;

import com.sun.jna.platform.unix.solaris.Kstat2StatusException;
import net.horizonsquarer.splanade.Splanade;
import net.horizonsquarer.splanade.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Splanade.MOD_ID);

    public static final RegistryObject<Block> REFINED_TENEBRITE_BLOCK = registerFireproofBlock("refined_tenebrite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(5.0F, 8.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TENEBRITE_ORE = registerBlock("tenebrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops(), UniformInt.of(8,12)));

    public static final RegistryObject<Block> MYCOSTATIC_CRUST = registerBlock("mycostatic_crust",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PETRIFIED_MYCOSTRATUM = registerBlock("petrified_mycostratum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> LUMEN_SPORE = registerBlock("lumen_spore",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER).noOcclusion().noCollission().lightLevel(state -> 5)));
    public static final RegistryObject<Block> POTTED_LUMEN_SPORE = BLOCKS.register("potted_lumen_spore",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.LUMEN_SPORE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_TORCHFLOWER).noOcclusion().lightLevel(state -> 5)));




    //REGISTERING
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> RegistryObject<T> registerFireproofBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFireproofBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerFireproofBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
