package com.ethan.clandestine_meetings_mod.item;

import com.ethan.clandestine_meetings_mod.ClandestineMeetingsMod;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * This class will hold the blocks that I create for this mod as well as any of their properties.
 */
public class CustomItems {
  //This is a list of the items that will be created with this mod. It specifies
  // that any items made with this belong to the Clandestine Meetings Mod
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS,
      ClandestineMeetingsMod.MOD_ID);

  //creates the item that needs to be registered (ruby) and lists the properties of the
  // item (the tab it is displayed in)
  public static final RegistryObject<Item> ruby =
      ITEMS.register("ruby",
      () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> sapphire =
      ITEMS.register("sapphire",
      () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> raw_ruby =
      ITEMS.register("raw_ruby",
      () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));


  public static final RegistryObject<Item> raw_sapphire =
      ITEMS.register("raw_sapphire",
      () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite =
      ITEMS.register("cartherite",
      () -> new Item(new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  //TOOL SET---------------------------------------------------------------------------------------
  //damage is the first variable, speed is the second variable
  public static final RegistryObject<Item> cartherite_sword =
      ITEMS.register("cartherite_sword",
      () -> new SwordItem(CustomTiers.Cartherite, 11, 4f,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_shovel =
      ITEMS.register("cartherite_shovel",
      () -> new ShovelItem(CustomTiers.Cartherite, 8, 4f,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_hoe =
      ITEMS.register("cartherite_hoe",
      () -> new HoeItem(CustomTiers.Cartherite, 8, 4f,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_axe = ITEMS.register("cartherite_axe",
      () -> new AxeItem(CustomTiers.Cartherite, 13, 3f,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_pickaxe =
      ITEMS.register("cartherite_pickaxe",
      () -> new PickaxeItem(CustomTiers.Cartherite, 8, 4f,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  //ARMOR SET-------------------------------------------------------------------------------------
  public static final RegistryObject<Item> cartherite_helmet =
      ITEMS.register("cartherite_helmet",
      () -> new ArmorItem(CustomArmorMaterials.CARTHERITE, EquipmentSlot.HEAD,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_chestplate =
      ITEMS.register("cartherite_chestplate",
      () -> new ArmorItem(CustomArmorMaterials.CARTHERITE, EquipmentSlot.CHEST,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_leggings =
      ITEMS.register("cartherite_leggings",
      () -> new ArmorItem(CustomArmorMaterials.CARTHERITE, EquipmentSlot.LEGS,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  public static final RegistryObject<Item> cartherite_boots =
      ITEMS.register("cartherite_boots",
      () -> new ArmorItem(CustomArmorMaterials.CARTHERITE, EquipmentSlot.FEET,
          new Item.Properties().tab(CustomCreativeModeTab.CLANDESTINE_MEETINGS_TAB)));

  //This registers the item that is being created on with this function call. It basically
  // makes the item (object) known to the game.
  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);

  } //END OF REGISTER FUNCTION
}
