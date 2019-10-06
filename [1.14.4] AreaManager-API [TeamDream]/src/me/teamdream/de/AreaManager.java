package me.teamdream.de;

import org.bukkit.plugin.java.JavaPlugin;

public class AreaManager extends JavaPlugin {
	
	private static AreaManager pl = null;
	public static AreaManager getInstance() {
		return pl;
	}
	
	public AreaManager() {
	}
	
	@Override
	public void onEnable() {
		preInit();
		init();
		postInit();
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
	}
	
	public void preInit() {
		pl = this;
	}
	public void init() {
		
	}
	public void postInit() {
		
	}
	
}
