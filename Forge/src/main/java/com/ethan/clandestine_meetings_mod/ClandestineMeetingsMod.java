package com.ethan.clandestine_meetings_mod;

import com.ethan.clandestine_meetings_mod.block.CustomBlocks;
import com.ethan.clandestine_meetings_mod.item.CustomItems;
import com.ethan.clandestine_meetings_mod.world.feature.CustomConfiguredFeatures;
import com.ethan.clandestine_meetings_mod.world.feature.CustomPlacedFeatures;
import com.mojang.logging.LogUtils;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ClandestineMeetingsMod.MOD_ID)
public class ClandestineMeetingsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "clandestine_meetings_mod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    //Constructor
    public ClandestineMeetingsMod() {
        //Items
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CustomItems.register(modEventBus);
        //Blocks
        CustomBlocks.register(modEventBus);
        //Ore Generation
        CustomConfiguredFeatures.register(modEventBus);
        CustomPlacedFeatures.register(modEventBus);


        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }




}
