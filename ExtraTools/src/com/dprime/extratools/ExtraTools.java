package com.dprime.extratools;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "ExtraTools", name = "ExtraTools", version = "1.0")
public class ExtraTools {
	//REGISTRATOIN
	public static Item LapisLazuliPickaxe = new ItemLapisLazuliPicaxe(2000, toolLapisLazuli).setUnlocolizedName("LapisLazuliPickaxe");
	public static Item LapisLazuliShovel = new ItemLapisLazuliShovel(2001, toolLapisLazuli).setUnlocolizedName("LapisLazuliShovel");
	public static Item LapisLazuliSword = new ItemLapisLazuliSword(2002, toolLapisLazuli.setUnlocolizedName("LapisLazuliSword");
	public static Item LapisLazuliAxe = new ItemLapisLazuliAxe(2003, toolLapisLazuli).setUnlocolizedName("LapisLazuliAxe");
	public static Item LapisLazuliHoe = new ItemLapisLazuliHoe(2004, toolLapisLazuli).setUnlocolizedName("LapisLazuliHoe");
	
	//ENUMTOOLMATERIAL
	public static EnumToolMaterial toolLapisLazuli = EnumHelper.addToolMaterial("LAPISLAZULI", 3, 1461, 11.0F, 3.0F, 30);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
