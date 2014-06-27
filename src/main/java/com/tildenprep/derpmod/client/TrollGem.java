package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TrollGem extends Item {

        public TrollGem(){
            super();
            setCreativeTab(CreativeTabs.tabMaterials);
            setMaxStackSize(63);
            setUnlocalizedName("trollGem");
            setTextureName("derpmod:trollGem");
        }
}
