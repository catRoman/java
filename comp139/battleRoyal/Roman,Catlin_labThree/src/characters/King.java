package characters;

import collections.LinkedQueue;
import gameObjects.AsciiArt;

/**
 * Specific character creation class
 */
public class King extends CharacterClass{
    AsciiArt art = new AsciiArt();
    
    /**
     * creates king and adds to available characters
     */
    public King(){
        super(300,1, 0.1f, 0.3f); //max health, firstStrikeChance, mergeChance
        this.charImage = art.getKing();
        availableCharacters.add(this);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void fightIntroLine(){
       System.out.println("Lets do this!");
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public LinkedQueue<String> getCharImage() {
        AsciiArt newArt = new AsciiArt();

        return newArt.getKing();
    }
    
}

