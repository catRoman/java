package gameBoard;
import java.util.Arrays;

import gameSpaces.*;
public class Board{

    private int size;
    private GameSpace[][] gameBoard;

    public Board(int size){
        this.size = size;
        gameBoard =  new GameSpace[size][size];
    }
    public void initBoard(){
    for(int i =0;i < gameBoard.length; i++)
            for(int j = 0; j < gameBoard[i].length; j++){
                gameBoard[i][j] = new EmptySpace();
                if(GameSpace.list().size() > 0)
                    for(GameSpace e : GameSpace.list())
                        if(e.getPosition().getX() == i && e.getPosition().getY() == j)
                            gameBoard[i][j] = e;
            }     
    }

    public void printBoard(){
        for(int i = 0; i < gameBoard.length; i++){
            System.out.println(Arrays.toString(gameBoard[i]));
        }
    }

//getters
public int getSize() {
    return size;
}

}
