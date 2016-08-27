package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.ModMaterials.ToolMaterials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CustomSword extends Item {
	private final ToolMaterials ToolM;
	public CustomSword(ToolMaterials material, String name, String texture) {
		this.ToolM = material;
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" +  texture);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
//	public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_){
//		if(this == kariniumSword){ 
//			return true;
//		}
//		else{
//			return false;
//		}		
//	}
}


