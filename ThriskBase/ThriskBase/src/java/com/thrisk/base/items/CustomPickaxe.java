package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.CustomItemPickaxe;
import com.thrisk.base.materials.ModMaterials.ToolMaterials;

import net.minecraft.creativetab.CreativeTabs;

public final class CustomPickaxe extends CustomItemPickaxe {

	public CustomPickaxe(ToolMaterials material, String name, String myTexture) {
		super(material);
        this.setUnlocalizedName(name);
        this.setTextureName(Main.MODID + ":" + myTexture);
        this.setCreativeTab(CreativeTabs.tabTools);
	}
}
