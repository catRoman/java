package application.characters;

import application.util.AsciiArt;

public class King extends CharacterClass{
    public King(){
        super(1000,0.1f,0.1f); //max health, mergechance, firststrikechance
        this.charImage = AsciiArt.getKing();
    }
    public void fightIntroLine(){
       System.out.println("Lets do this!");
    }
    
}
