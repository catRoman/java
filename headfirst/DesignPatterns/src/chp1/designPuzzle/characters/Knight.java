package chp1.designPuzzle.characters;

import chp1.designPuzzle.behaviors.weaponBehaviors.SwordBehavior;

public class Knight extends CharacterClass{

    public Knight(int intitalHealth){
        super(750, intitalHealth);
        setWeapon(new SwordBehavior());
    }
    public void fight(){

       System.out.println("Im riding up to kick your ass!");
    }
    
}
