package com.thrisk.base.materials;

import com.thrisk.base.items.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
	//public static ToolMaterial Karinium = EnumHelper.addToolMaterial("Karinium", 4, 3048, 11.0F, 4.0F, 21);
	public static ArmorMaterial KariniumA = EnumHelper.addArmorMaterial("Karinium", 64, new int[]{4, 8, 6, 4}, 24);
	
	
	public static enum ToolMaterials{
		
		//ToolMaterials
		Karinium(4, 3048, 11.0F, 4.0F, 21);
		
		
        private final int harvestLevel;
        private final int maxUses;
        private final float efficiencyOnProperMaterial;
        private final float damageVsEntity;
        private final int enchantability;
        private ItemStack repairMaterial = null;
        
        private ToolMaterials(int harvestLevel, int maxUses, float efficiencyF, float damageF, int enchantibility){
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiencyOnProperMaterial = efficiencyF;
            this.damageVsEntity = damageF;
            this.enchantability = enchantibility;
        }
        //Getters
        public int getHarvestLevel(){
        	return this.harvestLevel;
        }
        public int getMaxUses(){
            return this.maxUses;
        }
        public float getEfficiencyOnProperMaterial(){
            return this.efficiencyOnProperMaterial;
        }
        public float getDamageVsEntity(){
        	return this.damageVsEntity;
        }
        public int getEnchantability(){
        	return this.enchantability;
        }
        // Anvil Repair Materials
        
        public Item repairMat(){
        	switch (this)
            {
                case Karinium:    return ModItems.kariniumCrystal;
                default:      return ModItems.kariniumCrystal;
            }
        }
        public ItemStack getRepairItemStack()
        {
            if (repairMaterial != null) return repairMaterial;
            Item repM = this.repairMat();
            if (repM == null) return null;
            repairMaterial = new ItemStack(repM, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
            return repairMaterial;
        }
		
	}
}
