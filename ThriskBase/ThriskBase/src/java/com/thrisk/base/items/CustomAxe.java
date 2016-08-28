package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.CustomItemAxe;
import com.thrisk.base.materials.ModMaterials.ToolMaterials;

import net.minecraft.creativetab.CreativeTabs;

public class CustomAxe extends CustomItemAxe {

	protected CustomAxe(ToolMaterials material, String name, String texture) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" +  texture);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

}
