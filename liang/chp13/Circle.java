/**Chapter 13 Intro to Java by Liang Exercise 5 
 *<ol> 
 *      <li>Exercise13_5 - Enable GeometricObject comparability
 *      <li>Exercise13_6 - The comparableCircle class
 *      <lil>Exercise13_9 - Enable Circle Comparable
 * </ol>
 * @author Cat Roman 2020-01-20
 * 
 * @see GeometricObject
 * @see ComparableCircle
 * @see Comparable
*/
public class Circle extends GeometricObject
  implements Comparable<Circle>
  {

    private double radius;

    /**Constructs a default Circle object */
    public Circle(){

    }

    /**Constructs an Circle with an instance variable */
    public Circle(double radius){
        this.radius = radius;
    }

    /**Constructs a Circle with super instances defined */
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

     /**{@inheritDoc}
    */
    @Override
    public String simpleString(){
        return "Circle";
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

    /**The perimeter(circumference) of the Circle in meters 
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

            return "Circle:\n\tradius: " + radius + "\n" + super.toString();
    
    }
    /**compares the radius
     * @return -1 if compared Circle radius is less than this.Circle
     *  0 if radius is equal and 1 is compared Circle radius is greater*/
    @Override
    public int compareTo(Circle o){
        if(this.radius > o.radius)
            return 1;
        else if(this.radius < o.radius)
            return -1;
        else
            return 0;
        
    }

    /**@return true whether or not radius are equal */
    @Override
    public boolean equals(Object o){
        if(this.compareTo((Circle)o) == 0){
            return true;
        }
        
        return false;
    }
}