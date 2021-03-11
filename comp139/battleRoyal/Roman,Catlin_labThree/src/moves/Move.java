package moves;
/**
 * Move interface used for ensuring moves used in combo will fit with game logic
 */
public interface Move {
    /**
     * a chance mutliplier used in combat chance equation
     * @return float signifing chance multiplication
     */
    public float getHitChanceMultiplier();
    /**
     * @returns string of representing moves name
     */
    public String getName(); 
    /**
     * @returns string of representing moves name
     */
    public String toString();
    
}
