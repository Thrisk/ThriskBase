package com.thrisk.base.items;

import com.thrisk.base.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public final class CustomSword extends ItemSword {

	public CustomSword(ToolMaterial material, String name, String texture) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" +  texture);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}
