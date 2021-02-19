package chp1.designPuzzle.characters;

import chp1.designPuzzle.behaviors.weaponBehaviors.BowAndArrowBehavior;

public class Queen extends CharacterClass{

    public Queen(int intitalHealth){
        super(1000, intitalHealth);
        setWeapon(new BowAndArrowBehavior());
    }
    public void fight(){
        super.fight();
       System.out.println("It that time of the month... for some pain!");
    }
}
