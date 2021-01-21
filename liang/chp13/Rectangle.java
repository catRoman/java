/**Chapter 13 Intro to Java by Liang Exercise 5 
 * 
 * Exercise13_5 - Enable GeometricObject comparability
 * 
 * @author Cat Roman 2020-01-20
 * 
 * @see GeometricObject
*/
public class Rectangle extends GeometricObject{
    private double length;
    private double height;

    /**Constructs a defualt Recatngle */
    public Rectangle(){

    }

    /**Constructs a rectangle with class instance variables */
    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    /**Constructs a Rectangle with all instances variables(including supers) set */
    public Rectangle(double length, double height, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.height = height;
    }

    /**Simple Getter
     * @return the length in meters
     */
    public double getLength(){
        return this.length;
    }

    /**Simple Setter
     * @param length measured in meters
     */
    public void setLength(double length){
        this.length = length;
    }

    /**Simple Getter
     * @return the height in meters
     */
    public double getHeight(){
        return this.height;
    }

    /**Simple Setter
     * @param height measured in meters
     */
    public void setHeight(double height){
        this.height = height;
    }

    /**The area is calculated in meters by the following formula
     * 
     * Area = length * height
     * 
     * @see GeometricObject
     * @return area in meters
     */
    public double getArea(){
        return this.height * this.length;
    }

    /**The perimeter is calculated in meters by the following formula
     * 
     * Perimeter = (2 * height) + (2 * length)
     * 
     * @see GeometricObject
     * 
     */
    public double getPerimeter(){
        return (2 * this.height) + (2 * this.length);
    }

    /** {@inheritDoc} */
    public String toString(){
        return "Rectangle:\n\tHeigth: " + this.height + "\n\tLength: " 
                + this.length + "\n" + super.toString();
    } 

}