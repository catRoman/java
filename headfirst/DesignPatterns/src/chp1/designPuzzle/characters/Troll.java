package chp1.designPuzzle.characters;

import chp1.designPuzzle.behaviors.weaponBehaviors.AxeBehavior;

public class Troll extends CharacterClass{
    
    public Troll(int intitalHealth){
        super(750, intitalHealth);
        setWeapon(new AxeBehavior());
    }
    public void fight(){
        super.fight();
      System.out.println("Just because i live under a bridge doesnt make me homeless!");
    }
}
