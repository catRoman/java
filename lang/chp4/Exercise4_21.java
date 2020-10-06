import java.util.Scanner;

public class Exercise4_21{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Sin(***-***-***): ");
        String sin = input.nextLine();

        if((sin.length() == 11 && sin.charAt(3) == '-' && sin.charAt(7) == '-')){
            if (numberCheck(sin.substring(0, 3)) && numberCheck(sin.substring(4, 7)) && numberCheck(sin.substring(8)))
            System.out.println(sin + " is a valid social insurance number");
        } else
        System.out.println( sin + " is an invalid number");

    }
    public static boolean numberCheck(String sequence){
        boolean isDigit = true;
        for(int i = 0; i < sequence.length(); i++){
            isDigit = isDigit && Character.isDigit(sequence.charAt(i));
        }
        return isDigit;

        
    }
}