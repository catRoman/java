
/**
 * @author: Catlin Roman C0497064
 * Section #: COMP-132-D02B
 * Date: November 18 2020
 * Program: Lab6-Arrays
 * 
 * A static array is created outside of the main method and initilaized within it.
 * it is then randomly populated by invokeing the fillSeatsRandomly() method. The
 * manipulation of the array through various methods is presented 
 * in the main method through a menu, the menu consists of 7 options
 * and an exit option, after each selection is choosed, if relevant there is an
 * option to repeat the specific selection  or else you are asked whether 
 * you wish to return to the main menu. 
 * Methods include:
 * fillSeatsRandomly()
 * displaySeats()
 * isSeatAvailable()
 * reserveSeat()
 * seatAvailInRow()
 * findRowWithTwoSeats()
 * countSeatAvail()
 * countTakenSeats()
 * 
 * */

import java.util.Scanner; // Scanner class import
import java.lang.Character; // character class import

public class Lab6 {

    // static array allows for alteration within static methods
    static int[][] seatArray; 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input Scanner object for main

        seatArray = new int[12][4]; // initialize static array
        fillSeatsRandomly(); // randomly populate  

        while (true) { // main menu loop, loops until exit command
            clearScreen(); // clears terminal screen
            displayIntro(); // displays intro message
            displayMenu(); // displays menu options
            System.out.println();

            System.out.print("Enter your selection: ");
            int selection = input.nextInt();
            System.out.println();

            switch (selection) { // menu logic, uses specific methods depending on selection
                case 1: {
                    displaySeats(); // prints to screen seat array
                    menuControl(); // menu control method(optional exit command)
                    break;

                }
                case 2: {
                    char yes; // intialized outside loop
                    do { // loop for ability to check multiple seats
                        System.out.print("Enter the row number and column letter to check (e.g. 2 A): ");
                        int seatRow = input.nextInt(); // input for row
                        char seatColumn = input.next().charAt(0); // char input for column

                        System.out.println();
                        // condition line for determining grammer ot print for response
                        String availibility = (isSeatAvailable(seatRow, seatColumn)) ? " is " : " is not ";
                        System.out.println(
                                "Seat " + seatRow + Character.toUpperCase(seatColumn) + availibility + "available");
                        System.out.println();


                        System.out.print("Would you like to check another seat?(y for yes): ");
                        yes = input.next().charAt(0);
                    } while (yes == 'y'); // repeats if input is a y exits loop if not

                    menuControl(); // asks to go back to main menu or else exits
                    break;

                }
                case 3: {
                    char yes; // initialized outside loop
                    do {
                        System.out.print("Enter the row number (e.g. 1): ");
                        int seatRow = input.nextInt(); // row input
                        System.out.println();
                        System.out.println(
                                "There are " + seatsAvailInRow(seatRow) + " seats available in row " + seatRow);
                        System.out.println();
                        System.out.print("Would you like to check another row?(y for yes): ");
                        yes = input.next().charAt(0); // char selection
                    } while (yes == 'y');

                    menuControl();
                    break;

                }
                case 4: {
                    if (findRowWithTwoSeats() > 0) // if true prints number of seats
                        System.out.println(
                                "Row " + findRowWithTwoSeats() + " has two seats next to each other available");
                    else // if false displays none available
                        System.out.println("There are no seat available next to each other on this flight.");

                    menuControl(); // ask to exit or return to menu
                    break;

                }
                case 5: { // displays seats available
                    System.out.print("There are " + countSeatsAvail() + " seats available.");
                    menuControl(); // return to menu or exit
                    break;

                }
                case 6: { // displays seats unavailable
                    System.out.print("There are " + countTakenSeats() + " seats unavailable.");
                    menuControl(); // return to menu or exit
                    break;

                }
                case 7: {
                    char yes; // intitialized outside loop
                    do {
                        System.out.print("Enter the row number and column letter to reserve (e.g. 2 A): ");
                        int seatRow = input.nextInt(); // seat row input
                        char seatColumn = input.next().charAt(0); // seat column input

                        reserveSeat(seatRow, seatColumn); // researves specific seat
                        System.out.println();
                        System.out.print("Would you like to reserve another seat?(y for yes): ");
                        yes = input.next().charAt(0);
                    } while (yes == 'y'); // loops untill something other that y is inputed

                    menuControl(); // exits or returns to menu
                    break;
                }
                case 8:
                    System.out.println("Goodbye!"); // exits program
                    System.exit(1); // non error exit
                    break;

                default: // if menu selection dos not equal option
                    System.out.println("Error: input not recognized");
                    System.exit(0); // error exit
                    break;

            }

        }
    }

    /**
     * Fills classes static array with random values in range from 0 to 1. With zero
     * representing an empty seat and one representing a reserved seat
     */
    static void fillSeatsRandomly() {
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                seatArray[i][j] = (int) Math.round(Math.random());
            }
        }

    }

    /**
     * accesses the classes static Array and displays all the seats in the plane row
     * by row. Empty seat is displayed as 0 and a reserved seat is displayed as X.
     * Creates row rumbers from 1 to 10 12 on the left hand side and horizontal
     * column headings from A to D (for the 4 seats in the row)
     *
     */
    static void displaySeats() {
        System.out.print("\tA  \tB  \tC  \tD  \n");
        for (int row = 0; row < seatArray.length; row++) {
            System.out.print(row + 1 + "");
            for (int seatNum = 0; seatNum < seatArray[row].length; seatNum++) {
                if (seatArray[row][seatNum] == 1) {
                    System.out.print("\tX  ");
                } else {
                    System.out.print("\t0  ");
                }

            }
            System.out.println();
        }
    }

    /**
     * Accesses the classes static arr// static array allows alterastion withinay and recieves an integer representing a row
     * number and a character representing a seat from A to D. The method tests if
     * the specific seat is avaiable. It returns true when the seat is available and
     * false when it is not. This method displays an error message when the seat is
     * invalid.
     * 
     * @param seatRow    integer recieved representing the seats row
     * @param seatColumn character recieved representing the seats column
     * @return either true or false, depending on seat availability, returns false
     *         with an error message if seat does not exist
     */
    static boolean isSeatAvailable(int seatRow, char seatColumn) {

        int seatNum = charConvert(seatColumn); //character is converted to int

        if (!isValid(seatRow, seatNum)) {
            System.out.println("Seat choice is invalid");

        } else if (seatArray[seatRow - 1][seatNum] == 1) {
            return false;
        }
        return true;
    }

    /**
     * method for converting a character input to seat number based on column, does
     * not return return default error message if row does not exist, that
     * distinction is left to method calling on the charConvert
     * 
     * @param seatColumn char input representing seat column
     * @return integer representing seat number int seatNum
     */
    static int charConvert(char seatColumn) {
        int seatNum = -1; // number outside of range
        seatColumn = Character.toUpperCase(seatColumn); //converts any input to uppercase
        switch (seatColumn) {
            case 'A':
                seatNum = 0;
                break;
            case 'B':
                seatNum = 1;
                break;
            case 'C':
                seatNum = 2;
                break;
            case 'D':
                seatNum = 3;
                break;

        }
        return seatNum; // returns either valid (0-3) or invalid number(-1)
    }

    /**
     * access the classes static array and reserves a specific seat, passes
     * parameters to charConvert to change to integer and to inValid to check for
     * validity displays error message if seat is reserved or if seat is invalid,
     * changes array in main directly to reflect seat reservation
     * 
     * @param seatRow    integer representing seat row
     * @param seatColumn character representing seat column
     */
    static void reserveSeat(int seatRow, char seatColumn) {
        int seatNum = charConvert(seatColumn);
        if (!isValid(seatRow, seatNum)) { //if input is invalid
            System.out.println("The seat is invalid");
            return; //error exit of method
        }
        if (isSeatAvailable(seatRow, seatColumn)) { //if available
            seatArray[seatRow - 1][seatNum] = 1; //marks  selection as reserved (1)
            System.out.println("Seat " + (seatRow) + Character.toUpperCase(seatColumn) + " reserved");
        } else if (!isSeatAvailable(seatRow, seatColumn)) { //if already reserved
            System.out.println("The seat is already researved.");
        }

    }

    /**
     * overloaded method checks whether the seat choice is valid or not
     * 
     * @param seatRow integer seat row number
     * @param seatNum integer seat column number
     * @return true if seat is within parameters, false if not
     */
    static boolean isValid(int seatRow, int seatNum) {

        if ((seatRow < 0 || seatRow >= 12) || (seatNum < 0 || seatNum >= 4))
            return false;
        else
            return true;

    }

    /**
     * overloaded method checks whether the seat choice is valid or not
     * 
     * @param seatRow integer seat row number
     * 
     * @return true if seat is within parameters, false if not
     */
    static boolean isValid(int seatRow) {

        if (seatRow < 0 || seatRow >= 12)
            return false;
        else
            return true;

    }

    /**
     * accesses the classes static array and counts and returns number of seats
     * available in given row
     * 
     * @param seatRow integer representing seat row
     * @return integer representing number of available seats
     */
    static int seatsAvailInRow(int seatRow) {
        int count = 0;
        if (!isValid(seatRow)) {
            System.out.println("Row is invalid...");
            return 0; // invalid return of zero
        }
        for (int i = 0; i < seatArray[seatRow].length; i++) {
            if (seatArray[seatRow][i] == 0)
                count++; // returns count if seats available
        }
        return count; // retrurns zero if no seats available

    }

    /**
     * acceses the classes static array and looks for row with two adjacent
     * available seats, returns the row with the two adjacent seats. If two adjacent
     * seats are not available it returns zero
     * 
     * @return integer of index plus one representing seatRow or zero if no adjcent
     *         seats are available
     */
    static int findRowWithTwoSeats() {
        
        for (int i = 0; i < seatArray.length; i++) {
            // starts + 1 of index and checks seat to its left if both are available it
            // will return the rows posittion as an option
            for (int j = 1; j < seatArray[i].length; j++) {
                if (seatArray[i][j - 1] == 0 && seatArray[i][j] == 0)
                    return (i + 1);
            }
        }
        return 0; // returns zero if no rows are available
    }

    /**
     * Counts all available seats in classes static seatArray
     * 
     * @return integer representing available seats
     */
    static int countSeatsAvail() {
        int count = 0;
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                if (seatArray[i][j] == 0)
                    count++;
            }
        }
        return count; // goes through each seat and add to count if available
    }

    /**
     * Counts all taken seats in classes static seatArray
     * 
     * @return integer representing taken seats
     */
    static int countTakenSeats() {
        int count = 0;
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                if (seatArray[i][j] == 1)
                    count++;
            }
        }
        return count; // goes through each seat and returns total of unavailable
    }

    /** Simple title display */
    static void displayIntro() {

        System.out.print("|==============================================|\n"
                       + "|                                              |\n"
                       + "|           Comp- 132: Lab 6-- Arrays          |\n"
                       + "|                                              |\n"
                       + "|==============================================|\n");
    }

    /**
     * void method used to imate a clearing of the command line by printing a new
     * line 50 times,
     * 
     */
    static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    /** Displays a simple menu */
    static void displayMenu() {

        System.out.print("|==============================================|\n"
                       + "| 1) Display Seats                             |\n"
                       + "| 2) Check Specific Seat Availability          |\n"
                       + "| 3) Check Row Availability                    |\n"
                       + "| 4) Find Row With Two Available Seats         |\n"
                       + "| 5) Total Number of Seats Available           |\n"
                       + "| 6) Total Number of Seats Reserved            |\n"
                       + "| 7) Reserve a Specific Seat                   |\n"
                       + "| 8) Exit                                      |\n"
                       + "|==============================================|\n");
    }

    /**
     * used in menu to main to skip back to main menu when asked or else to exit
     * program
     */
    static void menuControl() {
        Scanner menuInput = new Scanner(System.in); // method scanner object

        System.out.print("Return to main menu?(y for yes): ");
        char yes = menuInput.next().charAt(0);
        if (yes == 'y')
            return; // returns to case and then breaks out to main menu
        else
            System.out.println("Good-Bye!");
        System.exit(0); // exit program with good bye
    }

}