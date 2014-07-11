package com.tildenprep.derpmod.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.tildenprep.derpmod.DerpMod;

public class RenderRageGuy extends RenderLiving {

	public RenderRageGuy(ModelBase model, float f) {
		super(model, f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return new ResourceLocation(DerpMod.MODID + ":/textures/entity/rageGuy.png");
	}

}
