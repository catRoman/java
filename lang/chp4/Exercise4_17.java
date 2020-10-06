import java.util.Scanner;

public class Exercise4_17 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        String month = input.nextLine();

        
        String month1 = month.toLowerCase();
        String monthName = "augotober";
        int monthDays = 0;
        
        switch(month1){
            case "jan": monthName = "January"; monthDays = 31; break;
            case "feb": monthName = "Feburary"; monthDays = 28; break;
            case "mar": monthName = "March"; monthDays = 31; break;
            case "apr": monthName = "April"; monthDays = 30; break;
            case "may": monthName = "May"; monthDays = 31; break;
            case "jun": monthName = "June"; monthDays = 30; break;
            case "jul": monthName = "July"; monthDays = 31; break;
            case "aug": monthName = "August"; monthDays = 31; break;
            case "sep": monthName = "September"; monthDays = 30; break;
            case "oct": monthName = "October"; monthDays = 31; break;
            case "nov": monthName = "November"; monthDays = 30; break;
            case "dec": monthName = "December"; monthDays = 31; break;
            default: System.out.println("Something went wrong...");
        }
        if((monthName.equals("Feburary")) && ((year / 4.0) % 1 == 0.0) && ((year/100.0) % 1 != 0)){
            monthDays += 1;
        }else if ((monthName.equals("Feburary")) && ((year / 4.0) % 1 == 0.0) && ((year/100.0) % 1 == 0) && ((year/400.0) % 1 == 0)){
            monthDays += 1;
        }
        
        System.out.println(monthName + " had " + monthDays + " days");
    }
}