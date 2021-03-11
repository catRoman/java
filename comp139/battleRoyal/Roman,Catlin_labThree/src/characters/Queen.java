package characters;

import collections.LinkedQueue;
import gameObjects.AsciiArt;
/**
 * Specific character creation class
 */
public class Queen extends CharacterClass{
    AsciiArt art = new AsciiArt();
    /**
     * creates queen and adds to available characters
     */
    public Queen(){
        super(300,1, 0.3f, 0.1f); //max health, firstStrikeChance, mergeChance
        this.charImage = art.getQueen();
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

        return newArt.getQueen();
    }
}