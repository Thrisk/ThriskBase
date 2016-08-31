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
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.kariniumBoots) ||
				player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.kariniumLeggings) ||
				player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.kariniumBrestplate) ||
				player.getCurrentArmor(3) != null &&player.getCurrentArmor(3).getItem().equals(ModItems.kariniumHelm)){
			
			boolean ArmorInv1 = (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.kariniumBoots) ||
					player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.kariniumLeggings) ||
					player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.kariniumBrestplate) ||
					player.getCurrentArmor(3) != null &&player.getCurrentArmor(3).getItem().equals(ModItems.kariniumHelm));
			boolean ArmorInv2 = (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.kariniumBoots) &&
					player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.kariniumLeggings) &&
					player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.kariniumBrestplate) &&
					player.getCurrentArmor(3) != null &&player.getCurrentArmor(3).getItem().equals(ModItems.kariniumHelm));
			if(ArmorInv1 == true && ArmorInv2 == false){
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 40));
			}
			else if(player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.kariniumBoots) &&
					player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.kariniumLeggings) &&
					player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.kariniumBrestplate) &&
					player.getCurrentArmor(3) != null &&player.getCurrentArmor(3).getItem().equals(ModItems.kariniumHelm)){
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
					if(player.experienceLevel <= 30){
						player.addExperience(3);
						player.getCurrentArmor(0).damageItem(1, player);
						player.getCurrentArmor(1).damageItem(1, player);
						player.getCurrentArmor(2).damageItem(1, player);
						player.getCurrentArmor(3).damageItem(1, player);
					}
					if(player.getHealth() < 3){
						player.heal(10);
						player.getCurrentArmor(0).damageItem(50, player);
						player.getCurrentArmor(1).damageItem(50, player);
						player.getCurrentArmor(2).damageItem(50, player);
						player.getCurrentArmor(3).damageItem(50, player);
						
					}
				}
			}
		}
	@Override
	public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_)
    {
        return(ModItems.kariniumCrystal == p_82789_2_.getItem() ? true : false);
    }
	
}
