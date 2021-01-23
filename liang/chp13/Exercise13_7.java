/** Exercise 7 Chapter 13 Intro to java by Liang
 * 
 * Exercise13_7 - The colorable interface
 * 
 * @author Cat Roman 2020-01-22
 * 
 * @see GeometricObject
 * @see Colorable
 * @see Square
 * 
 */
public class Exercise13_7{
    /**Test Driver */
    public static void main(String[] args){
        GeometricObject[] myList = {new Triangle(3,4,5),
                                    new Square(7),
                                    new Circle(5), 
                                    new Rectangle(3,6), 
                                    new Square(5)};

        for(GeometricObject e : myList){
            System.out.println(e.simpleString() + " Area: " + e.getArea());
            if(e instanceof Colorable){
                System.out.print("\t");
                ((Colorable)e).howToColor();
            }
        }
    }
}