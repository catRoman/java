import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exercise4_16{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Do you want a random capital letter ( type y for yes or n for no): ");
        

        boolean entry = true;
        String yesNo = "";
        while(entry){
        yesNo = input.nextLine();
        yesNo = yesNo.toUpperCase();
        if(Character.isLetter(yesNo.charAt(0)) && yesNo.length() == 1){
           
            if(yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'N'){
                
                entry = false;
            }else
           
            System.out.print("invalid entry, try again... ( type y for yes or n for no): ");
        
             
        }else{
            System.out.print("invalid entry, try again... ( type y for yes or n for no): ");
          
             

        }
       
    }
    if(yesNo.charAt(0)== 'Y')  {
        String randomLetter = "" + (char)((int)'A' + (int)(Math.random() * (((int)'Z'-(int)'A') / 2.0) + 1));
    System.out.println("Your random letter is " + randomLetter.toUpperCase());
    }else {
    System.out.println("see ya");
    System.exit(0);
    }
}
}