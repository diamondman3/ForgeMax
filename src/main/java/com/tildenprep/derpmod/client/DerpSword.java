package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by kenny on 3/26/14.
 */
public class DerpSword extends ItemSword {

    public DerpSword(ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setTextureName("derpmod:derpSword");
        setUnlocalizedName("derpSword");

    }

}
