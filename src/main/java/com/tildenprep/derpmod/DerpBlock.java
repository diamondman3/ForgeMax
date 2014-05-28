package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

/**
 * Created by kenny on 3/19/14.
 */
public class DerpBlock extends Block {

    public DerpBlock (Material material)
    {
        super(Material.rock);
        setBlockName("derpBlock");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(2.0F);
        setStepSound(Block.soundTypeStone);
        setBlockTextureName("derpmod:derpBlock");
        setHarvestLevel("pickaxe", 2);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

}
