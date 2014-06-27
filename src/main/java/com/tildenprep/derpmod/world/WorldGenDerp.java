package com.tildenprep.derpmod.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.tildenprep.derpmod.DerpMod;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenDerp implements IWorldGenerator{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
		case 0:
			generateOverworld(world, rand, chunkX*16, chunkZ*16);
		}		
	}
	
	private void generateOverworld(World world, Random rand, int chunkX, int chunkZ){
	//Derp Ore gen
		for(int i = 0; i < 35; i++){ 
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(40);
			int randPosZ = chunkZ + rand.nextInt(16);
			
			(new WorldGenMinable(DerpMod.derpOre,10)).generate(world, rand, randPosX, randPosY, randPosZ);
			
		}
	//Troll Ore gen	
		for(int i = 0; i < 22; i++){ 
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(23);
			int randPosZ = chunkZ + rand.nextInt(16);
			
			(new WorldGenMinable(DerpMod.trollOre,10)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	//Rage Ore gen
		for(int i = 0; i < 16; i++){ 
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(16);
			int randPosZ = chunkZ + rand.nextInt(16);
			
			(new WorldGenMinable(DerpMod.rageOre,10)).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}
}
