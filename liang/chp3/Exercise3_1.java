import java.util.Scanner;



public class Exercise3_1 {
   
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a, b, c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    double discriminant = (b * b)- (4 * a * c);
    double rootOne = (-(b) + Math.pow(discriminant, 0.5)) / 2 * a;
    double rootTwo = (-(b) - Math.pow(discriminant, 0.5)) / 2 * a;

    if (discriminant > 0){
        System.out.println("The equation has two roots " + rootOne + " and " + rootTwo);
    } else if (discriminant < 0){
        System.out.println("The equation has no real roots");
    } else{
        if (rootOne >= 0 || rootOne <= 0){
        System.out.println("The equation has one root " + rootOne);
        } else {
            System.out.println("The equation has one root " + rootTwo);
        }
    }

}
}
