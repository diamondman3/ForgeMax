package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.tildenprep.derpmod.EntityDerpGrenade;

public class DerpGrenadeItem extends Item {
	
	 public DerpGrenadeItem(){
	        super();
	        this.setCreativeTab(CreativeTabs.tabTools);
	        setUnlocalizedName("derpGrenade");
	        setTextureName("derpmod:derpGrenade");
	        setMaxStackSize(8);
	 }
	 
	 public ItemStack onItemRightClick(ItemStack stack, World w, EntityPlayer player)
	  {
	      if (!player.capabilities.isCreativeMode)
	      {
	          --stack.stackSize;
	      }
	      w.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!w.isRemote)
	      {
	    	  System.out.println("making entity");
	          w.spawnEntityInWorld(new EntityDerpGrenade(w, player));
	      }
	      return stack;
	  }

}
