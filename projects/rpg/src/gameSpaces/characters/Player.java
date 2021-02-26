package gameSpaces.characters;

import weapons.Axe;
import gameBoard.*;

public class Player extends Actor{
    public Player(){
       // setStartingBoard(startingBoard);
        setName("PlayerOne");
        setStartingWeapon(new Axe());
        setActorSymbol("@");
    }
    
}
