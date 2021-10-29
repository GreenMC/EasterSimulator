package io.github.greenmc.eastersimulator;

import io.github.greenmc.eastersimulator.arenas.ArenaManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasterSimulator extends JavaPlugin {

    private ArenaManager arenaManager;

    @Override
    public void onEnable() {
        this.arenaManager = new ArenaManager(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}