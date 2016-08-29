package com.thrisk.base.blocks;

import com.thrisk.base.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CustomBlock extends Block {

	protected CustomBlock(Material p_i45394_1_, String blockName, String pngFileName, float hardnessF, float resistanceF, float lightLevel, String harvester, int hLevel) {
		super(p_i45394_1_);
		this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + pngFileName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardnessF);	//(4.0F);
        this.setResistance(resistanceF);	//(60.0F);
        this.setLightLevel(lightLevel);	//(0.1F);
        this.setHarvestLevel(harvester, hLevel);	//("pickaxe", 2);
        this.setStepSound(soundTypeStone);
	}
	
	
	
}
