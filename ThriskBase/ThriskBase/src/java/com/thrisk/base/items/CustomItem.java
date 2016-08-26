package com.thrisk.base.items;

import com.thrisk.base.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomItem extends Item {

	public CustomItem( String itemName, String myTexture){
	    this.setUnlocalizedName(itemName);
	    this.setCreativeTab(CreativeTabs.tabMisc);
		this.setTextureName(Main.MODID + ":" + myTexture);
	}
}
