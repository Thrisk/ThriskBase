package com.thrisk.base.recipes;

import com.thrisk.base.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	public static final void init() {
		GameRegistry.addRecipe(new ItemStack(ModItems.kariniumDust), new Object[] {"#*#", "#B#", "#*#", '#', new ItemStack(Items.dye , 1, 4), '*', Items.redstone, 'B', Items.blaze_powder});
		GameRegistry.addRecipe(new ItemStack(ModItems.kariniumCrystal), new Object[] {" # ", "#D#", " # ", '#', ModItems.kariniumDust, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ModItems.kariniumPickaxe), new Object[] {"###", " I "," I ", '#', ModItems.kariniumCrystal, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.kariniumAxe), new Object[] {" ##", " I#"," I ", '#', ModItems.kariniumCrystal, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.kariniumSpade), new Object[] {" # ", " I "," I ", '#', ModItems.kariniumCrystal, 'I', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.kariniumSword), new Object[] {" # ", " # "," I ", '#', ModItems.kariniumCrystal, 'I', Items.stick});

	}
}
