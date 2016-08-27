package com.thrisk.base.items;

import com.thrisk.base.materials.ModMaterials;

import cpw.mods.fml.common.registry.GameData;
import net.minecraft.block.Block;
import net.minecraft.util.RegistryNamespaced;

public class ModItem {
	public static final RegistryNamespaced itemRegistry = GameData.getItemRegistry();
	
    public static int getIdFromItem(ModItem p_150891_0_){
        return p_150891_0_ == null ? 0 : itemRegistry.getIDForObject(p_150891_0_);
    }
    
	public static ModItem getItemById(int p_150899_0_){
        return (ModItem)itemRegistry.getObjectById(p_150899_0_);
	}
	
    public static ModItem getItemFromBlock(Block p_150898_0_){
        return getItemById(Block.getIdFromBlock(p_150898_0_));
    }

	public static final void init() {
		//Test Sword
		itemRegistry.addObject(500, "karanium_sword_1", (new CustomSword(ModMaterials.Karinium, "Karinium Sword_1", "KariniumSword")));
		
	}

}
