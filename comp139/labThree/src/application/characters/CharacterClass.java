package application.characters;




public abstract class CharacterClass {
    
   
    final int MAX_HEALTH;
    final float MERGE_CHANCE;
    final float FIRST_STRIKE_CHANCE;
    protected String charImage;
   
   public CharacterClass(int maxHealth, float mergeChance, float firstStrikeChance){
        this.MAX_HEALTH = maxHealth;
        this.FIRST_STRIKE_CHANCE = firstStrikeChance;
        this.MERGE_CHANCE = mergeChance;
               
   }
   public int getHealth(){
       return this.MAX_HEALTH;
   }
   public float getMergeChance() {
       return this.MERGE_CHANCE;
   }

   public float getFirstStrikeChance() {
       return this.FIRST_STRIKE_CHANCE;
   }
   public void chacterSelect(){
        System.out.println("The " + this.getClass().getSimpleName() + " is in the fight!");
    }
    @Override
    public String toString(){
        String info = "The " + this.getClass().getSimpleName() + " has a max health of " + this.MAX_HEALTH
                    + "\nA " + this.FIRST_STRIKE_CHANCE *100 + "% chance of first Strike and"
                    + "\nA " + this.MERGE_CHANCE*100 + "% chance of a merge Combo!"
                    + "\n";
        return info;
    }
    public abstract void fightIntroLine();

    public static CharacterClass getCharacterChoice(int choice){
        CharacterClass randCharacter = null;
        switch(choice){
            case 1: randCharacter = new King();
                    break;
            case 2: randCharacter = new Knight();
                    break;
            case 3: randCharacter = new Queen();
                    break;
            case 4: randCharacter = new Troll();
                    break;
            default: 
                System.out.println("RandomCharacter creation Error");
        }
        return randCharacter;
    }

    public String getImage() {
        return charImage;
    }

}
