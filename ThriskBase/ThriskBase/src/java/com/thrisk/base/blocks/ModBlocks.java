package com.thrisk.base.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks{
	public static Block KariniumOre;
	
	public static final void init(){
		GameRegistry.registerBlock(KariniumOre = new TestOre("Karinium Ore", Material.rock, "KariniumOre", 8.0F, 1800.0F, 0.1F, "pickaxe", 2, 0, 1, 3), "Karinium Ore");
	}
}
