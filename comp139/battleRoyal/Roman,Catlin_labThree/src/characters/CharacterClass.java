package characters;

import java.util.ArrayList;
import java.util.List;

import collections.LinkedQueue;
/**
 * Framework for character creation
 */
public abstract class CharacterClass {
    public final int MAX_HEALTH;
    public final Double STRENGTH;
    public final float MERGE_CHANCE; // not implemented in this version
    public final float DOUBLE_STRIKE_CHANCE;
    protected LinkedQueue<String> charImage;
   
    //used to create game wide collection
   public static List<CharacterClass> availableCharacters = new ArrayList<>();

   /**
    * constructs all needed elements of a character
    * @param maxHealth sets max health of character
    * @param strength set strength multipliyer
    * @param mergeChance sets chance of combo merge
    * @param doubleStrikChance sets chance of double first strike
    */
   public CharacterClass(int maxHealth, 
                         double strength, 
                         float mergeChance, //not implemented in theis version
                         float doubleStrikeChance){
       
        this.MAX_HEALTH = maxHealth;
        this.STRENGTH = strength;
        this.MERGE_CHANCE = mergeChance;
        this.DOUBLE_STRIKE_CHANCE = doubleStrikeChance;
       
   }
   /**
    * Allows for image of character to be displayed
    * 
    *@return LinkedQueue<String> form to allow for 
    * image merging in game
    */
   public abstract LinkedQueue<String> getCharImage();

   /**
    * Displays intro text to console of a character specific
    * intro
    */
   public abstract void fightIntroLine();
    
   
}
