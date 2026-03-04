package me.kayzhng.ochanger.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class FireballModifier implements Listener {

    private final JavaPlugin plugin;

    public FireballModifier(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void fireballSpeed(){

    }

}
