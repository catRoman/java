package weapons;
/**
 * interface to ensure weapon types fit within requirments for game logic
 */
public interface Weapon {
   /**used in combat equation
    * @returns assigned value of damage
    */
   public int getDamage();
   /**used in combat equation
    * @returns assigned value of hitChance
     */ 
   public float getHitChance();
   /**
    * @returns String representation of weapon class
    */
   public String getType();
   /**
    * @returns String representation of weapon class
    */
   public String toString();
}
