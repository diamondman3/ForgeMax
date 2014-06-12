package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by kenny on 4/9/14.
 */
public class RepeaterBomb extends Block {

    boolean exploded;

    public RepeaterBomb (Material material)
    {
        super(material);
        setBlockName("repeaterBomb");
        setCreativeTab(CreativeTabs.tabRedstone);
        setHardness(0F);
        exploded = false;
        setStepSound(Block.soundTypeStone);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.repeater;
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block p_149695_5_){
        if(world.isBlockIndirectlyGettingPowered(x,y,z)){
            world.setBlock(x,y,z, Blocks.air); //destroy the repeaterbomb itself
            world.createExplosion(null, x, y, z, 6F, true);
        }
    }
}


//    @Override
//    public void onBlockDestroyedByPlayer(){
//
//        super.onBlockDestroyedByPlayer(World world);
//    }



