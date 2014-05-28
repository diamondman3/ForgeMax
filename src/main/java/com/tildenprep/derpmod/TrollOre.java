package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

/**
 * Created by kenny on 4/23/14.
 */
public class TrollOre extends Block {

    public TrollOre (Material material)
    {
        super(material);
        setBlockName("trollOre");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(2.0F);
        setStepSound(Block.soundTypeStone);
        setBlockTextureName("derpmod:trollOre");
        setHarvestLevel("axe", 2);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

}
