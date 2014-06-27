package com.tildenprep.derpmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class RageOre extends Block{
	
    public RageOre (Material material)
    {
        super(material);
        setBlockName("rageOre");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(3.5F);
        setStepSound(Block.soundTypeStone);
        setBlockTextureName("derpmod:rageOre");
        setHarvestLevel("pickaxe", 3);
	}

	public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

}
