package net.horizonsquarer.splanade.item.custom;

import net.horizonsquarer.splanade.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CrystallisedTenebriteSolutionItem extends Item {
    public CrystallisedTenebriteSolutionItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            // Remove one from the held stack
            ItemStack heldStack = player.getItemInHand(hand);
            heldStack.shrink(1);

            // Create the return items
            ItemStack glassBottle = new ItemStack(Items.GLASS_BOTTLE);
            ItemStack tenebriteDust = new ItemStack(ModItems.CRYSTALLISED_TENEBRITE_DUST.get());

            // Try to add the glass bottle
            if (!player.getInventory().add(glassBottle)) {
                player.drop(glassBottle, false);
            }

            // Try to add the dust
            if (!player.getInventory().add(tenebriteDust)) {
                player.drop(tenebriteDust, false);
            }
        }

        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide());
    }


    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable("item.splanade.crystallised_tenebrite_solution_potion");
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(
                Component.translatable("item.splanade.crystallised_tenebrite_solution_potion.tooltip")
                        .withStyle(ChatFormatting.GRAY)
        );
    }
}



