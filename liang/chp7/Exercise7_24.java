/** 
    (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
    problem with many practical applications. The problem is to pick objects from
    a set of objects repeatedly and find out how many picks are needed for all the
    objects to be picked at least once. A variation of the problem is to pick cards from
    a shuffled deck of 52 cards repeatedly and find out how many picks are needed
    before you see one of each suit. Assume a picked card is placed back in the deck
    before picking another. Write a program to simulate the number of picks needed
    to get four cards from each suit and display the four cards picked (it is possible a
    card may be picked twice). Here is a sample run of the program:

    Queen of Spades
    5 of Clubs
    Queen of Hearts
    4 of Diamonds
    Number of picks: 12

*/
public class Exercise7_24{
    public static void main(String[] args){

        String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
        boolean[] suitsNeeded = {true, true, true, true};
        boolean allSuits = false;
        int count =0;
        
        String[] cardsChosen = new String[4];
        String temp = "";
        
        
        do{
            temp = shuffledDeckOfCards();
           for(int i =0; i < 4; i++){
               if (suitsNeeded[i] && temp.contains(suits[i])){
                   cardsChosen[i] = temp;
                   suitsNeeded[i] = false;
               }

           }
        
       
        for(boolean b : suitsNeeded){
            if(b){
                allSuits = true;
                break;
            }else 
                allSuits = false;
        }

            count++;
        }while(allSuits);

        for(int i = 0; i < 4; i++){
            System.out.println(cardsChosen[i]);
        }
        System.out.println("Number of Picks: " + count);
    }

    //Shuffled Deck of cards that returns one card(String) when invoked
    public static String shuffledDeckOfCards(){
       
        // declare and initialize deck 0 to 52 cards
        int[] deck = new int[52];
        for(int i = 0; i < deck.length; i++){
           deck[i] = i;
        }

        String[] suit = {"Clubs", "Spades", "Hearts", "Diamonds"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};

        //randomize
       
        for(int i =0; i < deck.length; i++){
            int random = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i]=deck[random];
            deck[random]=temp;
        }

        //return a random card
        String card = rank[deck[0] % 13] + " of " + suit[deck[0] / 13];
        return card;
    }
}