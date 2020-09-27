import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();
    
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        System.out.println();
        
        int futureDay = 0; 
        if(today > 6){
            System.out.println("You probly think today is " + switchFunction(today) + "\n\n"
                                + "Next time pick a number from 0 to 6 with \n"
                                + "0 being sunday and 6 being saturday... mm Kay");
            System.out.println();
            System.exit(1);

        } else if (today <= 6 && today + elapsedDays <= 6){
            futureDay = today + elapsedDays;
         } else if (today <= 6 && today + elapsedDays > 6){
             futureDay = (today + elapsedDays) % 7; 
         }

         System.out.println("Today is " + switchFunction(today) + " and the "
                            + "future day is " + switchFunction(futureDay));
    System.out.println();
                        }
    public static String switchFunction(int a){
       String day = "Muesday";
        switch(a) {
            case 0: day = "Sunday"; break;
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wensday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            default: System.out.println("You must be retarded");    
        }
        return day;
    }
}