package gameSpaces;

import java.util.ArrayList;

import gameBoard.Position;

public abstract class GameSpace {
    private static int count;
    private static ArrayList<GameSpace> list = new ArrayList<>();
    private Position position;
    public GameSpace(){
    }
//getters
public static int getCount() {
    return count;
}
    public Position getPosition() {
        return position;
     }
//setters
    public void setPosition(Position position) {
        this.position = position;
    }
    public static void setCount(int count) {
        GameSpace.count = count;
    }
//static
    public static ArrayList<GameSpace> list(){
        return list;
    }
//Override
    public boolean equals(Object o){
        return (this).getPosition().equals(((GameSpace)o).getPosition());
    }
}
