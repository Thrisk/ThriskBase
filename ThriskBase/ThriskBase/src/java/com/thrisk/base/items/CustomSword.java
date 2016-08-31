package com.thrisk.base.items;

import com.thrisk.base.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public final class CustomSword extends ItemSword {

	public CustomSword(ToolMaterial material, String name, String texture) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" +  texture);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	@Override
	public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_)
    {
        return(ModItems.kariniumCrystal == p_82789_2_.getItem() ? true : false);
    }
}


