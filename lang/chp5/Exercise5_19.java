import java.util.Scanner;

public class Exercise5_19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How deep we going here(how many iterations): ");
        int iteration = input.nextInt();
        input.nextLine();
        System.out.print("Would you like to see the pattern? ");
        String answer = input.nextLine();
        System.out.println();
        String regExYes = "yYyesYesYES";

        if(regExYes.contains(answer)){
            for(int i = 1, rowCount = 1; i <= Math.pow(2,iteration); i += i, rowCount++){
                //whitespaces
                for(int numberOfWhiteSpaces = 1; numberOfWhiteSpaces <= iteration - (rowCount-1); numberOfWhiteSpaces++){
                   if(iteration > 9)
                   System.out.printf("%6s"," ");
                   else
                    System.out.printf("%4s"," ");
                }
                for(int j = 1; j<=i; j+=j){
                    if(iteration > 9)
                    System.out.printf("%6d",j);
                    else
                    System.out.printf("%4d",j);
                }
           
                for(int j =(int)Math.pow(2,rowCount-2); j>=1;j /=2){
                    if(iteration > 9)
                    System.out.printf("%6d",j);
                    else
                    System.out.printf("%4d",j);
                }
                System.out.println();
            }
        }else{
            System.out.println("Alright...");
            System.exit(0);
        }
    }
}