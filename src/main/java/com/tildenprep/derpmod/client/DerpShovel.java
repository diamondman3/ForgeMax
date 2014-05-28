package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

/**
 * Created by kenny on 4/2/14.
 */
public class DerpShovel extends ItemSpade {

    public DerpShovel(ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxStackSize(1);
        setUnlocalizedName("derpShovel");
        setTextureName("derpmod:derpShovel");

    }

}
