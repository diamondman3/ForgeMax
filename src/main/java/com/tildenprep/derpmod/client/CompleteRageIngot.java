package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CompleteRageIngot extends Item{


    public CompleteRageIngot(){
        super();
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
        setUnlocalizedName("rageIngot");
        setTextureName("derpmod:rageIngot8");
    }
}

