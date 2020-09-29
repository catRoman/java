public class Exercise3_24 {
    public static void main(String[] args){

        int randomSuite = (int)(Math.random() * 4);
        int randomCard = (int)(Math.random() * 13);

        String card = "default";

        String suit = "bananas";

        switch(randomSuite){
            case 0: suit = "Hearts"; break;
            case 1: suit = "Diamonds"; break;
            case 2: suit = "Clubs"; break;
            case 3: suit = "Spades"; break;
        }
        if(randomCard < 0 || randomCard >= 10){
                switch(randomCard){
                     case 0: card = "Ace"; break;
                     case 10: card = "Jack"; break;
                     case 11: card = "Queen"; break;
                     case 12: card = "King"; break;
                     }
        } else{
            card = String.valueOf(randomCard);
        }

        System.out.println("The card you picked is " + card + " of " + suit);
    }
}