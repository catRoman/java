
/**
 * @author: Catlin Roman C0497064
 * Section #: COMP-132-D02B
 * Date: October 30 2020
 * Program: Lab5-Methods
 * 
 * Program prompts user to enter three variables, speed a car is travelling, total distance 
 * from origin to destination and time travelled. Program computes the variables to
 * determine the total distance travelled, distance to destination and estimated time
 * to arrival. The program displays this information in a chart as well as a bar graph
 * that shows the current location in relation the the origin and destination
 * of the vehical based on calculations provided from the input. The process flow of the 
 * program uses multiple methods to modularize the code to aid in writing/debugging. 
 * */
public class Lab5{

    //used for displaying bar graph and as a total for calculations
    static final int totalDashCount = 50;   
    public static void main(String[] args){
        // Scanner class  input created
        java.util.Scanner input = new java.util.Scanner(System.in);

        //clears command prompt prior to input
        clearScreen();
        //displays welcome message at program startup
        displayIntro();
        System.out.println();

        //input three variables for calculations
        System.out.print("Enter the distance from the origin in km: ");
        double distanceInKm = input.nextDouble();
        System.out.print("Enter the speed of the travelling car in km/h: ");
        double speedInKmPerHour = input.nextDouble();
        System.out.print("Enter the time elapsed since the departure in hours: ");
        double timeElapsedSinceDeparture = input.nextDouble();
        
        //clears screen again after input
        clearScreen();
        
        // displays summary chart of information and calculations
        displayChart(distanceInKm, speedInKmPerHour, timeElapsedSinceDeparture);
        System.out.println();
        System.out.println();

        //displays bar graph of current position of vehicle
        distanceMap(distanceInKm, speedInKmPerHour, timeElapsedSinceDeparture);
        System.out.println();
        //displays progress % of current position
        displayBar(distanceInKm, speedInKmPerHour, timeElapsedSinceDeparture);
    }
    

/** method for displaying bar graph of current position of car,
 *  recieves doubles of distance car travelled , speed of car and time travelled
 *  returns void printing to command line directly the car symbol in between a 
 *  stop light symbol(for origin) and a house symbol(for destination). The destination
 *  symbol is at a constant distance of the final variable totalDashCount from the 
 *  origin symbol and the position symbol will vary based on the percentage travelled
 *  of the total. The current position is represented by a car symbol. 
 * @param distance distance from origin
 * @param speed speed of traveling car in km/h
 * @param time elapsed time since departure in hours
 * */  
    public static void distanceMap(double distance, double speed, double time){
        // position is  the current position minus two spaces allows for
        //the '> ' prior to the car symbol allowing the car symbol to 
        // be at the actual position. 
        int position = currentPosition(distance, speed, time) - 2; 

        System.out.print("\uD83D\uDEA6"); // sybmol for origin (stop light)
        for(int i =0; i < position; i++){   //dash on loop up to position
            System.out.print("-");
        }
        System.out.print(">\uD83D\uDE97"); // car symbol
        for(int i = 0; i < (totalDashCount - position); i++){ // whitespace until destination
            System.out.print(" ");
        }
        System.out.print(" \uD83C\uDFE0\n"); // destination symbol (house)

}
/** Method for computing current position, receives doubles of distance
 * speed and time, computues distance travelled round and converts to integer, returns
 * integer value
 * @param distance distance from origin
 * @param speed speed of traveling car in km/h
 * @param time elapsed time since departure in hours
 * @return rounded integer of distance travelled 
 */
public static int currentPosition(double distance, double speed, double time){
    double distanceTravelled = speed * time;
    return  (int)(Math.round(totalDashCount * (distanceTravelled/distance)));
}
/**Method for displaying title of origin, Destination, and a progress percentage in the 
 *  center of the two, receives double of distance, speed and time returns void printing
 *  directly to command line within the method
 * @param distance distance from origin
 * @param speed speed of traveling car in km/h
 * @param time elapsed time since departure in hours
 */
public static void displayBar(double distance, double speed, double time){
   // curentPercentage computed from input recieved
    double currentPercentage =  (speed * time)/distance * 100.0;
   System.out.print("Origin"); // displays origin title
    for(int i = 0; i< (totalDashCount/2)-12; i++){
        System.out.print(" "); // loop to roughly middle
    }
    // prints a formated double of percentage
    System.out.printf("Progress: %5.2f%% Complete", currentPercentage);
    for(int i = 0; i < (totalDashCount/2)-12; i++){
        System.out.print(" "); // prints whitespaces untill destination
    }
    System.out.println("Destination\n"); // prints Destination title
}

/** Method for printing a chart summarizing information, 
 *  recieves doubles for distance speed and time and returns void 
 *  printing to command line a chart.
 *  Draws chart by using a set of loops with a switch statement within the 
 *  innermost nested loop to determine which statment to print to which line
 *  if there is something to print the case invokes an overloaded method
 *  to disolay the line properly and returns a boolean to break out of the 
 *  innermost loop only displaying the line once, otherwise the chart width 
 *  is printed in spaces or symbols
 * @param distance distance from origin
 * @param speed speed of traveling car in km/h
 * @param time elapsed time since departure in hours
 */
public static void displayChart(double distance, double speed, double time){
    

    boolean done = false; //used to break out of loop for different cases

    for(int i = 0; i < 20; i++){ // loop for rows
        System.out.print("\t    |"); // displace left edge of chart
        
        
        for(int j = 0; j < 25; j++){ //loop for each line
            switch(i){ // determines whether to print line or spaces based on row
            case 0: System.out.print("="); break; //prints untill loop complete
            case 1: done = linePrint("%-25s","         Summary"); break;
            case 2: done = linePrint("%-13s%-12s","Origin: ","\uD83D\uDEA6"); break;
            case 3: done = linePrint("%-13s%-12s","Destination: ","\uD83C\uDFE0"); break;
            case 4: done = linePrint("%-13s%-12s","Position: ","\uD83D\uDE97"); break;
            case 5: System.out.print("="); break; //prints untill loop complete
            case 6: done = linePrint("%-25s","Total Distance:"); break;
            case 7: done = linePrint("%22.2f km",distance); break;
            case 8: done = linePrint("%-25s","Speed:");break;
            case 9: done = linePrint("%20.2f km/h",speed);break;
            case 10: done = linePrint("%-25s","Time Elapsed:"); break;
            case 11: done = linePrint("%19.2f hours",time); break;
            case 13: done = linePrint("%-25s","Distance Travelled:"); break;
            case 14: done = linePrint("%22.2f km",(speed * time)); break;
            case 15: done = linePrint("%-25s","Distance To Destination:"); break;
            case 16: done = linePrint("%22.2f km",(distance - (speed * time))); break;
            case 17: done = linePrint("%-25s","Estimated Arrival:"); break;
            case 18: done = linePrint("%19.2f hours",(distance - (speed * time))/speed);break;  
            case 19: System.out.print("="); break;   //prints untill loop complete   
            default: System.out.print(" "); //default prints untill loop complete
           }
           //breaks out of loop if true other wise prints until completion
           // which would be chart width
           if(done){
               done= false;
                break;
           }
            
        }
        System.out.println("|"); // prints right hand side of chart box
    }
    
}
/** void method used to imate a clearing of the command line by 
 *  printing a new line 50 times, 
 * 
 */
public static void clearScreen(){
    for(int i =0; i <50; i++){
        System.out.println();
    }
}

/** a void method used to print to command line a title screen when
 *  invoked
 */
public static void displayIntro(){

    System.out.print("|==============================================|\n"
                    +"|                                              |\n"
                    +"|           Comp- 132: Lab 5-- Methods         |\n"
                    +"|                                              |\n"
                    +"|==============================================|\n");
}

/**
 * Overloaded Method recieves two strings, one to act as the formatting string
 * and the other as the string to be formatted, prints statement and atuomatically
 * returns true, used stricly for displayChart method.
 * @param a inputed as formatting string
 * @param b string to be formatted
 * @return true, to allow for break from loop
 */
public static boolean linePrint(String a, String b){
    System.out.printf(a,b);
    return true;
}
/**
 * Overloaded Method recieves three strings, one to act as the formatting string
 * and the other two as the strings to be formatted, used typicaly to
 * allow for properformating between title and symbol,  prints statement and 
 * automatically returns true
 * @param a inputed as formatting string
 * @param b string to be formatted
 * @return true, to allow for break from loop
 */
public static boolean linePrint(String a, String b, String c){
    System.out.printf(a,b,c);
    return true;
}
/**
 * Overloaded Method recieves one string and one double, one to act as the 
 * formatting string and the other as a value to be formatted, 
 * prints statement and atuomatically returns true
 * @param a inputed as formatting string
 * @param b string to be formatted
 * @return true, to allow for break from loop
 */
public static boolean linePrint(String a, double b){
    System.out.printf(a,b);
    return true;
}
}