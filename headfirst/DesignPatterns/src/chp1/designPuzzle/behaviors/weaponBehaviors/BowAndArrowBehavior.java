package chp1.designPuzzle.behaviors.weaponBehaviors;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior{
    private int damage = 15;
    @Override
    public int useWeapon() {
        System.out.println("Pew Pew! Here comes the arrows!");
        return this.damage;
    }
    
}
