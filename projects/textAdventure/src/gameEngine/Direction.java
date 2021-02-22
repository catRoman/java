package gameEngine;

import gameObjects.rooms.NullRoom;
import gameObjects.rooms.Room;

public enum Direction {
    FORWARD,
    BACK,
    LEFT,
    RIGHT;
    public static final Room NOEXIT = new NullRoom(); 
    
}
