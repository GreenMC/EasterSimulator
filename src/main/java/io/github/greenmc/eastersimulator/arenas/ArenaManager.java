package io.github.greenmc.eastersimulator.arenas;

import io.github.greenmc.eastersimulator.EasterSimulator;

import java.util.HashSet;
import java.util.Set;

public class ArenaManager {

    private final EasterSimulator plugin;
    private final Set<Arena> arenas = new HashSet<>();

    public ArenaManager(EasterSimulator plugin) {
        this.plugin = plugin;
    }

    public Arena getNextEmptyArena() {
        return arenas.stream()
                .filter(arena -> arena.getState() == ArenaState.WAITING)
                .findFirst()
                .orElse(null);
    }

    public Arena registerArena(String name) {
        if (!isPresent(name)) {
            Arena arena = new Arena(name);
            arenas.add(arena);
            return arena;
        }
        return null;
    }

    public void removeArena(String name) {
        arenas.removeIf(arena -> arena.getName().equalsIgnoreCase(name));
    }

    public boolean isPresent(String name) {
        return arenas.stream().anyMatch(arena -> arena.getName().equalsIgnoreCase(name));
    }

}