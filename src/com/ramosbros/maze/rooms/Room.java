package com.ramosbros.maze.rooms;

import java.util.Map;

public class Room {
    /**
     * Not sure well use these either but keep here for now
     */
    public static final int LENGTH = 1;
    public static final int WIDTH = 1;

    /**
     * Used for keeping reference to the available paths
     */
    private final Map<Door, Room> paths;

    /**
     * Mostly used for the room generation portion
     * Probably won't need in future so... well delete later.
     */
    private final RoomType roomType;

    /**
     * IDK maybe we can do something if the lights are off in a certain room
     */
    private final boolean isLightOn;

    /**
     * x coordinate in the maze
     */
    private final int x;

    /**
     * y coordinate in the maze
     */
    private final int y;

    public Room(RoomType roomType, boolean isLightOn, int x, int y, Map<Door, Room> paths) {
        this.roomType = roomType;
        this.isLightOn = isLightOn;
        this.paths = paths;
        this.x = x;
        this.y = y;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Map<Door, Room> getPaths() {
        return paths;
    }

    public boolean isLightOn() {
        return isLightOn;
    }
}
