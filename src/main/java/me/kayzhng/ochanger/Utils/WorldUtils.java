package me.kayzhng.ochanger.Utils;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class WorldUtils {

    private final JavaPlugin plugin;

    public WorldUtils(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean isDisabledWorld(String worldName) {

        List<String> disabledWorlds = plugin.getConfig().getStringList("disabled-worlds");

        return disabledWorlds.contains(worldName);
    }
}
