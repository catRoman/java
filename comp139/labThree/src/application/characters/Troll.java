package application.characters;

import application.util.AsciiArt;

public class Troll extends CharacterClass{
    
    public Troll(){
        super(500, 0.4f,0.35f);//max health, mergechance, firststrikechance
        this.charImage = AsciiArt.getTroll();
    }
    public void fightIntroLine(){
      System.out.println("Just because i live under a bridge doesnt make me homeless!");
    }
}
