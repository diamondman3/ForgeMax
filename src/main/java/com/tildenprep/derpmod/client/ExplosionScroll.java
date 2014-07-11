package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.tildenprep.derpmod.entity.ScrollSpellEntity;

public class ExplosionScroll extends Item{

	public ExplosionScroll(){
		super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("explosionScroll");
        setTextureName("derpmod:explosionScroll");
        setMaxDamage(8);
        setMaxStackSize(1);
	}
	
	 public ItemStack onItemRightClick(ItemStack stack, World w, EntityPlayer player)
	  {
		 
	     if (!w.isRemote)
	      	{
	    	 	stack.setItemDamage(stack.getItemDamage() + 1);
	      		w.spawnEntityInWorld(new ScrollSpellEntity(w, player));
	      	}
	     return stack;
	  }

}
