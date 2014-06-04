package com.tildenprep.derpmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.lwjgl.Sys;

import java.util.Random;

/**
 * Created by kenny on 4/9/14.
 */
public class RepeaterBomb extends Block {

    boolean exploded = false;

    public RepeaterBomb (Material material)
    {
        super(material);
        setBlockName("repeaterBomb");
        setCreativeTab(CreativeTabs.tabRedstone);
        setHardness(0F);
        setStepSound(Block.soundTypeStone);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.repeater;
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block p_149695_5_){
        if (exploded == false) {
            System.out.println("exploded checked");
            if(world.isBlockIndirectlyGettingPowered(x,y,z)){
                world.createExplosion(null, getBlockBoundsMaxX(), getBlockBoundsMaxY(), getBlockBoundsMaxZ(), 64F, false);
                System.out.println("I like cheese");
                exploded = true;
            }
        }
    }


    //    @Override
//    public void onBlockDestroyedByPlayer(){
//
//        super.onBlockDestroyedByPlayer(World world);
//    }


}

