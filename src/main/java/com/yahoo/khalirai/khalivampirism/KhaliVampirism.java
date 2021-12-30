package com.yahoo.khalirai.khalivampirism;

import com.yahoo.khalirai.khalivampirism.core.init.ItemInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KhaliVampirism.MODID)
public class KhaliVampirism {
	public static final String MODID = "khalivampirism";
	
	public KhaliVampirism() {
		var bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ItEMS.register(bus);
	}
}
