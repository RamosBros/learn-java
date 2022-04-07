package com.ramosbros.maze.builders;

import com.ramosbros.maze.rooms.Door;
import com.ramosbros.maze.rooms.Room;
import com.ramosbros.maze.rooms.RoomType;

import java.util.Map;

public interface Builder {
    void setPaths(Map<Door, Room> paths);

    void setRoomType(RoomType roomType);

    void setLight(boolean isLightOn);

    void setXCoordinate(int x);

    void setYCoordinate(int y);
}
