package livingspace;

import exceptions.InvalidBathNumberException; 

/**Specific classification of the living space Apartment.
 * --->Insert a nice comment<-----
 * <p><b>Comp 139 - LabOne</b>
 * 
 * @author Catlin Roman - 2021-01-27
 * <ul>
 *  <li>@see LivingSpace
 *  <li>@see application.HousingApplicationFX
 * </ul>
 * 
 */
public class Apartment extends LivingSpace {
    private int rentFee;
    
    /**Default constructor, instantiates all parent class variables
     */
    public Apartment(String address, double baths, int bedRooms, int sqft, int rentFee)
            throws InvalidBathNumberException {
        super(address, baths, bedRooms, sqft);
        this.rentFee = rentFee;   
    }

//Setter Methods ---------------------------------------------------
    
    /**Simple Setter
     * @param rentFee the living spaces rental price in dollars
     */
    public void setRentFee(int rentFee){
        this.rentFee =rentFee;
    }
//Getter Methods -----------------------------------------------------
    
    
    /**Simple Getter
     * @return the living spaces rental price in dollars
     */
    public int getRentFee(){
        return this.rentFee;
    }
   
//Overridden Methods -------------------------------------------------
    
    /** {@inheritDoc}
     * @return a textual description of an apartment object
     */
    @Override
    public String toString(){
        return "Apartment:\n" + super.toString() + "rental fee: $" + this.rentFee;
    }

    
}
