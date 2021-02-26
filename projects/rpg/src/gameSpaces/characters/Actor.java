package gameSpaces.characters;
import weapons.*;
import gameSpaces.GameSpace;

public abstract class Actor extends GameSpace{
   private String name;
   private int xp = 100;
   private int hp = 100;
   private int mp = 100;
   private Weapon startingWeapon;
   private String actorSymbol;

public Actor(){
        GameSpace.setCount(GameSpace.getCount() + 1);
        GameSpace.list().add(this);
}

//setters

public void setActorSymbol(String actorSymbol) {
    this.actorSymbol = actorSymbol;
}
public void setStartingWeapon(Weapon startingWeapon) {
    this.startingWeapon = startingWeapon;
}
public void setHp(int hp) {
    this.hp = hp;
}
public void setMp(int mp) {
    this.mp = mp;
}
public void setName(String name) {
    this.name = name;
}
public void setXp(int xp) {
    this.xp = xp;
}
//getters
public String getActorSymbol() {
    return actorSymbol;
}
public Weapon getStartingWeapon() {
    return startingWeapon;
}
public String getName() {
    return name;
}
public int getHp() {
    return hp;
}
public int getMp() {
    return mp;
}
public int getXp() {
    return xp;
}
//Overridden
public String toString(){
    return actorSymbol;
}

}