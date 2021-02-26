package weapons;

public class Axe extends Weapon{
    public Axe(){
        super(10,0, 0.5);
        setWeaponName("Axe");
    }
    @Override
    public String toString(){
        return "Axe";
    }

    
}
