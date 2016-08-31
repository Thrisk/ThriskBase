package com.thrisk.base.items;

import com.thrisk.base.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public final class CustomPickaxe extends ItemPickaxe {

	public CustomPickaxe(ToolMaterial material, String name, String myTexture) {
		super(material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + myTexture);
        this.setCreativeTab(CreativeTabs.tabTools);
	}
	@Override
	public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_)
    {
        return(ModItems.kariniumCrystal == p_82789_2_.getItem() ? true : false);
    }
}
