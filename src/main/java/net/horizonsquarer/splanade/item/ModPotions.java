package net.horizonsquarer.splanade.item;

import net.horizonsquarer.splanade.Splanade;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, Splanade.MOD_ID);

    // This potion inflicts Poison for 600 ticks (30 seconds) at amplifier 0.
    public static final RegistryObject<Potion> TENEBRITE_SOLUTION = POTIONS.register("tenebrite_solution",
            () -> new Potion(new MobEffectInstance(MobEffects.POISON, 100, 4)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
