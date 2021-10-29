package io.github.greenmc.eastersimulator.arenas;

import org.bukkit.Location;

import java.util.List;

public class Arena {

    private final String name;
    private ArenaState state;
    private List<Location> prizeLocations;

    public Arena(String name) {
        this.name = name;
        this.state = ArenaState.EMPTY;
    }

    public String getName() {
        return name;
    }

    public ArenaState getState() {
        return state;
    }

    public void setState(ArenaState state) {
        this.state = state;
    }

    public List<Location> getPrizeLocations() {
        return prizeLocations;
    }

    public void addPrizeLocation(Location location) {
        prizeLocations.add(location);
    }

}