import javax.lang.model.util.ElementScanner14;

/** chapter 13 Intro to Java by Liang Exercise 1 
 * 
 * 
 * Exercise13_1 - Creating abstract classes and abstract method implementation
 * Exercise13_5 - Enable GeometricObject comparable
 * Exercise13_6 - The ComparableCircle class
 *      - commented out class implementation of Comparabale
 *      - commented out max()
 *      - commented out overriden compareTo()
 * 
 * @author Cat Roman 2020-01-20
 * @see Triangle
 * @see Rectangle
 * @see Circle
 * @see ComparableCircle
*/
public abstract class GeometricObject
   // implements Comparable<GeometricObject>
   {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;
    
    /** Constructs a default Geometric object with date created*/
    protected GeometricObject(){
        this.dateCreated = new java.util.Date();
    }

    /** Constructs a GeometricObject with date created and specified attributes
     * @param color The selected color of the object
     * @param filled The state of the objects main color
     */
    protected GeometricObject(String color, boolean filled){
        this();
        this.color = color;
        this.filled = filled; 
    }

    /** Simple Getter
     * @return The objects main color */
    public String getColor(){
        return this.color;
    }

    /** @param color The objects main color*/
    public void setColor(String color){
        this.color = color;
    }

    /** Simple Getter
     * @return The state of the objects main color */
    public boolean isFilled(){
        return this.filled;
    }

    /**Simple Setter
     * @param filled The state of the objects main color  */
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /**Returns the date when envoked
     * @return Date when object was initial created */
    public java.util.Date getDate(){
        return this.dateCreated;
    }

    /** @return Returns the area of the object dependant on its shape */
    public abstract double getArea();

    /** @return Returns the perimeter of an object dependant of its shape*/
    public abstract double getPerimeter();
      
    /** compares to Geometric objects area 
     * @param o the object to be compared
     * @param e anothe object to be compared
     * @return returns the larger of the two object, if equal returns initial object 
     *           
    */
/*
    public static GeometricObject max(GeometricObject o, GeometricObject e){
        if(o.compareTo(e) == 0)
            return o;
        else if(o.compareTo(e) > 0)
            return o;
        else
            return e;
    }
*/
    /**Compares area to determine overall size 
     * 
     * @see java.lang.Comparable
     * @return 1 for greater than, 0 for equals, -1 for less than
     */
/*
    @Override
    public int compareTo(GeometricObject o){
        if(this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() == o.getArea())
            return 0;
        else 
            return -1;
    }
*/
    /**Displays a string of parameters 
     * @return a sequiential list of the objects properties
    */
    @Override
    public String toString(){
        
        return "\tColor: " + this.color + "\n\tFilled: " + this.filled
                + "\n\tCreated on: " + this.dateCreated;
        
    }

}