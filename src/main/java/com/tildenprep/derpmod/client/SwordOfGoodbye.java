package com.tildenprep.derpmod.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by diamondman3 on 9/3/2014.
 */
public class SwordOfGoodbye extends ItemSword{

    public SwordOfGoodbye(Item.ToolMaterial material){
        super(material);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setTextureName("derpmod:swordOfGoodbye");
        setUnlocalizedName("swordOfGoodbye");

    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        //target.knockBack(very far);
        return true;
    }
}
