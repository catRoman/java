/** Exercise 11 chapter 13 Intro to java by Liang
 * 
 * <ol>
 *      <li> Exercise13_11 - The Octagon class
 * </ol>
 * @author Cat Roman 2021-01-22
 * 
 * @see java.lang.Clonable
 * @see java.lang.Comparable
 * @see Octagon
 * @see GeometricObject
 */
public class Exercise13_11{
    /**Test Driver */
    public static void main(String[] ars){
        Octagon myOct = new Octagon(5);

        System.out.println("Original:");
        System.out.println(myOct.simpleString() + " area: " + myOct.getArea());
        System.out.println(myOct.simpleString() + " perimeter: " + myOct.getPerimeter());
        System.out.println();

    Octagon myClonedOct = (Octagon)myOct.clone();

    System.out.println("Cloned:");

    System.out.println(myClonedOct.simpleString() + " area: " + myClonedOct.getArea());
    System.out.println(myClonedOct.simpleString() + " perimeter: " + myClonedOct.getPerimeter());
        System.out.println();

   System.out.println("Comparisons:");
    System.out.println("myClonedOct comparedTo myOct: " + myClonedOct.compareTo(myOct));
    System.out.println("myClonedOct == myOct: " + (myClonedOct == myOct));


    }

}