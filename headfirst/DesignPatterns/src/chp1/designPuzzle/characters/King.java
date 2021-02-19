package chp1.designPuzzle.characters;

import chp1.designPuzzle.behaviors.weaponBehaviors.KnifeBehavior;

public class King extends Character{
    public King(int intitalHealth){
        super(1000, intitalHealth);
        setWeapon(new KnifeBehavior());
    }
    public void fight(){
       super.fight();
       System.out.println("Lets do this!");

    }
}
