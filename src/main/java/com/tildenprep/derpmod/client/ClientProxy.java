package com.tildenprep.derpmod.client;

import net.minecraft.client.renderer.entity.RenderSnowball;

import com.tildenprep.derpmod.CommonProxy;
import com.tildenprep.derpmod.DerpMod;
import com.tildenprep.derpmod.entity.EntityDerpGrenade;
import com.tildenprep.derpmod.entity.RageGuyMob;
import com.tildenprep.derpmod.entity.ScrollSpellEntity;
import com.tildenprep.derpmod.model.RageGuy;
import com.tildenprep.derpmod.render.RenderRageGuy;

import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by kenny on 5/21/14.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
    	RenderingRegistry.registerEntityRenderingHandler(EntityDerpGrenade.class, new RenderSnowball(DerpMod.derpGrenade));
    	RenderingRegistry.registerEntityRenderingHandler(ScrollSpellEntity.class, new RenderSnowball(DerpMod.explosionScroll));
    	//RenderingRegistry.registerEntityRenderingHandler(RageGuyMob.class, new RenderRageGuy(new RageGuy(), 0));
    }

    public int addArmor(String armor){
    	return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}
