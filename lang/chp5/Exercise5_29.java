
// need to fix formatting will come back

public class Exercise5_29{
    public static void main(String[] args){
        java.util.Scanner input =new java.util.Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter day (1 for monday, 2 for tuesday...: ");
        int day = input.nextInt();

        for(int i = 1; i <=12; i++){
            printCalender( i, year, Exercise5_28.getFirstOfMonth(i, day, year));
        }
        
    }

    public static void printCalender(int month, int year, int dayPosition){
       String monthName = Exercise5_28.getMonth(month) + " " + year;
        System.out.printf("\n\t\t%14s\n",monthName);
        System.out.printf("-----------------------------\n");
        System.out.printf(" Sun Mon Tue Wed Thu Fri Sat\n");
        String whiteSpace = "";
       // switch(dayPosition){
       //     case 0 : whiteSpace = "!!"; break;
         
      
       switch(dayPosition){
   
           case 1 : for(int i = 1; i < 4; i++){
                     whiteSpace += " ";
                      } break;
            case 2 :for(int i = 1; i < 8; i++){
                        whiteSpace += " ";
                    } break;
            case 3 :for(int i = 1; i < 12; i++){
                        whiteSpace += " ";
                    } break;
                
            case 4 :for(int i = 1; i < 16; i++){
                        whiteSpace += " ";
                    } break;
            case 5 :for(int i = 1; i < 20; i++){
                        whiteSpace += " ";
                    } break;
            case 6 :for(int i = 1; i < 24; i++){
                        whiteSpace += " ";
                    } break;
         //   case 0 :for(int i = 1; i <= 63; i++){
         //               whiteSpace += "!";
         //           } break;
        
       default: whiteSpace =" ";
       
        }
        
        

        String dayString = "";

        for(int i = 1; i <= Exercise5_28.daysInMonth(i, year); i++){   
            dayString += (i + "   ");
    
        }
        dayString = whiteSpace + dayString;
        String calenderDays = "";
        for(int i = 0; i < dayString.length(); i++){
            calenderDays += dayString.charAt(i);
            if (i % 29 == 0){
            calenderDays += "\n";
            
            }
        }
        System.out.print(calenderDays);
        
        
        

        System.out.println("\n\n");
    }
}