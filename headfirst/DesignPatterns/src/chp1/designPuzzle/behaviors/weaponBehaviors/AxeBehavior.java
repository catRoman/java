package chp1.designPuzzle.behaviors.weaponBehaviors;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Smash! Slash! Its Axe Time!");
    }
    
}
