package com.ethan.clandestine_meetings_mod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class CustomTiers {
  //Sets each value of the Cartherite Tier (durability, attack damage, speed, repair ingredient etc.
  public static final ForgeTier Cartherite = new ForgeTier(3, 5000, 7f,
      9f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
      () -> Ingredient.of(CustomItems.cartherite.get()));
}
