package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.CustomItemSpade;
import com.thrisk.base.materials.ModMaterials.ToolMaterials;

import net.minecraft.creativetab.CreativeTabs;

public class CustomSpade extends CustomItemSpade {

	public CustomSpade(ToolMaterials material, String name, String texture) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" +  texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
