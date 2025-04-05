package net.horizonsquarer.splanade.item;

import net.horizonsquarer.splanade.Splanade;
import net.horizonsquarer.splanade.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Splanade.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPLANADE_TAB = CREATIVE_MODE_TABS.register("splanade_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REFINED_TENEBRITE.get()))
                    .title(Component.translatable("creativetab.splanade_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //ITEMS IN HERE IN ORDER
                            //TENEBRITE STUFF
                        pOutput.accept(ModItems.TENEBRITE_DUST.get());
                        pOutput.accept(ModItems.CRYSTALLISED_TENEBRITE_DUST.get());
                        pOutput.accept(ModItems.TENEBRITE.get());
                        pOutput.accept(ModItems.REFINED_TENEBRITE.get());


                        pOutput.accept(ModBlocks.REFINED_TENEBRITE_BLOCK.get());
                        pOutput.accept(ModBlocks.TENEBRITE_ORE.get());

                                //ARMOR
                        pOutput.accept(ModItems.TENEBRITE_HELMET.get());
                        pOutput.accept(ModItems.TENEBRITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.TENEBRITE_LEGGINGS.get());
                        pOutput.accept(ModItems.TENEBRITE_BOOTS.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
