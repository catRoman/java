import java.util.Scanner;

public class Exercise4_18{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String characterString = input.nextLine();

        characterString = characterString.toUpperCase();
        String major = "";

     if((characterString.charAt(0) == 'M'
        || characterString.charAt(0) == 'C'
        || characterString.charAt(0) == 'I')
        && (Integer.parseInt(characterString.substring(1)) >= 1
        && Integer.parseInt(characterString.substring(1)) <= 4)){

       switch(characterString.charAt(0)){
           case 'M': major = "Mathematics"; break;
           case 'C': major = "Computer Science"; break;
           case 'I': major = "Information Technology"; break;
           default: major = "Error"; break;
       }

       String status = "";
       switch(Integer.parseInt(characterString.substring(1))){
           case 1: status = "Freshman"; break;
           case 2: status = "Sophmore"; break;
           case 3: status = "Junior"; break;
           case 4: status = "Senior"; break;
           default: status = "error"; break;
       }

       System.out.printf("%s %s\n", major, status);
    } else{
        System.out.println("invalid input");
    }
    }
}