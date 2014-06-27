package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RageBlock extends Block{
	
	public RageBlock(Material material){
		super(Material.rock);
		setBlockName("rageBlock");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(3.5F);
        setStepSound(Block.soundTypeStone);
        setBlockTextureName("derpmod:rageBlock");
        setHarvestLevel("pickaxe", 3);
	}

}
