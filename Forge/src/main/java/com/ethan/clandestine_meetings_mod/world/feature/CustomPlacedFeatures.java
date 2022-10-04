package com.ethan.clandestine_meetings_mod.world.feature;

import com.ethan.clandestine_meetings_mod.ClandestineMeetingsMod;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class CustomPlacedFeatures {
  public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
      DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ClandestineMeetingsMod.MOD_ID);

  public static void register(IEventBus modEventBus) {
    PLACED_FEATURES.register(modEventBus);
  }

  //-------------------------------------------------------------------------------------------
  //Specifies that this ore can spawn in any biome in the world
  public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_,
                                                     PlacementModifier p_195348_) {
    return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
  }

  //specifies that this is a common ore like coal, not rare like netherite. This follows
  // minecraft's native implementation of ores, but is tweaked to work with these mods ores.
  public static List<PlacementModifier> commonOrePlacement(int p_195344_,
                                                           PlacementModifier p_195345_) {
    return orePlacement(CountPlacement.of(p_195344_), p_195345_);
  }

  //------------------------------------------------------------------------------------
  //Specifies where the ore will be spawning in the world and how many ores are spawned in a chunk
  public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED =
      PLACED_FEATURES.register("ruby_ore_placed",
      () -> new PlacedFeature(CustomConfiguredFeatures.ruby_ores.getHolder().get(),
          commonOrePlacement(5, //veins per chunk
              HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                  VerticalAnchor.aboveBottom(150)))));

  //Specifies where the ore will be spawning in the world and how many ores are spawned in a chunk
  public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_PLACED =
      PLACED_FEATURES.register("sapphire_ore_placed",
      () -> new PlacedFeature(CustomConfiguredFeatures.sapphire_ores.getHolder().get(),
          commonOrePlacement(7, //veins per chunk
              HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                  VerticalAnchor.aboveBottom(150)))));

}
