package com.ramosbros.maze.director;

import com.ramosbros.maze.builders.Builder;
import com.ramosbros.maze.rooms.Door;
import com.ramosbros.maze.rooms.Room;
import com.ramosbros.maze.rooms.RoomType;

import java.util.HashMap;
import java.util.Map;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructStart(Builder builder) {
        builder.setLight(true);
        builder.setRoomType(RoomType.START);
        builder.setPaths(generateRandomPaths());
        builder.setXCoordinate(0);
        builder.setYCoordinate(0);
    }

    public void constructFinish(Builder builder) {
        builder.setLight(true);
        builder.setRoomType(RoomType.FINISH);
        builder.setPaths(generateRandomPaths());
        builder.setXCoordinate(9);
        builder.setYCoordinate(9);
    }

    public void constructLightRoom(Builder builder) {
        builder.setLight(true);
        builder.setRoomType(RoomType.PATH);
        builder.setPaths(generateRandomPaths());
    }

    public void constructDeadEnd(Builder builder) {
        builder.setLight(false);
        builder.setRoomType(RoomType.DEADEND);
        builder.setPaths(generateRandomPaths());
    }

    public void constructSecret(Builder builder) {
        builder.setLight(false);
        builder.setRoomType(RoomType.SECRET);
        builder.setPaths(generateRandomPaths());
    }

    /**
     * A dumb path generator
     * <p>
     * In the future once we implement turns maybe we can have this be a
     * component and make it so that some rooms change their path layouts
     * at random per turns
     */
    private Map<Door, Room> generateRandomPaths() {
        Map<Door, Room> paths = new HashMap<>();
        /**
         * TODO write the generation path code
         */
        return paths;
    }
}
