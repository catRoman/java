package application.gameObjects;


import application.behaviors.weapons.MeleeWeapon;
import application.characters.CharacterClass;


public class Player {
    private CharacterClass character;
    private String name;
    private int strikePoints = 3;
    private int health;
    private Combo playerCombo;
    private MeleeWeapon weapon;
    private boolean isComputer;
    private AttackBehavior defaultAttack;
    
    public Player(boolean isComputer){
        this.isComputer = isComputer;
        this.character = CharacterClass.getCharacterChoice(((int)Math.random() * 5) + 1);
        this.name = getDefaultName();
        this.weapon = MeleeWeapon.getWeaponChoice(((int)Math.random() * 4) + 1);
    }
    public Player(String name, CharacterClass character, MeleeWeapon weapon, boolean isComputer){
        this.name = name;
        this.character = character;
        this.weapon = weapon;
        this.isComputer = isComputer;
        health = character.getHealth();
        
    }

    public String getDefaultName() {
        return name;
    }


}
