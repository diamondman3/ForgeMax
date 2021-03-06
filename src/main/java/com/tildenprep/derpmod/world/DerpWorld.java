package com.tildenprep.derpmod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class DerpWorld {
	
	public static void mainRegistry(){
		initWorldGen();	
	}

	public static void initWorldGen() {
		registerWorldGen(new WorldGenDerp(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
	
}
