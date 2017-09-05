package com.bradford789.antirottenflesh;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.bradford789.antirottenflesh.event.ZombiedeathEvent;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		
		registerListeners();
		
	}
	
	
	@Override
	public void onDisable() {
		
	}
	
	public void registerListeners() {
		Bukkit.getServer().getPluginManager().registerEvents(new ZombiedeathEvent(), this);
	}
}
