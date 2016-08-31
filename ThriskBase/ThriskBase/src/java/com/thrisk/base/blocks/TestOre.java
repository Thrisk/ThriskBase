package com.thrisk.base.blocks;

import java.util.Random;

import com.thrisk.base.Main;
import com.thrisk.base.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class TestOre extends Block {
    private Random rand = new Random();
	private int meta;
	private int least_quantity;
	private int most_quantity;
	protected TestOre(String blockName,Material material,String pngFileName,Float hardnessF,Float resistanceF,Float lightLevel,String harvester, Integer hLevel, int meta, int least, int most) {
		super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Main.MODID + ":" + pngFileName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardnessF);	//(2.0F);
        this.setResistance(resistanceF);	//(6.0F);
        this.setLightLevel(lightLevel);	//(1.0F);
        this.setHarvestLevel(harvester, hLevel);	//("pickaxe", 3);
        this.setStepSound(soundTypeStone);
        this.meta = meta;
        this.least_quantity = least;
        this.most_quantity = most;
	}
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		 return(this == ModBlocks.KariniumOre ? ModItems.kariniumDust : null);
	}

	@Override
	public int damageDropped(int metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
	    return(this == ModBlocks.KariniumOre ? (this.least_quantity <= this.most_quantity ? this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune * 2 - 1) : this.least_quantity) : null);
	}
    @Override
	public int getExpDrop(IBlockAccess p_149690_1_, int meta, int fortune){
    	return(this == ModBlocks.KariniumOre ? MathHelper.getRandomIntegerInRange(rand, 16 * fortune + 1, 24 * fortune) : 0);
    }
}

