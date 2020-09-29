import java.util.Scanner;

public class Exercise3_19 {

    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the three sides of a triangle: ");
        int sideA = input.nextInt();
        int sideB = input.nextInt();
        int sideC = input.nextInt();
        int perimeter = sideA + sideB + sideC;
        if(sideA != 0 && sideB != 0 && sideC != 0){
            if(sideA + sideB > sideC
                && sideB + sideC > sideA
                && sideC + sideA > sideB){
                System.out.println("The perimeter is " + perimeter);
            }
            else {
                System.out.println("The input is invalid");
            }
        }else{
         System.out.println("The input is invalid");
        }
    }
}