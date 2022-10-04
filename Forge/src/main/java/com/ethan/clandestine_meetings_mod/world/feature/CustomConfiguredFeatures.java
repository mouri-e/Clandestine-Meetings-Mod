package com.ethan.clandestine_meetings_mod.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import com.ethan.clandestine_meetings_mod.ClandestineMeetingsMod;
import com.ethan.clandestine_meetings_mod.block.CustomBlocks;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class CustomConfiguredFeatures {

  public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
      DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ClandestineMeetingsMod.MOD_ID);

  public static void register(IEventBus modEventBus) {
    CONFIGURED_FEATURES.register(modEventBus);
  }

  //RUBY------------------------------------------------------------------------------------------
  //controls where the ore can spawn and what it will replace when the world is being generated
  public static final Supplier<List<OreConfiguration.TargetBlockState>> overworld_ruby_ore =
      Suppliers.memoize(() -> List.of(OreConfiguration.target(
          OreFeatures.STONE_ORE_REPLACEABLES, CustomBlocks.ruby_ore.get().defaultBlockState()),
          OreConfiguration.target(
              OreFeatures.DEEPSLATE_ORE_REPLACEABLES, CustomBlocks.ruby_ore.get().defaultBlockState())
          ));

  //controls the aspects of the ore such as how many of the ore spawn together
  public static final RegistryObject<ConfiguredFeature<?, ?>> ruby_ores = CONFIGURED_FEATURES
      .register("ruby_ores", () -> new ConfiguredFeature<>(Feature.ORE,
          new OreConfiguration(overworld_ruby_ore.get(), 3)));


  //Sapphire-----------------------------------------------------------------------------------
  //controls where the ore can spawn and what it will replace when the world is being generated
  public static final Supplier<List<OreConfiguration.TargetBlockState>> overworld_sapphire_replacement =
      Suppliers.memoize(() -> List.of(OreConfiguration.target(
          OreFeatures.STONE_ORE_REPLACEABLES, CustomBlocks.sapphire_ore.get().defaultBlockState()),
          OreConfiguration.target(
              OreFeatures.DEEPSLATE_ORE_REPLACEABLES, CustomBlocks.sapphire_ore.get().defaultBlockState())));

  //controls the aspects of the ore such as how many of the ore spawn together
  public static final RegistryObject<ConfiguredFeature<?, ?>> sapphire_ores = CONFIGURED_FEATURES
      .register("sapphire_ores", () -> new ConfiguredFeature<>(Feature.ORE,
          new OreConfiguration(overworld_sapphire_replacement.get(), 4)));
}
