/** Exercise 10 Chapter 13 Intro to Java by Liang
 * 
 * @author Cat Roman 2020-01-22
 * 
 * @see Comparable
 * @see Rectangle
 */
public class Exercise13_10{
    /**Test Driver */
    public static void main(String[] args){
        Rectangle myRectangle1 = new Rectangle(10,7);
        Rectangle myRectangle2 = new Rectangle(5,10);
        Rectangle myRectangle3 = new Rectangle(10,7);

        System.out.println("myRectangle1 area: " + myRectangle1.getArea());
        System.out.println("myRectangle2 area: " + myRectangle2.getArea());
        System.out.println("myRectangle1 compared to myRectangle2: " + myRectangle1.compareTo(myRectangle2));
        System.out.println("myRectangle1 equals to myRectangle2: " + myRectangle1.equals(myRectangle2));
        System.out.println();


        System.out.println("myRectangle1 area: " + myRectangle1.getArea());
        System.out.println("myRectangle3 area: " + myRectangle3.getArea());
        System.out.println("myRectangle1 compared to myRectangle3: " + myRectangle1.compareTo(myRectangle3));
        System.out.println("myRectangle1 equals to myRectangle3: " + myRectangle1.equals(myRectangle3));
    }
}