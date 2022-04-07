package com.ramosbros.maze.builders;

import com.ramosbros.maze.rooms.Door;
import com.ramosbros.maze.rooms.Room;
import com.ramosbros.maze.rooms.RoomType;

import java.util.Map;

public class RoomBuilder implements Builder {

    /**
     * Used for keeping reference to the available paths
     */
    private Map<Door, Room> paths;

    /**
     * Mostly used for the room generation portion
     * Probably won't need in future so... well delete later.
     */
    private RoomType roomType;

    /**
     * IDK maybe we can do something if the lights are off in a certain room
     */
    private boolean isLightOn;

    /**
     * x coordinate in the maze
     */
    private int x;

    /**
     * y coordinate in the maze
     */
    private int y;

    @Override
    public void setPaths(Map<Door, Room> paths) {
        this.paths = paths;
    }

    @Override
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public void setLight(boolean isLightOn) {
        this.isLightOn = isLightOn;
    }

    @Override
    public void setXCoordinate(int x) {
        this.x = x;
    }

    @Override
    public void setYCoordinate(int y) {
        this.y = y;
    }

    public Room getResult() {
        return new Room(roomType, isLightOn, x, y, paths);
    }
}
