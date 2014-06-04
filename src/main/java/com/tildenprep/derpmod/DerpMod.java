package com.tildenprep.derpmod;

import com.tildenprep.derpmod.client.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = DerpMod.MODID, version = DerpMod.VERSION)
public class DerpMod
{
    public static final String MODID = "DerpMod";
    public static final String VERSION = "0.0.3";

    public final static Block derpOre = new DerpOre(Material.gourd);
    public final static Block derpBlock = new DerpBlock(Material.gourd);
    public final static Block trollOre = new TrollOre(new Material(MapColor.ironColor));
    public final static Block repeaterBomb = new RepeaterBomb(Material.sponge);

    public static Item derpIngot;
    public static Item derpSword;
    public static Item derpShovel;
    public static Item derpPickaxe;
    public static Item derpAxe;
    public static Item derpHoe;

    public static Item trollGem;

    public static Item antibacon;


    @Mod.Instance(value = "DerpMod")
    public static DerpMod instance;

    @SidedProxy(clientSide ="com.tildenprep.derpmod.client.ClientProxy", serverSide = "com.tildenprep.derpmod.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerBlock(derpOre, "Derp Ore");
        GameRegistry.registerBlock(trollOre, "Troll Ore");

        derpIngot = new DerpIngot();
        ItemStack dIS = new ItemStack(derpIngot, 1);
        GameRegistry.addSmelting(derpOre, dIS, 1F);
        GameRegistry.registerItem(derpIngot, "derpIngot");
        GameRegistry.addShapelessRecipe(new ItemStack(derpIngot, 1), new ItemStack(Items.cooked_porkchop), new ItemStack(Items.dye, 0), new ItemStack(Items.iron_ingot), new ItemStack(Items.emerald));
        Item.ToolMaterial derpM = new EnumHelper().addToolMaterial("Derp", 5, 1337, 100F, 10F, 30);


        GameRegistry.registerBlock(derpBlock, "Derp Block");
        GameRegistry.addShapedRecipe(new ItemStack(derpBlock, 1), "ddd", "ddd", "ddd", 'd', dIS);
        GameRegistry.addShapelessRecipe(new ItemStack(derpIngot, 9), new ItemStack(derpBlock));


        derpSword = new DerpSword(derpM);
        GameRegistry.registerItem(derpSword, "Derp Sword");
        GameRegistry.addShapedRecipe(new ItemStack(derpSword, 1), " d ", " d ", " s ", 'd', dIS, 's', new ItemStack(Items.stick));


        derpShovel = new DerpShovel(derpM);
        GameRegistry.registerItem(derpShovel, "Derp Shovel");
        GameRegistry.addShapedRecipe(new ItemStack(derpShovel, 1), " d ", " s ", " s ", 'd', dIS, 's', new ItemStack(Items.stick));


        derpPickaxe = new DerpPickaxe(derpM);
        GameRegistry.registerItem(derpPickaxe, "Derp Pickaxe");
        GameRegistry.addShapedRecipe(new ItemStack(derpPickaxe, 1), "ddd", " s ", " s ", 'd', dIS, 's', new ItemStack(Items.stick));


        derpAxe = new DerpAxe(derpM);
        GameRegistry.registerItem(derpAxe, "Derp Axe");
        GameRegistry.addShapedRecipe(new ItemStack(derpAxe, 1), "dd ", "ds ", " s ", 'd', dIS, 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(derpAxe, 1), " dd", " sd", " s ", 'd', dIS, 's', new ItemStack(Items.stick));

        derpHoe = new DerpHoe(derpM);
        GameRegistry.registerItem(derpHoe, "Derp Hoe");
        GameRegistry.addShapedRecipe(new ItemStack(derpHoe, 1), "dd ", " s ", " s ", 'd', dIS, 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(derpHoe, 1), " dd", " s ", " s ", 'd', dIS, 's', new ItemStack(Items.stick));

        trollGem = new TrollGem();
        ItemStack tGS = new ItemStack(trollGem, 1);
        GameRegistry.registerItem(trollGem, "Troll Gem");
        GameRegistry.addShapedRecipe(new ItemStack(trollGem, 4), "ooo", "oco", "ooo", 'o', new ItemStack(trollOre), 'c', new ItemStack(Items.coal));
        Item.ToolMaterial trollM = new EnumHelper().addToolMaterial("Troll", 5, 1337, 100F, 10F, 30);

        antibacon = new Antibacon();
        GameRegistry.registerItem(antibacon, "Antibacon");
        GameRegistry.addShapedRecipe(new ItemStack(antibacon, 8),"ppp", "ptp", "ppp", 'p', new ItemStack(Items.cooked_porkchop), 't', tGS);


        GameRegistry.registerBlock(repeaterBomb, "Repeater Bomb");



    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("Derp Mod by diamondman3 and yellowjournalism sucessfully loaded");
    }
}
