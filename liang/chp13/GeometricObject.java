

/** chapter 13 Intro to Java by Liang Exercise 1 
 * Creating abstract classes and abstract method implementation
 * 
 * @author Cat Roman 2020-01-20
 * 
 * @see Exercise13_1
 * @see Triangle
*/
public abstract class GeometricObject{
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

    /**Displays a string of parameters 
     * @return a sequiential list of the objects properties
    */
    @Override
    public String toString(){
        return "Color: " + this.color + "\nFilled: " + this.filled; 
    }

    /** @return Returns the area of the object dependant on its shape */
    public abstract double getArea();

    /** @return Returns the perimeter of an object dependant of its shape*/
    public abstract double getPerimeter();

}