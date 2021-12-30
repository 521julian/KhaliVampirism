package com.yahoo.khalirai.khalivampirism.core.init;

import com.yahoo.khalirai.khalivampirism.KhaliVampirism;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
	private ItemInit () {}
	
	public static final DeferredRegister<Item> ItEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KhaliVampirism.MODID);
	/*
	public static final RegistryObject<SwordItem> FANGS = ItEMS.register("fangs",
			() -> new SwordItem(Tiers.DIAMOND, 2, 1f, new Item.Properties()
					.tab(CreativeModeTab.TAB_COMBAT)
					.stacksTo(1)
					.fireResistant()));
					*/
	public static final RegistryObject<Item> FANGS = ItEMS.register("fangs",
			() -> new Item(new Item.Properties()
					.tab(CreativeModeTab.TAB_COMBAT)
					.stacksTo(1)
					.fireResistant()));
}
