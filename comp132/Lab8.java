
/**
 * @author: Catlin Roman C0497064
 * Section #: COMP-132-D02B
 * Date: December 8th 2020
 * Program: Lab8-Objects
 * 
 * a geussing game where the user is asked to name
 * the capital city based on a country the projram provides. 
 * The countries are created as objects and the game calls 
 * the specific countryCard object instance to determine its
 * capital. a static class variable keeps count of total number
 * of countries and selects at random which country to ask for
 * its capital. The countryCard object changes the cardStatus 
 * whether or not it has been previously selected. Only cards
 * that have not bee played before are presented. Once all questions
 * are answered the game askes to play again and if the user 
 * decies to the cardStatus are changed back to unplayed and the game
 * repeats. The user if ofeer to exit after each geuss and the answer 
 * are given for wrong anwser
 * 
 * The classes UML Diagram is provided above the beginning of the class.
 *  
 * Methods include in main:
 * continueGame()
 * randomCard()
 * displayIntro()
 * clearScreen()

 * 
 * */



import java.util.Scanner; // for console input
public class Lab8{
    public static void main(String[] args){
        //Scanner object in main for console input
        Scanner input = new Scanner(System.in);
        // invokes CountryCard class array
        CountryCard[] myCardDeck = new CountryCard[15];
        // 15 new CountryCards using constructor(country,capital)
        myCardDeck[0] = new CountryCard("Afghanistan", "Kabul");
        myCardDeck[1] = new CountryCard("Albania", "Tirana");
        myCardDeck[2] = new CountryCard("Algeria", "Algiers");
        myCardDeck[3] = new CountryCard("Argentina", "Buenos Aries");
        myCardDeck[4] = new CountryCard("Australia", "Canberra");
        myCardDeck[5] = new CountryCard("Azerbaijan", "baku");
        myCardDeck[6] = new CountryCard("Austria", "Vienna");
        myCardDeck[7] = new CountryCard("Barbados", "Bridgetown");
        myCardDeck[8] = new CountryCard("Belgium", "Brussels");
        myCardDeck[9] = new CountryCard("Belize", "Belmopan");
        myCardDeck[10] = new CountryCard("Canada", "Ottawa");
        myCardDeck[11] = new CountryCard("Chile", "Santiago");
        myCardDeck[12] = new CountryCard("Denmark", "Copenhagen");
        myCardDeck[13] = new CountryCard("China", "Beijing");
        myCardDeck[14] = new CountryCard("Cuba", "Havana");
      
        // String for input
        String answer;
       
        //main loop, continues until system exit is selected
        do{
        int count = 1;  // count for secondary game loop
        clearScreen();  // clears console screen prior to game title
        displayIntro(); // displays game title
        System.out.println();
        //method invoked for yes/no response
        continueGame("geuss the country's capitals"); 
        //countryCard created to make refrence to preexisting card
        //for easier rerading of code
        CountryCard cardToGeuss; 
        //sets all carStatus in array to false(false means unplayed)
        // used to reset for new game
        for(CountryCard element: myCardDeck){
            element.setCardStatus(false);
        }
        //game loop continues while count is less then the static
        //class variable of CountryCard representing number of 
        //Countries
        while(count < CountryCard.getCardCount()){
            count++;  // each iteration increases count
            
            //assigns (after checking if available) random CountryCard
            //for current game loop
            cardToGeuss = myCardDeck[randomCard(myCardDeck)];
        
            //asks what capital is displaying the countryCards country name
            System.out.print("What is the capital of " 
                            + cardToGeuss.getCountryName() + "? ");
            answer = input.nextLine(); //recieves input
            
            //compares input ignoreing case value against answer located in countryCard
            // and displayes appropriate respose
            if(answer.equalsIgnoreCase(cardToGeuss.getCountryCapital())){
                System.out.println("You geuss correct!");
                //invokes method that takes input (y/n) if it would like top continue
                //method recieves string to adjust questioned asked this case it is 
                //"continue"
                continueGame("continue");
            }else{
                // displays the correct answer located in the countryCard
                System.out.println("Sorry the correct answer was " 
                                + cardToGeuss.getCountryCapital() + ".\n");
                //determines whether to continue game
                continueGame("continue");
            }
        }
        //once all countryCards have been played
        System.out.println("You geuss all the country's Capitals! Good Job!");
        //askes whther or not to play again
        continueGame("play another game");
        
    }while(true);//exit of game loop is made through continue(String) method
    }
    //methods----------------------------------------------------------------
    
/** continueGame()
 * asks user if they would like to do something
 * depending on message string ( continue, play new game etc) and exits
 * depending on their input
 */
    public static void continueGame(String message){
        //Scanner object for input within method
        Scanner input1 = new Scanner(System.in); // Scanner object for input
        while(true){//loop allows for multiple responses if input if invalid
        //displays custome message passed through method
        System.out.print("Would you like to " + message + "(y/n): ");
        String answer = input1.nextLine();
        //changes input to lower case and checks against input
        //if input is invalid loops again until y or n is entered
        // n will exit the game
        if(answer.toLowerCase().contains("yn") || answer.toLowerCase().contains("ny")){
            System.out.println("I don't recognize your answer, please try again.\n");
        }else if(answer.toLowerCase().contains("n")){
            System.out.println("\tOk then... bye");
            System.exit(0);
        }else if(answer.toLowerCase().contains("y")){
            System.out.println("Ok then... here we go!\n");
            break;
        }else{
            System.out.println("I don't recognize your answer, please try again.\n");
        }
    }
    
}

  /** randomCard()
   * checks that card has not been used and 
   * returns a random int out of
   * remaining choices
   * 
   * @return random int that allows for an unused CountCard
   * to be played
   */
    public static int randomCard(CountryCard[] myCardDeck ){

    //loops through until a randomNumber is selected that 
    // corresponds to an unused Countrycard
    do{ 
        //number between 0 - 14
        int randomNum = (int)(Math.random() * 14);
        //card status false = available to play
    if(!myCardDeck[randomNum].getCardStatus()){
        //once determined card is avaiable to play it changes
        //its status to not be played again
        // and returns the number
        myCardDeck[randomNum].setCardStatus(true);
        return randomNum;      
    }// continues untill available countryCard is found
    }while(true);

}
    /** displayIntro()
     *  
     * a void method used to print to command line a title screen when
     *  invoked
     */
    public static void displayIntro(){

        System.out.print("|==============================================|\n"
                        +"|                                              |\n"
                        +"|           Comp- 132: Lab 8 -- Objects        |\n"
                        +"|                                              |\n"
                        +"|        ! Country Capital Guessing Game !     |\n"
                        +"|                                              |\n"
                        +"|==============================================|\n");
    }
    
    /** clearScreen()
     * 
     * void method used to imate a clearing of the command line by 
     * printing a new line 50 times
     * */
    public static void clearScreen(){
    for(int i =0; i <50; i++){
        System.out.println();
    }
}
    
}


/**=========================
 *      UML Diagram
 * =========================
 *      CountryCard
 * -------------------------
 *  - String countryName
 *  - String countryCapital
 *  - boolean cardStatus
 *  - int cardCount
 *  + CountryCard()
 *  + CountryCard(countryName : String, countryCapital: String)
 *  + getCountryName() : String
 *  + setCountryName(countryName : String)
 *  + getCountryCapital() : String
 *  + setCountryCapital(countryCapital : String)
 *  + getCardStatus() : boolean
 *  + setCardStatus(cardStatus : boolean)
 *  + getCardCount() :  int
 * 
 * Used to store a country's name and corresponding capital
 * empty object return empty string values
 * class variable countthis("","");s total objects created
 * cardStatus is an boolean where false == card available
 */
class CountryCard{
    private static int cardCount; // stores total count of class objects created
   
    //instance variables
    // default values 
    // "", "", false. respectivley
    private String countryName;
    private String countryCapital;
    private boolean cardStatus; // false == available
    
    //creates an empty Card
    public CountryCard(){
        cardCount++; // adds to # of objects created count
    }

    //user set constructor
    public CountryCard(String countryName, String countryCapital){
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        cardCount++;
    }
    //returns name
    public String getCountryName(){
        return countryName;
    }
    //set the name
    public void setSountryName(String countryName){
        this.countryName = countryName;
    }
    //return the capital
    public String getCountryCapital(){
        return countryCapital;
    }
    //set the capital
    public void setCountryCapital(String countryCapital){
        this.countryCapital = countryCapital;
    }
    //returns the card status
    public boolean getCardStatus(){
        return cardStatus;
    }
    //sets the card status
    public void setCardStatus(boolean cardStatus){
        this.cardStatus = cardStatus;
    }
    //returns the int of total number of 
    // CountryCard Ohjects constructed
    public static int getCardCount(){
        return cardCount;
    }
    
}