package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.CustomItemSword;
import com.thrisk.base.materials.ModMaterials.ToolMaterials;

import net.minecraft.creativetab.CreativeTabs;

public final class CustomSword extends CustomItemSword {

	public CustomSword(ToolMaterials material, String name, String texture) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" +  texture);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

}


