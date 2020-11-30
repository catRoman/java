public class Exercise10_4{
    public static void main(String[] args){
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10,30.5);

        System.out.println("The distance between the two points is: " + myPoint1.distance(myPoint2));
    }
}