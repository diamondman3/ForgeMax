package com.tildenprep.derpmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by kenny on 5/7/14.
 */
public class Antibacon extends ItemFood {

    public Antibacon(){
        super(-8, -12.8F, true);
        this.setAlwaysEdible();
        this.setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("antibacon");
        setTextureName("derpmod:antibacon");
    }

    public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par2World.playSoundAtEntity(par3EntityPlayer,("DerpMod:trollSongClip"), 1, 1);

    }
}
