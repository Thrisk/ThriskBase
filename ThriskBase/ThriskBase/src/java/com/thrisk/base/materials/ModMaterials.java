package com.thrisk.base.materials;

import com.thrisk.base.items.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModMaterials {
	//public static ToolMaterial Karinium = EnumHelper.addToolMaterial("Karinium", 4, 3048, 11.0F, 4.0F, 21);
	//public static ArmorMaterial KariniumA = EnumHelper.addArmorMaterial("Karinium", 64, new int[]{4, 8, 6, 4}, 24);
	
	
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
	//Tool Materials End
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	
	public static enum ArmorMaterials{
	// Armor Materials
		KariniumA(64, new int[]{4, 8, 6, 4}, 24);
		
		
        private int maxDamageFactor;
        private int[] damageReductionAmountArray;
        private int enchantability;
        public Item customCraftingMaterial = null;
        
        private ArmorMaterials(int p_i1827_3_, int[] p_i1827_4_, int p_i1827_5_){
            this.maxDamageFactor = p_i1827_3_;
            this.damageReductionAmountArray = p_i1827_4_;
            this.enchantability = p_i1827_5_;
        }
        //Getters
        
        public int getDurability(int p_78046_1_){
            return ModMaterials.maxDamageArray[p_78046_1_] * this.maxDamageFactor;
        }
        public int getDamageReductionAmount(int p_78044_1_){
            return this.damageReductionAmountArray[p_78044_1_];
        }
        public int getEnchantability(){
            return this.enchantability;
        }
        // Anvil Repair
        
        public Item func_151685_b(){
            return this == KariniumA ? ModItems.kariniumCrystal :
                 customCraftingMaterial;
        }
    }
}
