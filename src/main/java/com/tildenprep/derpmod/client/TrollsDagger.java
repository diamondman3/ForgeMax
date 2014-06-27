package com.tildenprep.derpmod.client;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;


public class TrollsDagger extends ItemSword{
	
	public TrollsDagger(ToolMaterial material){
		super(material);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setTextureName("derpmod:trollsDagger");
        setUnlocalizedName("trollsDagger");
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        target.addPotionEffect(new PotionEffect(Potion.poison.id, 12000, 10));
        target.addPotionEffect(new PotionEffect(Potion.regeneration.id, 12000, 10));
        return true;
    }

}
