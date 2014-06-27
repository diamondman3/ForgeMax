package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

public class TrollBlock extends Block {

    public TrollBlock (Material material)
    {
        super(material);
        setBlockName("trollBlock");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(2.0F);
        setStepSound(Block.soundTypeStone);
        setBlockTextureName("derpmod:trollBlock");
        setHarvestLevel("shears", 0);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

}
