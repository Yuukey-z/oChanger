package me.kayzhng.ochanger;

import me.kayzhng.ochanger.Listeners.FireballModifier;
import me.kayzhng.ochanger.Listeners.TNTModifier;
import me.kayzhng.ochanger.Utils.WorldUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class OChanger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        saveDefaultConfig();
        WorldUtils worldUtils = new WorldUtils(this);

        getServer().getPluginManager().registerEvents(
                new FireballModifier(this, worldUtils),
                this
        );

        getServer().getPluginManager().registerEvents(
                new TNTModifier(this, worldUtils),
                this
        );
        getLogger().info(
                "       _________ .__                                          \n" +
                "  ____ \\_   ___ \\|  |__ _____    ____    ____   ___________   \n" +
                " /  _ \\/    \\  \\/|  |  \\\\__  \\  /    \\  / ___\\_/ __ \\_  __ \\  \n" +
                "(  <_> )     \\___|   Y  \\/ __ \\|   |  \\/ /_/  >  ___/|  | \\/  \n" +
                " \\____/ \\______  /___|  (____  /___|  /\\___  / \\___  >__| /\\  \n" +
                "               \\/     \\/     \\/     \\//_____/      \\/     \\/  ");
    }

}
