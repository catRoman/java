


import java.util.Scanner;

public class Exercise5_28{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year(mon = 1 ... sun ->7): ");
        int day = input.nextInt();
        
       
       

       // System.out.printf("%s 1, %d is %s\n", getMonth(1),year,getDay(day));
       for(int i=1; i<=12; i++){
           System.out.printf("%s 1, %d is %s\n", getMonth(i),year,getDay(getFirstOfMonth(i, day, year)));

       }
    }
    public static String getMonth(int monthNum){
        String tempMonth = "";
        switch(monthNum){
            case 1: tempMonth = "January"; break;
            case 2: tempMonth = "Feburary"; break;
            case 3: tempMonth = "March"; break;
            case 4: tempMonth = "April"; break;
            case 5: tempMonth = "May"; break;
            case 6: tempMonth = "June"; break;
            case 7: tempMonth = "July"; break;
            case 8: tempMonth = "August"; break;
            case 9: tempMonth = "September"; break;
            case 10: tempMonth = "October"; break;
            case 11: tempMonth = "November"; break;
            case 12: tempMonth = "December"; break;
            default: tempMonth = "Sleptrembury"; break;
        }
        return tempMonth;
    }
    public static int getFirstOfMonth(int month, int day, int year){
    
       int daysInMonth = 0;
       month = month -1;
       for(int i = 1; i <= month; i++){
     
          
            daysInMonth = daysInMonth(i, year);
                
                day += daysInMonth;
            
            }
            day = day % 7;
           
           
        return day;
    }


public static String getDay(int day){
    String dayName = "";   
    switch(day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wensday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 0: dayName = "Sunday"; break;
            default: dayName = "Tursday"; break;
        }
        
        return dayName;
    }
    public static boolean leapYearFunction(int year){
     return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; 
    }
    public static int daysInMonth(int i, int year){
      int daysInMonth = -1;
    if(i == 0)
    daysInMonth = 0;
    else if(i == 1
       || i == 3
       || i == 5
       || i == 7
       || i == 8
       || i == 10
       || i == 12){
      daysInMonth = 31;  
        
    }else if(i == 4
            || i == 6
            || i == 9
            || i == 11){
               daysInMonth = 30;
    }else if(leapYearFunction(year) && i == 2){
        daysInMonth = 29;
    }else
        daysInMonth = 28;

        return daysInMonth;
         
}
}