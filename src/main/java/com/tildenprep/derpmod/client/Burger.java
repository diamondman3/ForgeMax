package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by diamondman3 on 9/8/2014.
 */
public class Burger extends ItemFood{

    public Burger(){
        super(18, 24.8F, false);
        this.setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("burger");
        setTextureName("derpmod:burger");
    }
}
