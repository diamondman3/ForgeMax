package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by diamondman3 on 9/7/2014.
 */
public class Cheese extends ItemFood {

    public Cheese(){
        super(5, 6.0F, false);
        this.setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("cheese");
        setTextureName("derpmod:cheese");
    }

}
