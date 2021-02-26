package gameSpaces.characters;

import weapons.Knife;

public class Enemy extends Actor{
    public Enemy(){

        setName("Enemy");
        setStartingWeapon(new Knife());
        setActorSymbol("!");
    }
}
