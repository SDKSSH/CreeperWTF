package me.sdkssh.creeper.events;

import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CreeperListeners implements Listener {
    @EventHandler
    public void onMobSpawn(EntitySpawnEvent e){
        Entity ent = e.getEntity();
        if(ent.getType() != EntityType.CREEPER) return;
        LivingEntity c = (LivingEntity) ent;
        c.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999, 255, false));
        c.getEquipment().setHelmet(new ItemStack(Material.TNT));
        c.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        c.getEquipment().setHelmetDropChance(0);
        c.getEquipment().setLeggingsDropChance(0);
    }
}
