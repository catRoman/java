package application.characters;

import application.util.AsciiArt;

public class Queen extends CharacterClass{
      

    public Queen(){
        super(1000, 0.1f,0.1f);//max health, mergechance, firststrikechance
        this.charImage = AsciiArt.getQueen();
    }
    public void fightIntroLine(){
       System.out.println("Im gonna write something clever!");
    }
}
