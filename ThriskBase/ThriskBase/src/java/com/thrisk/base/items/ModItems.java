package com.thrisk.base.items;



import com.thrisk.base.materials.ModMaterials;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item kariniumDust;
	public static Item kariniumCrystal;
	public static Item kariniumSpade;
	public static Item kariniumAxe;
	public static Item kariniumPickaxe;
	public static Item kariniumSword;
	public static Item kariniumHelm;
	public static Item kariniumBrestplate;
	public static Item kariniumLeggings;
	public static Item kariniumBoots;

	public static final void init() {
		GameRegistry.registerItem(kariniumDust = new CustomItemMaterial("Karinium Dust", "KariniumDust"), "Karinium Dust");
		GameRegistry.registerItem(kariniumCrystal = new CustomItemMaterial("Karinium Crystal", "KariniumCrystal"), "Karinium Crystal");
		//Tools
		GameRegistry.registerItem(kariniumSpade = new CustomSpade(ModMaterials.Karinium,"Karinium Shovel", "kariniumShovel"), "Karinium Shovel");
		GameRegistry.registerItem(kariniumAxe = new CustomAxe(ModMaterials.Karinium,"Karinium Axe","kariniumAxe"), "Karinium Axe");
		GameRegistry.registerItem(kariniumPickaxe = new CustomPickaxe(ModMaterials.Karinium, "Karinium Pickaxe", "KariniumPickaxe"), "Karinium Pickaxe");
		//Weapon
		GameRegistry.registerItem(kariniumSword = new CustomSword(ModMaterials.Karinium, "Karinium Sword", "kariniumSword"),"Karinium Sword" );
		//Armor
		GameRegistry.registerItem(kariniumHelm = new CustomArmor(ModMaterials.KariniumA, "KariniumHelm", 0, "KariniumHelm"), "KariniumHelm");
		GameRegistry.registerItem(kariniumBrestplate = new CustomArmor(ModMaterials.KariniumA, "KariniumBrestplate", 1, "KariniumBrestplate"), "Karinium Brestplate");
		GameRegistry.registerItem(kariniumLeggings = new CustomArmor(ModMaterials.KariniumA, "KariniumLeggings", 2, "KariniumLeggings"), "Karinium Leggings");
		GameRegistry.registerItem(kariniumBoots = new CustomArmor(ModMaterials.KariniumA, "KariniumBoots", 3, "KariniumBoots"), "Karinium Boots");
	}
	
		    /////////////////////////////////////////////////////////////////////////////////////
		   //																				  //		
		  // ///////////  ///////////  ///////////  //////////// //  //    //  /////////     //
		 //      //      //        	  //				//		//  //  ////  //		    //
		//      //      /////		 ///////////	   //	   //  // // //  //   //////   //
	   //      //      //					 //		  //	  //  ////  //  //       //	  //
	  //      //      ///////////  ///////////		 //  	 //  //    //  ///////////	 //	
	 //																			 	    //
	/////////////////////////////////////////////////////////////////////////////////////
	// Sub-Class Support
	private String unlocalizedName;
	private CreativeTabs creativeTab;
	protected String iconString;
	
	// ModItems Setters
	public ModItems setUnlocalizedName(String uName){
        this.unlocalizedName = uName;
        return this;
	}
	public ModItems setTextureName(String tName)
    {
        this.iconString = tName;
        return this;
    }
	public ModItems setCreativeTab(CreativeTabs cTab){
		this.creativeTab = cTab;
		return this;	
	}
	
	// ModItems Getters
	public String getUnlocalizedName(){
        return "item." + this.unlocalizedName;
    }
	@SideOnly(Side.CLIENT)
    public CreativeTabs getCreativeTab(){
        return this.creativeTab;
    }
	
//	public static enum ToolMaterials{
//		
//		//ToolMaterials - Moved To ModMaterials.ToolMaterials
//		Karinium(4, 3048, 11.0F, 4.0F, 21);
//		
//		
//        private final int harvestLevel;
//        private final int maxUses;
//        private final float efficiencyOnProperMaterial;
//        private final float damageVsEntity;
//        private final int enchantability;
//        private ItemStack repairMaterial = null;
//        
//        private ToolMaterials(int harvestLevel, int maxUses, float efficiencyF, float damageF, int enchantibility){
//            this.harvestLevel = harvestLevel;
//            this.maxUses = maxUses;
//            this.efficiencyOnProperMaterial = efficiencyF;
//            this.damageVsEntity = damageF;
//            this.enchantability = enchantibility;
//        }
//        //Getters
//        public int getHarvestLevel(){
//        	return this.harvestLevel;
//        }
//        public int getMaxUses(){
//            return this.maxUses;
//        }
//        public float getEfficiencyOnProperMaterial(){
//            return this.efficiencyOnProperMaterial;
//        }
//        public float getDamageVsEntity(){
//        	return this.damageVsEntity;
//        }
//        public int getEnchantability(){
//        	return this.enchantability;
//        }
//        // Anvil Repair Materials
//        
//        public Item repairMat(){
//        	switch (this)
//            {
//                case Karinium:    return kariniumCrystal;
//                default:      return kariniumCrystal;
//            }
//        }
//        public ItemStack getRepairItemStack()
//        {
//            if (repairMaterial != null) return repairMaterial;
//            Item repM = this.repairMat();
//            if (repM == null) return null;
//            repairMaterial = new ItemStack(repM, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
//            return repairMaterial;
//        }
//		
//	}
		
}
