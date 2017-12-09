package com.icemetalpunk.amenities;

import com.icemetalpunk.amenities.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Amenities.MODID, version = Amenities.VERSION)
public class Amenities {
	public static final String MODID = "amenities";
	public static final String VERSION = "1.0";

	@SidedProxy(clientSide = "com.icemetalpunk.amenities.proxy.ClientProxy", serverSide = "com.icemetalpunk.amenities.proxy.ServerProxy")
	public static CommonProxy proxy;

	public static CreativeTabs tab = new CreativeTabs("amenities") {

		@Override
		public ItemStack getTabIconItem() {
			// TODO: Change item icon.
			return new ItemStack(Item.getItemFromBlock(Blocks.FURNACE));
		}

	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
