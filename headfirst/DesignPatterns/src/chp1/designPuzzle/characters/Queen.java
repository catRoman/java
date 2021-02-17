package chp1.designPuzzle.character;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public class Queen extends Character{
    @Override
    public void setWeaponBehavior(WeaponBehavior weapon) {
        super.setWeaponBehavior(weapon);
    }
    public void fight(){
        weapon.useWeapon();
    }
}
