import java.util.Scanner;

public class Exercise3_11{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month(1-12) and the year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        String monthName = "Tugustoberauray";
        int monthDays = 0;
        switch(month){
            case 1: monthName = "January"; monthDays = 31; break;
            case 2: monthName = "Feburary"; monthDays = 28; break;
            case 3: monthName = "March"; monthDays = 31; break;
            case 4: monthName = "April"; monthDays = 30; break;
            case 5: monthName = "May"; monthDays = 31; break;
            case 6: monthName = "June"; monthDays = 30; break;
            case 7: monthName = "July"; monthDays = 31; break;
            case 8: monthName = "August"; monthDays = 31; break;
            case 9: monthName = "September"; monthDays = 30; break;
            case 10: monthName = "October"; monthDays = 31; break;
            case 11: monthName = "November"; monthDays = 30; break;
            case 12: monthName = "December"; monthDays = 31; break;
            default: System.out.println("Something went wrong...");
        }
        if((monthName == "Feburary") && ((year / 4.0) % 1 == 0.0) && ((year/100.0) % 1 != 0)){
            monthDays += 1;
        }else if ((monthName == "Feburary") && ((year / 4.0) % 1 == 0.0) && ((year/100.0) % 1 == 0) && ((year/400.0) % 1 == 0)){
            monthDays += 1;
        }
        
        System.out.println(monthName + " had " + monthDays + " days");
    }
}