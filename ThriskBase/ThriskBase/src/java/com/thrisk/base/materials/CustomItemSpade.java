package com.thrisk.base.materials;

import java.util.Set;

import com.google.common.collect.Sets;
import com.thrisk.base.materials.ModMaterials.ToolMaterials;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class CustomItemSpade extends CustomItemTool {

	private static final Set field_150916_c = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    public CustomItemSpade(ToolMaterials p_i45353_1_){
        super(1.0F, p_i45353_1_, field_150916_c);
    }
    public boolean func_150897_b(Block p_150897_1_){
        return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
    }
}
