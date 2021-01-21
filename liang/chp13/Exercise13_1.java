import java.util.Scanner;
/** Exercise 1 from chapter 13 of intro to java by liang.
 * Test code for abstract class GeometricObject and Triangle construction
 * @author Cat Roman 2020-01-20
 * @see GeometricObject
 * @see Triangle
 * 
 */
public class Exercise13_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double sideOne =input.nextInt();
        double sideTwo = input.nextInt();
        double sideThree = input.nextInt();
        input.nextLine();
        System.out.print("Enter a color: ");
        String color = input.nextLine();
        boolean answered =false;
        boolean filled = false;
        do{
            System.out.print("Is it filled(y/n): ");
            String answer = input.nextLine();
            if(answer.matches("[yY]")){
                filled = true;
                answered = true;
            }else if(answer.matches("[nN]")){
                answered =true;
            }else
                System.out.println("I do not understand, try again...");

        }while(!answered);

        Triangle myTri = new Triangle(sideOne, sideTwo, sideThree, color, filled);

        System.out.println(myTri.toString());
        System.out.println("Area: " + myTri.getArea());
        System.out.println("Perimeter: " + myTri.getPerimeter());
    }
}