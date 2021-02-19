package chp1.designPuzzle.behaviors.weaponBehaviors;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior{
    private int damage = 50;
    @Override
    public int useWeapon() {
        System.out.println("Swinging Sword!");
        return damage;
    }
    
}
