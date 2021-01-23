/** Exercise 9 Chapter 13 Intro to Java by Liang
 * 
 * @author Cat Roman 2020-01-22
 * 
 * @see Comparable
 * @see Circle
 */
public class Exercise13_9{
    /**Test Driver */
    public static void main(String[] args){
        Circle myCircle1 = new Circle(10);
        Circle myCircle2 = new Circle(5);
        Circle myCircle3 = new Circle(10);

        System.out.println("myCircle1 radius: " + myCircle1.getRadius());
        System.out.println("myCircle2 radius: " + myCircle2.getRadius());
        System.out.println("myCircle1 compared to myCircle2: " + myCircle1.compareTo(myCircle2));
        System.out.println("myCircle1 equals to myCircle2: " + myCircle1.equals(myCircle2));
        System.out.println();


        System.out.println("myCircle1 radius: " + myCircle1.getRadius());
        System.out.println("myCircle3 radius: " + myCircle3.getRadius());
        System.out.println("myCircle1 compared to myCircle3: " + myCircle1.compareTo(myCircle3));
        System.out.println("myCircle1 equals to myCircle3: " + myCircle1.equals(myCircle3));
    }
}