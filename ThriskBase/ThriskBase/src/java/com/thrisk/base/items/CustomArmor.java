package com.thrisk.base.items;

import com.thrisk.base.Main;
import com.thrisk.base.materials.ModMaterials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CustomArmor extends ItemArmor{
	public String materialT;
	public ArmorMaterial material;
	public String Layer;


	public CustomArmor(ArmorMaterial kariniumA, String name, int armorPiece, String textureName) {
		super(kariniumA, 0, armorPiece);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.materialT = textureName;
		this.material = kariniumA;
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":" + name);
		
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return(this.material == ModMaterials.KariniumA ? Main.MODID + ":textures/items/" + "KariniumLayer" + (this.armorType == 2 ? "2" : "1") + ".png" : null);
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.kariniumBoots))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
    }
}
