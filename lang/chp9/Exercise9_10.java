import java.util.Scanner;

public class Exercise9_10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the values for a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation myEqn = new QuadraticEquation(a, b, c);

        if(myEqn.getDiscriminant() > 0 ){
            System.out.println("Root one: " + myEqn.getRoot1());
            System.out.println("Root Two: " + myEqn.getRoot2());
        }else if(myEqn.getDiscriminant() == 0){
            System.out.println("Root one: " + myEqn.getRoot1());
        }else
            System.out.println("The equation has no roots");

    }
}