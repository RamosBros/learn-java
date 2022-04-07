package com.ramosbros.maze;

import com.ramosbros.maze.builders.RoomBuilder;
import com.ramosbros.maze.director.Director;
import com.ramosbros.maze.rooms.Room;

/**
 * With the rooms being 1x1
 * <p>
 * The total maze is going to be 10x10
 * <p>
 * with startRoom starting at 0x0
 * <p>
 * and end Room ending at 9x9
 */
public class Maze {
    private final Director director;
    private final RoomBuilder roomBuilder;
    private Room startRoom;
    private Room endRoom;

    public Maze(Director director, RoomBuilder roomBuilder) {
        this.director = director;
        this.roomBuilder = roomBuilder;
        generateStart();
        generateMaze();
        generateEnd();
    }

    public void generateMaze() {
        // TODO write the generate maze logic
    }

    private void generateStart() {
        director.constructStart(roomBuilder);
        startRoom = roomBuilder.getResult();
    }

    private void generateEnd() {
        director.constructFinish(roomBuilder);
        endRoom = roomBuilder.getResult();
    }
}
