package com.tildenprep.derpmod.client;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.tildenprep.derpmod.CommonProxy;
import com.tildenprep.derpmod.DerpMod;
import com.tildenprep.derpmod.EntityDerpGrenade;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by kenny on 5/21/14.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
    	RenderingRegistry.registerEntityRenderingHandler(EntityDerpGrenade.class, new RenderSnowball(DerpMod.derpGrenade));
    }

}
