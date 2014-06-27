package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by kenny on 4/9/14.
 */
public class DerpAxe extends ItemAxe {
	
    public DerpAxe(Item.ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxStackSize(1);
        setUnlocalizedName("derpAxe");
        setTextureName("derpmod:derpAxe");
    }
    
   /* public ItemStack onItemRightClick(ItemStack stack, World w, Entity entsAreUnfortuatelyNotInMinecraft, int par4, boolean par5){
    	
    	EntityPlayer player = (EntityPlayer)entsAreUnfortuatelyNotInMinecraft;
    	w = player.worldObj;
    	w.spawnEntityInWorld(pig, player.get);
    	
        return stack;
    }*/
}
