package characters;

import collections.LinkedQueue;
import gameObjects.AsciiArt;
/**
 * Specific character creation class
 */
public class Troll extends CharacterClass{
  AsciiArt art = new AsciiArt();
    /**
     * creates troll and adds to available characters
     */
  public Troll(){
        super(150, 1.5, 0.2f, 0.4f);//max health, firstStrikeChance, mergeChance
        this.charImage = art.getTroll();
        availableCharacters.add(this);
    }
    /**
     * {@inheritDoc}
     */
    public void fightIntroLine(){
      System.out.println("Just because i live under a bridge doesnt mean i cant fight!");
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public LinkedQueue<String> getCharImage() {
        AsciiArt newArt = new AsciiArt();

        return newArt.getTroll();
    }
}