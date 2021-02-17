package chp1.designPuzzle.characters;

import chp1.designPuzzle.behaviors.WeaponBehavior;

public abstract class Character {
    
   private WeaponBehavior weapon;
   
   public Character(){} 
   
   public abstract void fight();

   public void setWeapon(WeaponBehavior w) {
       this.weapon = w;
   }
}
