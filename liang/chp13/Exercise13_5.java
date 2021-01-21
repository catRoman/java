/** Exersice 5 chapter 13 Intro to java by Liang
 * 
 * enable GeometricObject comparable
 * 
 * @see GeometricObject
 * @see Circle
 * @see Rectangle
 */
public class Exercise13_5{

    /**Test method main */
    public static void main(String[] args){
        Circle circleOne = new Circle(5);
        Circle circleTwo = new Circle(10);
        Circle circleThree = new Circle(5);

        Rectangle rectOne = new Rectangle(10, 5);
        Rectangle rectTwo = new Rectangle(20,5);
        Rectangle rectThree = new Rectangle(10,5);

        System.out.println("Compare circle 1 to 2:");
        System.out.println(GeometricObject.max(circleOne, circleTwo).toString());
        System.out.println();

        try{
            System.out.println("Compare circle 1 to 3:");
            System.out.println(GeometricObject.max(circleOne, circleThree).toString());
        }catch(NullPointerException ex){
            System.out.println("Circle Object is null");
        }finally{
            System.out.println();
        }

        System.out.println("Compare rectangle 1 to 2:");
        System.out.println(GeometricObject.max(rectOne, rectTwo).toString());
        System.out.println();

        try{
            System.out.println("Compare rectangle 1 to 3:");
            System.out.println(GeometricObject.max(rectOne, rectThree).toString());
        }catch(NullPointerException ex){
            System.out.println("Rectangle Object is null");
        }finally{
            System.out.println();
        }

    }
}