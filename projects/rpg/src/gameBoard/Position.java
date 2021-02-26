package gameBoard;

import exceptions.*;
import java.util.ArrayList;

public class Position {
    private CoordinatePair coordinates;
    private Board currentBoard;
    private static ArrayList<Position> positionList = new ArrayList<>();
    
    public Position(Board currentBoard,int x, int y){
        this.currentBoard = currentBoard;
        coordinates = new CoordinatePair(x, y);
        
        try{
                for(Position e : Position.list())
                    if(this.equals(e))
                        throw new InvalidActorPlacement("Coordinates already exist");
                        
                    
                setX(x);    
                setY(y);
                Position.list().add(this);
        }catch(InvalidActorPlacement ex){
            System.out.println(ex);
        }
    }
    public Position(Board currentBoard){
        this(currentBoard,
            (int)(Math.random() * currentBoard.getSize()), 
            (int)(Math.random() * currentBoard.getSize()));

    }
// getters
    public int getX() {
        return coordinates.getX();
    }
    public int getY() {
        return coordinates.getY();
    }
    public CoordinatePair getCoordinates() {
        return coordinates;
    }
//setters
    public void setX(int x) 
        throws InvalidActorPlacement{
        if(x > currentBoard.getSize())
            throw new InvalidActorXCoordinate();
        else
            coordinates.setX(x);
    }
    public void setY(int y) 
        throws InvalidActorPlacement{
        if(y > currentBoard.getSize())
            throw new InvalidActorYCoordinate();
        else
            coordinates.setY(y);
    }
//Overriden
    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Position)){
            return false;
        }
        Position p = (Position) o;

        return Integer.compare(this.getX(), p.getX()) == 0
            && Integer.compare(this.getY(), p.getY()) == 0;
    }
//static
    public static ArrayList<Position> list() {
        return positionList;
    }
}
