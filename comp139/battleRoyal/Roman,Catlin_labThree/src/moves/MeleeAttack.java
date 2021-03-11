package moves;

import java.util.ArrayList;
import java.util.List;
/**
 * class representing moves used by melee weapon holding players
 */
/**
 * 
 */
public class MeleeAttack implements Move {
    private float damageMultiplier;
    private float hitChanceMultiply;
    private String name;

    //used to create game wide collection
    public static List<MeleeAttack> availableAttacks = new ArrayList<>();
     /**
     * simple constructor adds instantiated item to availableAttacks list
     * @param String type of move
     * @param damage damage multiplier when used
     * @param float hitchance multiplier of move
     */
    public MeleeAttack(String name, float damageMultiplier, float hitChanceMultiply) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
        this.hitChanceMultiply = hitChanceMultiply;
        availableAttacks.add(this);
    }
    /**
     * @returns the damage multiplier of move
     */
    public float getDamageMultiplier() {
        return damageMultiplier;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public float getHitChanceMultiplier() {
        return hitChanceMultiply;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return this.name;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.name;
    }
        
    }

