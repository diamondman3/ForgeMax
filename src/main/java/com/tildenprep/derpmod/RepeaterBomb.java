package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by kenny on 4/9/14.
 */
public class RepeaterBomb extends Block {

    public RepeaterBomb (Material material)
    {
        super(material);
        setBlockName("Repeater Bomb");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHardness(0F);
        setStepSound(Block.soundTypeStone);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.repeater;
    }

    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_){
        explode();
        return true;
    }

    public void explode(){
         //bouche
    }

    //    @Override
//    public void onBlockDestroyedByPlayer(){
//
//        super.onBlockDestroyedByPlayer(World world);
//    }


}

