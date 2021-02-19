package chp1.designPuzzle.characters;


import chp1.designPuzzle.behaviors.WeaponBehavior;

public abstract class CharacterClass {
    
    private WeaponBehavior weapon;
    private final int MAX_HEALTH;
    private int health;

   public CharacterClass(int maxHealth, int initialHealth){
       this(maxHealth);
       this.health = initialHealth;
   } 
   public CharacterClass(int maxHealth){
        this.MAX_HEALTH = maxHealth;
        health = maxHealth;        
   }
   public void setHealth(int health){
    this.health = health;
   }
   public int getHealth(){
       return this.health;
   }
   public void fight(){
            System.out.println("The " + this.getClass().getSimpleName() + " is in the fight!");
   }
   public void setWeapon(WeaponBehavior w) {
       this.weapon = w;
   }
   public WeaponBehavior getWeapon(){
       return this.weapon;
   }
}
