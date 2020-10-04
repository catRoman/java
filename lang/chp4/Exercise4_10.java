import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exercise4_10{
    public static void main(String[] args) {
        String set1 =   " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =   " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =   " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =   " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";
        
        String set5 =   "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";
        
        int day = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Is your birthday in set1?\n");
        System.out.println();
        System.out.print(set1);
        System.out.println();
        System.out.print("\nEnter N for No and Y for Yes: ");
        String answer = input.nextLine();

        answer = answer.trim();
        char character = answer.charAt(0);
        

        if(character == 'y' || character == 'Y')
            day += 1;
        else if(character == 'n' || character == 'N')
            day += 0;
        else{
            System.out.println("Play by the rules asshole");
            System.exit(1);
        }

            System.out.print("Is your birthday in set2?\n");
            System.out.println();
            System.out.print(set2);
            System.out.println();
            System.out.print("\nEnter 0 for No and 1 for Yes: ");
            answer = input.nextLine();

            answer = answer.trim();
            character = answer.charAt(0);
    
        if(character == 'y' || character == 'Y')
            day += 2;
        else if(character == 'n' || character == 'N')
            day += 0;
        else{
            System.out.println("Play by the rules asshole");
            System.exit(1);
        }

            System.out.print("Is your birthday in set3?\n");
            System.out.println();
            System.out.print(set3);
            System.out.println();
            System.out.print("\nEnter 0 for No and 1 for Yes: ");
            answer = input.nextLine();

            answer = answer.trim();
            character = answer.charAt(0);
        
        if(character == 'y' || character == 'Y')
             day += 4;
        else if(character == 'n' || character == 'N')
             day += 0;
         else{
             System.out.println("Play by the rules asshole");
             System.exit(1);
         }
        
             System.out.print("Is your birthday in set4?\n");
             System.out.println();
             System.out.print(set4);
             System.out.println();
             System.out.print("\nEnter 0 for No and 1 for Yes: ");
             answer = input.nextLine();

             answer = answer.trim();
             character = answer.charAt(0);
         
         if(character == 'y' || character == 'Y')
              day += 8;
        else if(character == 'n' || character == 'N')
              day += 0;
          else{
              System.out.println("Play by the rules asshole");
              System.exit(1);
          }
              System.out.print("Is your birthday in set5?\n");
              System.out.println();
              System.out.print(set5);
              System.out.println();
              System.out.print("\nEnter 0 for No and 1 for Yes: ");
              answer = input.nextLine();

              answer = answer.trim();
              character = answer.charAt(0);
          
          if(character == 'y' || character == 'Y')
               day += 16;
        else if(character == 'n' || character == 'N')
               day += 0;
           else{
               System.out.println("Play by the rules asshole");
               System.exit(1);
           }
        System.out.println("\nYour birthday is " + day + "!");


    }
}