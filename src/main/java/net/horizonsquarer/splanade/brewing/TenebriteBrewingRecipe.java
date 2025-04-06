package net.horizonsquarer.splanade.brewing;

import net.horizonsquarer.splanade.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.IBrewingRecipe;


public class TenebriteBrewingRecipe implements IBrewingRecipe {

    @Override
    public boolean isInput(ItemStack input) {
        // Check if the input is an Awkward Potion.
        return input.getItem() == Items.POTION && PotionUtils.getPotion(input) == Potions.AWKWARD;
    }

    @Override
    public boolean isIngredient(ItemStack ingredient) {
        // Check if the ingredient is your custom tenebrite dust.
        return ingredient.getItem() == ModItems.TENEBRITE_DUST.get();
    }

    @Override
    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        if (!isInput(input) || !isIngredient(ingredient)) {
            return ItemStack.EMPTY;
        }

        return new ItemStack(ModItems.TENEBRITE_SOLUTION_POTION.get());
    }
}