package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

/**
 * Created by kenny on 3/19/14.
 */
public class DerpOre extends Block {

    public DerpOre (Material material)
    {
        super(material);
        setBlockName("derpOre");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(2.0F);
        setStepSound(Block.soundTypeWood);
        setBlockTextureName("derpmod:derpOre");
        setHarvestLevel("pickaxe", 2);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

}
