/** Exercise 12 Chapter 13 Intro to Java by Liang 
 * 
 * <ol>
 *      <li>Exercise13_12 - Sum the area of geometric objects
 * </ol>
 * 
 * @author Cat Roman 2021-01-22
 * @see GeometricObject
*/
public class Exercise13_12{
    /**Test Driver */
    public static void main(String[] args){
        GeometricObject[] myList = {new Triangle(3,4,5), new Octagon(5), new Square(8), new Rectangle(5,70), new Circle(3)};

        for(GeometricObject e : myList){
            System.out.println(e.simpleString() + ": " + e.getArea());
        }
        System.out.println();

        System.out.println("The sum is :" + sumArea(myList));

    }
    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for(GeometricObject e : a){
            sum += e.getArea();
        }
        
        return sum;

    }
}