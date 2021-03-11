package weapons;

import java.util.ArrayList;
import java.util.List;
/**
 * Melee Weapon class to be associated with melee style weapons
 */
public class MeleeWeapon implements Weapon{
    protected int damage;
    protected float hitChance;
    private String type;

     //used to create game wide collection 
    public static List<MeleeWeapon> availableWeapons = new ArrayList<>();
    /**
     * simple constructor add instantiated item to availableWeapon list
     * @param String type of weapon
     * @param damage dam,age weapon give when used
     * @param float hitchance of weapon
     */
    public MeleeWeapon(String type,int damage, float hitChance){
        this.damage = damage;
        this.hitChance = hitChance;
        this.type = type;
        availableWeapons.add(this);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public int getDamage() {
       return damage; 
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public float getHitChance() {
        return hitChance;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String getType(){
        return this.type;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString(){
        return getType();
    }
    
    
}
