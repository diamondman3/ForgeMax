package com.tildenprep.derpmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;

public class RickRollDisc extends ItemRecord{
	
	public RickRollDisc(String name){
		super(name);
		this.setUnlocalizedName("rickRollDisc");
        setCreativeTab(CreativeTabs.tabMisc);
        setMaxStackSize(1);
        setTextureName("derpmod:rickRollDisc");
	}

}
