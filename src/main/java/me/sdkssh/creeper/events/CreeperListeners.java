package me.sdkssh.creeper.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class CreeperListeners implements Listener {
    @EventHandler
    public void onMobSpawn(EntitySpawnEvent e){
        Entity ent = e.getEntity();
        if(ent.getType() != EntityType.CREEPER) return;
    }
}
