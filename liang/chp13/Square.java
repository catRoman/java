/** Exercise 7 Chapter 13 Intro to Java by Liang 
 * 
 * Exercise13_7 - The Colorable Interface
 * 
 * @author Cat Roman 2020-01-22
 * 
 * @see Colarable
 * @see GeometricObject
*/
public class Square extends GeometricObject
    implements Colorable{
    private double side = 0;

    /**Construct a default square */
    public Square(){
    }

    /**Construct a square and instantiate variables*/
    public Square(double side){
        this.side = side;
    }

    /**Simple Getter 
     * @return sides in meters
    */
    public double getSides(){
        return this.side;
    }

    /**Simple Setter 
     * @param side in meters
    */
    public void setSides(double side){
        this.side = side;
    }

     /**{@inheritDoc}
    */
    @Override
    public String simpleString(){
        return "Square";
    }

    /**The area is calculated by multiplying the 
     * square of the sides.
     * 
     * Area = sides^2
     * @return the area in meters^2
     */
    @Override
    public double getArea(){
        return Math.pow(this.side, 2);
    }

    /**The perimeter is calculated by multiplying
     * the square by 4
     * 
     * Perimeter = sides * 4
     * 
     * @return the perimeter in meters
     */
    @Override
    public double getPerimeter(){
        return this.side * 4;
    }

    /** Instructions on how to color square
     * @return textual instructions
     */
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }

    /** {@inheritDoc} */
    @Override
    public String toString(){
        return "Square:\n\tSide: " + this.side + "\n" + super.toString();
    }

}