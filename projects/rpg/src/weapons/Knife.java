package weapons;

public class Knife extends Weapon{
    public Knife(){
        super(2, 0, .25);
        setWeaponName("Knife");
    }
    @Override
    public String toString(){
        return "Knife";
    }
    
}
