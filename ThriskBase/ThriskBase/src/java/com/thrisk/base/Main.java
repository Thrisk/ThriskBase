package com.thrisk.base;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "base";
    public static final String MODNAME = "Thrisk Base";
    public static final String VERSION = "1.1.0";
    
    @SidedProxy(clientSide="com.thrisk.base.ClientProxy", serverSide="com.thrisk.base.ServerProxy")
    public static CommonProxy proxy;
        
    @Instance
    public static Main instance = new Main();
        
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
                
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
                
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
                
    }
}