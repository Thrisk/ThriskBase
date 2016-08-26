package com.thrisk.base.items;

import com.thrisk.base.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CustomArmor extends ItemArmor{
	public String materialT;
	public ArmorMaterial material;
	public String Layer;


	public CustomArmor(ArmorMaterial material, String name, int armorPiece, String textureName) {
		super(material, 0, armorPiece);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.materialT = textureName;
		this.material = material;
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" + name);
		
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return null;
	}
}
