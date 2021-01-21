/**Chapter 13 Intro to Java by Liang Exercise 5 
 * 
 * Exercise13_5 - Enable GeometricObject comparability
 * Exercise13_6 - The comparableCircle class
 * 
 * @author Cat Roman 2020-01-20
 * 
 * @see GeometricObject
 * @see ComparableCircle
*/
public class Circle extends GeometricObject{

    private double radius;

    /**Constructs a default circle object */
    public Circle(){

    }

    /**Constructs an circle with an instance variable */
    public Circle(double radius){
        this.radius = radius;
    }

    /**Constructs a circle with super instances defined */
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    /** Simple Getter
     * @return the radius length in meters
    */
    public double getRadius(){
        return this.radius;
    }

    /**Simple Setter
     * @param radius the radius lenght in meters
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /** The area if calculated in meters squared from 
     * the following formula
     * 
     * Area = PI * radius^2
     * 
     * @see GeometricObject
     * 
     * @return the total area in meters squared*/
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }

    /**The perimeter(circumference) of the circle in meters 
     * is calculated by 
     * 
     * Circumference = 2 * PI * radius
     * 
     * @see GeometricObject
     * @return the circumference in meters
     */
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    /**{@inheritDoc} */
    @Override
    public String toString(){

            return "Circle:\n\tRadius: " + radius + "\n" + super.toString();
    
    }
}