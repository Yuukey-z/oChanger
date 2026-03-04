package me.kayzhng.ochanger.Listeners;

import me.kayzhng.ochanger.Utils.WorldUtils;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class FireballModifier implements Listener {

    private final JavaPlugin plugin;
    private final WorldUtils worldUtils;

    public FireballModifier(JavaPlugin plugin, WorldUtils worldUtils) {
        this.plugin = plugin;
        this.worldUtils = worldUtils;
    }

    @EventHandler
    public void onFireballLaunch(ProjectileLaunchEvent event) {

        if (!(event.getEntity() instanceof Fireball)) return;

        Fireball fireball = (Fireball) event.getEntity();

        if (!(fireball.getShooter() instanceof Player)) return;

        double multiplier = plugin.getConfig().getDouble("speed-multiplier");

        Vector velocity = fireball.getVelocity();

        velocity = velocity.normalize().multiply(multiplier);

        fireball.setVelocity(velocity);
    }
}
