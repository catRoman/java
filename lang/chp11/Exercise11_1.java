public class Exercise11_1{
    public static void main(String[] args){
        Triangle myTri = new Triangle();
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter three sides of the triangle: ");
        myTri.setSide1(input.nextDouble());  
        myTri.setSide2(input.nextDouble());
        myTri.setSide3(input.nextDouble());

        System.out.println("Enter the color: ");
        myTri.setColor(input.next());
        input.nextLine();

        System.out.println("is it filled: ");
        myTri.setFilled(input.nextBoolean());

        System.out.println("Area: " + myTri.getArea());
        System.out.println("Perimeter: " + myTri.getPerimeter());
        System.out.println("color: " + myTri.getColor());
        System.out.println("is filled: " + myTri.isFilled());


    }
}