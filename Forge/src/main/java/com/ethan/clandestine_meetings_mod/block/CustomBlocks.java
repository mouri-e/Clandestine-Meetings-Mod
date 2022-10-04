package com.ethan.clandestine_meetings_mod.block;

import com.ethan.clandestine_meetings_mod.ClandestineMeetingsMod;
import com.ethan.clandestine_meetings_mod.item.CustomCreativeModeTab;
import com.ethan.clandestine_meetings_mod.item.CustomItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * This class will hold the blocks that I create for this mod as well as any of their properties.
 */
public class CustomBlocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
      ForgeRegistries.BLOCKS, ClandestineMeetingsMod.MOD_ID);

  //Blocks---------------------------------------------------------------------------------
  public static final RegistryObject<Block> ruby_block = registerBlock("ruby_block",
      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
      CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB);

  public static final RegistryObject<Block> sapphire_block = registerBlock("sapphire_block",
      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
      CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB);


  //Ores----------------------------------------------------------------------------------
  public static final RegistryObject<Block> ruby_ore = registerBlock("ruby_ore",
      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
      CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB);

  public static final RegistryObject<Block> sapphire_ore = registerBlock("sapphire_ore",
      () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),
      CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB);





  private static <T extends Block> RegistryObject<T> registerBlock(
      String name, Supplier<T> block, CreativeModeTab tab) {

    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name,toReturn, tab);
    return toReturn;

  }

  //this registers the item that connects to a block
  // (ex Iron_Ore being a block and item at the same time)
  private static <T extends Block> RegistryObject<Item> registerBlockItem(
      String name, RegistryObject<T> block, CreativeModeTab tab) {

    return CustomItems.ITEMS.register(name,
        () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
  }

  public static void register (IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
