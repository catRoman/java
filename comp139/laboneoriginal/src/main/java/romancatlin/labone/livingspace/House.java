package romancatlin.labone.livingspace;

import java.math.BigInteger;

import labone.exceptions.InvalidBathNumberException;

/**Specific classification of the living space House.
 * --->Insert a nice comment<-----
 * <p><b>Comp 139 - LabOne</b>
 * 
 * @author Catlin Roman - 2021-01-27
 * <ul>
 *  <li>@see LivingSpace
 *  <li>@see labone.application.HousingApplicationFX
 *  <li>@see java.math.BigInteger
 * </ul>
 * 
 */
public class House extends LivingSpace {
    private BigInteger housePrice;

    /**Default House Constructor, 
     * instantiates all parents variables */
    public House(String address, double baths, int bedRooms, int sqft, String housePrice)
        throws InvalidBathNumberException{
        super(address, baths, bedRooms, sqft);
        this.housePrice = new BigInteger(housePrice);
    }

//Setter Methods ---------------------------------------

    /**Simple setter
     * reassigns housePrice reference to new BigInteger value
     * @param housePrice the price of house in dollars
     */
    public void setHousePrice(String housePrice){
        this.housePrice = new BigInteger(housePrice);
    }

//Getter Methods ----------------------------------------

    /**Simple Getter.
     * Since BigInteger is immutable a clone 
     * is not required to ensure encapsulation
     * @return house price in dollars
    */
    public BigInteger getHousePrice(){
        return this.housePrice;
    }

//Override Methods ---------------------------------------

    /**{@inheritDoc}*/
    public String toString(){
        return "House\n" + super.toString() + "price: $" + housePrice + ".00";
    }
}