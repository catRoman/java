import java.util.Scanner;

public class Exercise4_14{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = input.next();
        int value = 0;
       grade = grade.toUpperCase();
        switch(grade.charAt(0)){
            case 'A': value = 4; break;
            case 'B': value = 3; break;
            case 'C': value = 2; break;
            case 'D': value = 1; break;
            case 'F': value = 0; break;
            default:{
            System.out.println(grade + " is an invalid grade");
                System.exit(1);
            }
        }
        System.out.println("The numeric value for the grade " + grade + " is " + value);
    }
}