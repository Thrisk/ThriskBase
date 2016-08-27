package com.thrisk.base.items;

import com.thrisk.base.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public final class CustomPickaxe extends ItemPickaxe {

	public CustomPickaxe(ToolMaterial material, String name, String myTexture) {
		super(material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + myTexture);
        this.setCreativeTab(CreativeTabs.tabTools);
	}
}
