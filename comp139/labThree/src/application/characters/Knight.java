package application.characters;

import application.util.AsciiArt;

public class Knight extends CharacterClass{

    public Knight(){
        super(750, 0.2f,0.25f);//max health, mergechance, firststrikechance
        this.charImage = AsciiArt.getKnight();
    }
    public void fightIntroLine(){

       System.out.println("Im riding up to kick your ass!");
    }
    
}
