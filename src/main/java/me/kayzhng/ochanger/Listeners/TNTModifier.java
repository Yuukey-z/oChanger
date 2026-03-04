package me.kayzhng.ochanger.Listeners;

import me.kayzhng.ochanger.Utils.WorldUtils;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TNTModifier implements Listener {

    private final JavaPlugin plugin;
    private final WorldUtils worldUtils;

    public TNTModifier(JavaPlugin plugin, WorldUtils worldUtils) {
        this.plugin = plugin;
        this.worldUtils = worldUtils;
    }

    @EventHandler
    public void onTNTSpawn(EntitySpawnEvent event) {

        if (!(event.getEntity() instanceof TNTPrimed)) return;

        TNTPrimed tnt = (TNTPrimed) event.getEntity();

        int fuseTicks = plugin.getConfig().getInt("fuse-ticks");

        tnt.setFuseTicks(fuseTicks);
    }
}

