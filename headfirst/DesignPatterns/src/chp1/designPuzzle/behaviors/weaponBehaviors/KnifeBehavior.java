package chp1.designPuzzle.behaviors.weaponBehaviors;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior{
    private int damage = 25;
    @Override
    public int useWeapon() {
        System.out.println("Stabby Stabby! Here come the knife!");
        return this.damage;
    }
    
}
