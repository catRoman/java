package chp1.designPuzzle.characters;


import chp1.designPuzzle.behaviors.WeaponBehavior;

public abstract class Character {
    
    private WeaponBehavior weapon;
    private final int MAX_HEALTH;
    private int health;

   public Character(int maxHealth, int initialHealth){
       MAX_HEALTH = maxHealth;
       this.health = initialHealth;
   } 
   public void setHealth(int health){
    this.health = health;
   }
   public void fight(){
            System.out.println("The " + this.getClass().getSimpleName() + " is in the fight!");
   }
   public void setWeapon(WeaponBehavior w) {
       this.weapon = w;
   }
}
