import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exercise4_15{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        char firstChar = letter.charAt(0);
        if(Character.isLetter(firstChar) != true || letter.length() > 1){
            System.out.println(letter + " is an invalid input"); 
            System.exit(1);
        }else if(Character.isLowerCase(firstChar)){
            firstChar -= 32;
        }
                   
        int number = 0;
        if(firstChar >= 'W')
        number = 9;
        else if (firstChar >= 'T')
        number = 8;
        else if (firstChar >= 'P')
        number = 7;
        else if (firstChar >= 'M')
        number = 6;
        else if (firstChar >= 'J')
        number = 5;
        else if (firstChar >= 'G')
        number = 4;
        else if (firstChar >= 'D')
        number = 3;
        else if (firstChar >= 'A')
        number = 2;
        else
                System.out.println("Error");

        
        System.out.println("The corresponding number is " + number); 
        
    
}

    }
