package net.horizonsquarer.splanade.item;

import net.horizonsquarer.splanade.Splanade;
import net.horizonsquarer.splanade.item.custom.TenebriteSolutionItem;
import net.horizonsquarer.splanade.item.custom.CrystallisedTenebriteSolutionItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> TENEBRITE_SOLUTION_POTION = ITEMS.register("tenebrite_solution_potion",
            () -> new TenebriteSolutionItem(new Item.Properties()
                    .stacksTo(16)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .food(Foods.HONEY_BOTTLE)));
    public static final RegistryObject<Item> CRYSTALLISED_TENEBRITE_SOLUTION_POTION = ITEMS.register("crystallised_tenebrite_solution_potion",
            () -> new CrystallisedTenebriteSolutionItem(new Item.Properties()
                    .stacksTo(16)
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .food(Foods.HONEY_BOTTLE)));

        //ARMOR
    public static final RegistryObject<Item> TENEBRITE_CHESTPLATE = ITEMS.register("tenebrite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_LEGGINGS = ITEMS.register("tenebrite_leggings",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_HELMET = ITEMS.register("tenebrite_helmet",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_BOOTS = ITEMS.register("tenebrite_boots",
            () -> new ArmorItem(ModArmorMaterials.REFINED_TENEBRITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    //TOOLS
    public static final RegistryObject<Item> TENEBRITE_SWORD = ITEMS.register("tenebrite_sword",
            () -> new SwordItem(ModToolTiers.REFINED_TENEBRITE, 4,0, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_PICKAXE = ITEMS.register("tenebrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REFINED_TENEBRITE, 1,0, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_AXE = ITEMS.register("tenebrite_axe",
            () -> new AxeItem(ModToolTiers.REFINED_TENEBRITE, 5,0, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_SHOVEL = ITEMS.register("tenebrite_shovel",
            () -> new ShovelItem(ModToolTiers.REFINED_TENEBRITE, 2,2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> TENEBRITE_HOE = ITEMS.register("tenebrite_hoe",
            () -> new HoeItem(ModToolTiers.REFINED_TENEBRITE, 0,0, new Item.Properties().fireResistant()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
