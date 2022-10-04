package com.ethan.clandestine_meetings_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeModeTab {
  //creates a custom tab in the creative mode menu that will hold all of the items in this mod
  public static final CreativeModeTab CLANDESTINE_MEETINGS_TAB = new CreativeModeTab(
      "ClandestineMeetingsModCustomTab") {
    //sets the image that is on the custom tab
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(CustomItems.cartherite.get());
    }
  };
}
