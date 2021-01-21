/**Chapter 13 Intro to java by Liang
 * 
 * Exercise13_6 - the ComparableCircle class
 * 
 * @author Cat Roman 2020-01-20
 * 
 * @see ComparableCircle
 * @see Circl
 * @see GeometricObject
 * @see java.lang.Comparable
 */
public class Exercise13_6{
    /**Test method main*/
    public static void main(String[] args){

        ComparableCircle cc1 = new ComparableCircle(5);
        ComparableCircle cc2 = new ComparableCircle(10);

        Circle c1 = new Circle(25);
        Rectangle r1 = new Rectangle(10,45);

        if(cc1.compareTo(cc2) > 0)
            System.out.println("cc1 is larger");
        else if (cc1.compareTo(cc2) < 0)
            System.out.println("cc2 is bigger");
        else    
            System.out.println("They are the same size");

        System.out.println();


        if(c1.getArea() > r1.getArea())
            System.out.println("c1 is larger than r1");
        else if (c1.getArea() < r1.getArea())
            System.out.println("r1 is larger than c1");
        else    
            System.out.println("They are the same size");

            System.out.println("c1: " + c1.getArea());
            System.out.println("r1: " + r1.getArea());
        }


    }
