package characters;

import collections.LinkedQueue;
import gameObjects.AsciiArt;
/**
 * Specific character creation class
 */
public class Lisa extends CharacterClass{
    AsciiArt art = new AsciiArt();
    /**
     * creates lisa and adds to available characters
     */
    public Lisa(){
        super(500,2, 0.5f, 0.5f); //max health, firstStrikeChance, mergeChance
        this.charImage = art.getLisa();
        availableCharacters.add(this);
    }
   
    /**
     * {@inheritDoc}
     */
    @Override
    public LinkedQueue<String> getCharImage() {
        AsciiArt newArt = new AsciiArt();

        return newArt.getLisa();
    }

      /**
     * {@inheritDoc}
     */
    @Override
    public void fightIntroLine(){
       System.out.println("Howdy ho! Lets Go!");
    }
}