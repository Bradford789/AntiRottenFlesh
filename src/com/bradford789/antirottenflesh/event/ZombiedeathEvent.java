package com.bradford789.antirottenflesh.event;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class ZombiedeathEvent implements Listener {
	@EventHandler
	public void mobDeath(EntityDeathEvent event) {

		LivingEntity e = event.getEntity();

		if (e instanceof Zombie) {
			event.getDrops().clear();
		}
	}
}
