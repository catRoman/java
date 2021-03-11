package gameObjects;

import characters.CharacterClass;
import exceptions.EmptyQueueException;
import moves.MeleeAttack;
import weapons.MeleeWeapon;
import weapons.Weapon;
/**
 * Holds player specific attributes based on choice selection from game
 */
public class Player {
    private String name;
    private int health;
    private double strength;
    private CharacterClass character;
    private Weapon weapon;
    private int strikePoints = 3;
    private Combo combo;
    private boolean isComp;
    private boolean yourTurn;
    
    /**
     * no arg constructor creates computer opponent with random character and weapon selection
     */
    public Player(){
        this("Hal", 
        CharacterClass.availableCharacters.get(
            (int)(Math.random() * CharacterClass.availableCharacters.size())), 
        MeleeWeapon.availableWeapons.get(
            (int)(Math.random() * MeleeWeapon.availableWeapons.size())), 
        true);
    }
    /**
     * creates custom player based on selected attributes
     */
    public Player(String name, CharacterClass character, Weapon weapon, boolean isComp){
        this.character = character;
        this.weapon = weapon;
        this.name = name;
        strength = character.STRENGTH;
        health = character.MAX_HEALTH;
        combo = new Combo();
        this.isComp = isComp;
    }
   /**
    * preforms moves based on number of items in combo
    */
    public void comboAttack(){
        while(combo.getNumberOfMoves() > 0){
            try{
                attack((MeleeAttack)combo.useMove());
            }catch(EmptyQueueException ex){
                System.out.println("No more moves!");
            }
        }
    }
    /**
     * preforms attack of specific meleeattack
     * determines if is a hit or miss
     * adds strike point or resets based on hit/miss
     * @return int representing damge amount to inflict
     */
    public int attack(MeleeAttack attackType){
        MeleeAttack attack = attackType;
        int attackDamage;
        double damage = this.strength * (this.weapon.getDamage() * attack.getDamageMultiplier());
        float hitChance = this.weapon.getHitChance() * attack.getHitChanceMultiplier();
        
   
        if(Util.useChance(hitChance)){
            attackDamage = (int)damage;
            strikePoints++;
            System.out.println("\t"+attack.getName() +" HIT's! Delivering " + attackDamage + " Damage! "
                    + " + 1 STRIKEPOINTS!");
        }else{
            attackDamage = 0;
            strikePoints = 1;
            System.out.println("\t" + attack.getName() + " MISSES!"
                    + " STRIKEPOINTS reset!");
        }

        return attackDamage;
    }
    /**
     * returns players health
     * @return players health
     */
    public int getHealth(){
        return health;
    }
    /**
     * inflicts damage by reducing health by damage value
     * @param int damage in int
     */
    public void takeDamage(int damage){
        health = health - damage;
    }
    /**
     * returns the number of strikepoints the player currently has
     * @return players stikepoints
     */
    public int getStrikePoints(){
        return this.strikePoints;
    }
    /**
     * returns the players name
     * @returns the players name
     */
    public String getName(){
        return this.name;
    }
    /**
     * returns the players character type
     * @returns string representaion of the plyaers characterclass type
     */
    public String getCharacterClassType(){
        return character.getClass().getSimpleName();
    }
    /**
     * represent whether the player has any health left
     * @returns true if players health is above zero, false if below
     */
    public boolean isAlive(){
        if(this.health > 0)
            return true;
    
        return false;
    }
    /**
     * returns the players combo
     * @returns the players combo
     */
    public Combo getCurrentCombo(){
        return combo;
    }
    /**
     * sets the players combo
     * @param Combo sets the players current combo
     */
    public void setCurrentCombo(Combo combo){
        this.combo = combo;
    }/**
     * sets the number strikpoints the players has
     * @param int representing number of strike points to add
     */
    public void setStrikePoints(int points){
        this.strikePoints = points;
    }
    /**
     * shows whether it is currently the players turn
     * @returns true if it is the players turn; false if not
     */
    public boolean isTurn(){
        return yourTurn;
    }
    /**
     * sets whether its the player turn
     * @param boolean true if it is players turn; false if not
     */
    public void setTurn(boolean isTurn){
        yourTurn = isTurn;
        
    }
    /**
     * returns the players characterClass
     * @returns CharacterClass of the players 
     */
    public CharacterClass getPlayersCharacter(){
        return this.character;
    }
    /**
     *  indicates if player is computer controlled or not
     * @returns true if computre; false if humabn
     */
    public boolean isComputer(){
        return isComp;
    }
    /**
     * returns the players weapon type in string
     * @returns String representation of players weapon
     */
    public String getWeaponType(){
        return this.weapon.getType();
    }
    

}
