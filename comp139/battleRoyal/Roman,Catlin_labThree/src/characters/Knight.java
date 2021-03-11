package characters;

import collections.LinkedQueue;
import gameObjects.AsciiArt;
/**
 * Specific character creation class
 */
public class Knight extends CharacterClass{
    AsciiArt art = new AsciiArt();
    /**
     * creates knight and adds to available characters
     */
    public Knight(){
        super(150,1.5, 0.2f, 0.2f); //max health, firstStrikeChance, mergeChance
        this.charImage = art.getKnight();
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

        return newArt.getKnight();
    }
}
