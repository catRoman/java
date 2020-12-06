public class Exercise10_13{
    public static void main(String[] args){
        MyRectangle2D r1 = new MyRectangle2D(2,2, 5.5, 4.9);

        System.out.println("contains: " + r1.contains(3,3));
        System.out.println("contains: " + r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println();
        System.out.println("overlaps: " + r1.contains(new MyRectangle2D(3,5,2.3,5.4)));

    }
}