package com.thrisk.base;

import com.thrisk.base.blocks.ModBlocks;
import com.thrisk.base.items.ModItems;
import com.thrisk.base.recipes.ModRecipes;
import com.thrisk.base.world.ModWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
    public void preInit(FMLPreInitializationEvent e) {   
    	ModItems.init();
    	ModBlocks.init();
    	ModRecipes.init();

    }

    public void init(FMLInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
