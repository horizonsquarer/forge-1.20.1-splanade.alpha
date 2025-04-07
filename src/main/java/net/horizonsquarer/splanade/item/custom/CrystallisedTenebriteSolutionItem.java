package net.horizonsquarer.splanade.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CrystallisedTenebriteSolutionItem extends PotionItem {
    public CrystallisedTenebriteSolutionItem(Properties properties) {
        super(properties);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide) {
            entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 4)); // Poison V for 5 seconds
        }
        return super.finishUsingItem(stack, level, entity);
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable("item.splanade.crystallised_tenebrite_solution_potion");
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(
                Component.translatable("item.splanade.crystallised_tenebrite_solution_potion.tooltip")
                        .withStyle(ChatFormatting.RED)
        );
    }
}


