package net.horizonsquarer.splanade.item;

import net.horizonsquarer.splanade.Splanade;
import net.horizonsquarer.splanade.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier REFINED_TENEBRITE = TierSortingRegistry.registerTier(
            new ForgeTier(5,1700,6f,5f,35,
                    ModTags.Blocks.NEEDS_TENEBRITE_TOOL, () -> Ingredient.of(ModItems.REFINED_TENEBRITE.get())),
            ResourceLocation.fromNamespaceAndPath(Splanade.MOD_ID, "refined_tenebrite"), List.of(Tiers.NETHERITE), List.of());
}
