package net.horizonsquarer.splanade.item;

import com.google.common.util.concurrent.ClosingFuture;
import net.horizonsquarer.splanade.Splanade;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Splanade.MOD_ID);

    //TENEBRITE STUFF HERE
    public static final RegistryObject<Item> TENEBRITE_DUST = ITEMS.register("tenebrite_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTALLISED_TENEBRITE_DUST = ITEMS.register("crystallised_tenebrite_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TENEBRITE = ITEMS.register("tenebrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REFINED_TENEBRITE = ITEMS.register("refined_tenebrite",
            () -> new Item(new Item.Properties().fireResistant()));

        //ARMOR
    public static final RegistryObject<Item> TENEBRITE_CHESTPLATE = ITEMS.register("tenebrite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_LEGGINGS = ITEMS.register("tenebrite_leggings",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_HELMET = ITEMS.register("tenebrite_helmet",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_BOOTS = ITEMS.register("tenebrite_boots",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
