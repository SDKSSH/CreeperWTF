package me.sdkssh.creeper;

import me.sdkssh.creeper.events.CreeperListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class CreeperWTF extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CreeperListeners(), this);
    }
}