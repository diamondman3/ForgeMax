package com.tildenprep.derpmod.client;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.tildenprep.derpmod.DerpMod;

public class PickOfDividingOresByAFraction extends ItemPickaxe{
	
	ItemStack stack = new ItemStack(Blocks.stone);
	int itemSpawnRecursions = 0;
	
	public PickOfDividingOresByAFraction(ToolMaterial material){
		super(material);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxStackSize(1);
        setUnlocalizedName("pickOfDividingOresByAFraction");
        setTextureName("derpmod:oreFracDivPick");
	}

    
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
    	world.spawnEntityInWorld(new EntityItem(world, player.posX, player.posY, player.posZ, stack));
        return stack;
    }
    
    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase player)
    {
    	System.out.println("we are in block destroyed");
    	if(!world.isRemote) {
    		if(block.equals(Blocks.diamond_ore)) {
    			System.out.println("it was diamond");
    			stack = new ItemStack(Items.diamond);
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(Blocks.coal_ore)) {
    			System.out.println("it was coal");
    			stack = new ItemStack(Items.coal);
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(Blocks.quartz_ore)) {
    			System.out.println("it was quartz");
    			stack = new ItemStack(Items.quartz);
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(Blocks.redstone_ore)) {
    			System.out.println("it was redstone");
    			stack = new ItemStack(Items.redstone);
    			itemSpawnRecursions = 21;
    		}
    		else if(block.equals(Blocks.lapis_ore)) {
    			System.out.println("it was lapis");
    			stack = new ItemStack(Items.dye, 1, 4);
    			itemSpawnRecursions = 21;
    		}
    		else if(block.equals(Blocks.emerald_ore)){
    			System.out.println("it was emerald");
    			stack = new ItemStack(Items.emerald);
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(Blocks.iron_ore)){
    			System.out.println("it was iron");
    			stack = new ItemStack(Blocks.iron_ore); 
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(Blocks.gold_ore)){
    			System.out.println("it was gold");
    			stack = new ItemStack(Blocks.gold_ore);
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(DerpMod.derpOre)){
    			System.out.println("it was derpite");
    			stack = new ItemStack(DerpMod.derpOre); 
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(DerpMod.trollOre)){
    			System.out.println("it was trollium");
    			stack = new ItemStack(DerpMod.trollOre); 
    			itemSpawnRecursions = 7;
    		}
    		else if(block.equals(DerpMod.rageOre)){
    			System.out.println("it was raginium");
    			stack = new ItemStack(DerpMod.rageOre);
    			itemSpawnRecursions = 3;
    		}
    		for (int i = 0; i < itemSpawnRecursions; i++){
    			player.dropItem(Items.diamond, 1);
    		}
    		System.out.println("block destroyed");
    	}
    	
        if ((double)block.getBlockHardness(world, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
        {
            stack.damageItem(1, player);
        }

        return true;
    }
}
