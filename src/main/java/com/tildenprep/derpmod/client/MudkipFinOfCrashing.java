package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class MudkipFinOfCrashing extends ItemSword{
	
    public MudkipFinOfCrashing(ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setTextureName("derpmod:mudkipFinOfCrashing");
        setUnlocalizedName("mudkipFinOfCrashing");

    }
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        	if(target instanceof EntityPlayer){
        		//show image of mudkip for 3 seconds
        		//crash target
        		
        	}
        return true;
    }
}
