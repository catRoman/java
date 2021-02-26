import gameBoard.*;
import gameSpaces.characters.*;

public class TestDriver {
    public static void main(String[] args) throws Exception {

        Player playerOne = new Player();
        Player playerTwo = new Player();

        playerOne.setActorSymbol("C");
        playerTwo.setActorSymbol("L");
        Enemy enemyOne = new Enemy();
        Enemy enemyTwo = new Enemy();
        Enemy enemyThree = new Enemy();
        
        
       
        Board newBoard = new Board(10);


        playerOne.setPosition(new Position(newBoard, 0, 0));
        playerTwo.setPosition(new Position(newBoard, 0, 0));
        enemyOne.setPosition(new Position(newBoard));
        enemyTwo.setPosition(new Position(newBoard));
        enemyThree.setPosition(new Position(newBoard));
        newBoard.initBoard();
        newBoard.printBoard();       

    }
}
