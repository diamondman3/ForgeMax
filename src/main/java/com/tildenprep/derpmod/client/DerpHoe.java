package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

/**
 * Created by kenny on 4/9/14.
 */
public class DerpHoe extends ItemHoe {

    public DerpHoe(Item.ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxStackSize(1);
        setUnlocalizedName("derpHoe");
        setTextureName("derpmod:derpHoe");

    }
}
