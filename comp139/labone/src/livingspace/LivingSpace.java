package livingspace;

import exceptions.InvalidBathNumberException;

/**LivingSpace acts as a framework for various living space units.
 * --->Insert a nice comment<-----
 * 
 * <p><b>Comp 139 - LabOne</b>
 * 
 * @author Catlin Roman - 2021-01-27
 * <ul>
 *  <li>@see House
 *  <li>@see Apartment
 *  <li>@see labone.application.HousingApplicationFX
 * </ul>
 * 
 * @exception exception.InvalidBathNumberException
 * 
 */
public abstract class LivingSpace {
    protected String address;
    protected double baths;
    protected int bedRooms;
    protected int sqft;
    
    /**Construct a default Living space 
     * @throws InvalidBathNumberException
    */
    public LivingSpace(String address, double baths, int bedRooms, int sqft) 
        throws InvalidBathNumberException {
        this.address = address;
        this.bedRooms = bedRooms;
        this.sqft = sqft;
        setBaths(baths);
    }

// Setter Methods -------------------------------------------

    /**Simple Setter.
     * <p><b>Usage:</b> [<i>apt no.</i>]-[<i>street no.</i>] [<i>street name</i>], [<i>city</i>], [<i>province</i>], [<i>postal code</i>]
     * <p><b>Example:</b> <i>"123-9876 Douglas st, Victoria, BC, V4R5S2"
     * @param address the livingSpaces full address
     */
    public void setAdress(String address){
        this.address = address;
    }

    /**Simple Setter.
     * for half size baths use decimal
     * <p><b>Example:</b> A unit with one and a half bath would be represented by <i>1.5</i>
     * @param baths no. of baths in unit
     * @throws InvalidBathNumberException
     */
    public void setBaths(double baths)
        throws InvalidBathNumberException{
        if(baths >= 0.5)
            this.baths = baths;
        else
            throw new InvalidBathNumberException("Must have at least a half bath.");
    }

    /**Simple Setter.
     * @param bedRooms no. of bed rooms in unit
    */
    public void setBedRooms(int bedRooms){
        this.bedRooms = bedRooms;
    }

    /**Simple  Setter.
     * @param sqft total square feet of unit rounded to nearest m&#xB2 
    */
    public void setSqft(int sqft){
        this.sqft = sqft;
    }

//Getter Methods -------------------------------------------------

     /**Simple Getter.
      * <p><b>Example:</b> <i>"123-9876 Douglas st, Victoria, BC, V4R5S2"
      * @return the livingSpaces full address
     */
     public String getAddress(){
        return this.address;
    }

    /**Simple Getter. 
     * For half size baths use decimal
     * <p><b>Example:</b> A unit with one and a half bath would be represented by <i>1.5</i>
     * @return no. baths in unit
    */
    public double getBaths(){
        return this.baths;
    }

    /**Simple Getter
     * @return no. of bed rooms in unit
     */
    public int getBedRooms(){
        return this.bedRooms;
    }

    /**Simple Getter.
     * @return total square feet of unit rounded to nearest m&#xB2 
     */
    public int getSqft(){
        return this.sqft;
    }

//Overridden Methods ---------------------------------------

    /**Formated textual representation of the living space
     * With livingSpace Type and price implemented by child class if 
     * available
     * 
     * <p><b>Example:</b>
     * 
     * <ul style="list-style-type:none;">     
     *      <li>Shack
     *      <li>address: 123-9876 Douglas st, Victoria, BC, V4R5S2
     *      <li>baths: 1.5
     *      <li>bedrooms: 4
     *      <li>sqft: 57 m&#xB2 
     * </ul>
     */
    @Override
    public String toString(){
        return String.format("adress: %s\nbaths: %f\nbedrooms: %d\nsqft: %d m\u00B2\n",
                            address, baths, bedRooms, sqft); 
    }
    
} 