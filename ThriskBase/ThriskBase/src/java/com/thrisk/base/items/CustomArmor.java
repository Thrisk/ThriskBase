package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.CustomItemArmor;
import com.thrisk.base.materials.ModMaterials.ArmorMaterials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class CustomArmor extends CustomItemArmor{
	public String materialT;
	public ArmorMaterials material;
	public String Layer;


	public CustomArmor(ArmorMaterials material, String name, int armorPiece, String textureName) {
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
