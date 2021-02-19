package chp1.designPuzzle.behaviors.weaponBehaviors;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    private int damage = 75; 
    @Override
    public int useWeapon() {
        System.out.println("Smash! Slash! Its Axe Time!");
        return this.damage;
    }
    
}
