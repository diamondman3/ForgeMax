package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UnfinishedRageIngot extends Item{

	public int globStage;
	public UnfinishedRageIngot(int stage){
        super();
        this.globStage = stage;
        switch(stage){
        case 0:
        	setTextureName("derpmod:rageIngot1");
        	setUnlocalizedName("uri1");
        	break;
        case 1:
        	setTextureName("derpmod:rageIngot2");
        	setUnlocalizedName("uri2");
        	break;
        case 2:
        	setTextureName("derpmod:rageIngot3");
        	setUnlocalizedName("uri3");
        	break;
        case 3:
        	setTextureName("derpmod:rageIngot4");
        	setUnlocalizedName("uri4");
        	break;
        case 4:
        	setTextureName("derpmod:rageIngot5");
        	setUnlocalizedName("uri5");
        	break;
        case 5:
        	setTextureName("derpmod:rageIngot6");
        	setUnlocalizedName("uri6");
        	break;
        case 6:
        	setTextureName("derpmod:rageIngot7");
        	setUnlocalizedName("uri7");
        	break;
        }
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
        setMaxDamage(6);
	}
	public int getGlobStage(){
		return globStage;
	}
}
