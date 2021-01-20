import java.util.Scanner;

public class Exercise13_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double sideOne =input.nextInt();
        double sideTwo = input.nextInt();
        double sideThree = input.nextInt();
        System.out.print("Enter a color: ");
        String color = input.nextLine();
        boolean answered =false;
        boolean filled = false;
        do{
            System.out.println("Is it filled(y/n): ");
            String answer = input.nextLine();
            if(answer.matches("[yY]")){
                filled = true;
                answered = true;
            }else if(input.matches("[nN]")){
                answered =true;
            }else
                System.out.println("I do not understand, try again...");

        }while(!answered);

        Triangle myTri = new Triangle(sideOne, sideTwo, sideThree, color, filled);

        System.out.println(myTri.toString());
        System.out.println("Area: " + myTri.getArea);
        System.out.println("Perimeter: " + myTri.getPerimeter);
    }
}