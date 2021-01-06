import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Collections;


public class Exercise12_17{
    public static void main(String[] args){

        File sourceFile = new File("hangmanWords.txt");
       if(!sourceFile.exists()){
           System.out.println("source file does not exist, create a file [hangmanWords.txt] to continue");
           System.exit(1);
       }
       
        WordList myList = new WordList(sourceFile);

       Scanner input = new Scanner(System.in);
        boolean cont = false;

       do{
      String word = myList.getRandomWord();
      
       char geuss = ' ';
       String geusses = "";
       int missed = 0;
       int correctGeuss = 0;
       boolean lettersLeft = true;
       String currentWord = "";
       char[] newWord = new char[word.length()];
       for(int i = 0; i < newWord.length; i++){
        newWord[i] = '*';   
       }
       
       
       while(lettersLeft){
           currentWord = displayWord(newWord, geuss, word);
           System.out.print("(Geuss) Enter a letter in word " + currentWord + " --> ");
           geuss = input.next().charAt(0);
          
           if(checkFinished(displayWord(newWord, geuss, word))){
            System.out.println("The word is " + word + ". You missed "
                        + missed + " time.");
            lettersLeft = false;
           }else if(!checkGeuss(geuss, word)){
               missed++;
               System.out.println("\t" + geuss + " is not in the word");
           }else if(checkGeuss(geuss, word)){
            if(checkGeuss(geuss, word))  { 
            if(geusses.indexOf(geuss) > 0) 
                System.out.println("\t" + geuss + " has already been chosen");
           }
        }
           if(checkGeuss(geuss, word))
           geusses += geuss;
           
       }
       
       boolean yOrN = false;
        do{
       System.out.print("Would you like to play again? ");
       int choice = input.next().charAt(0);
       
       
       if(choice == 'y' || choice == 'Y'){
            cont = true;
            yOrN = false;
       }else if (choice == 'n' || choice == 'N'){
            cont = false;
            yOrN = false;
            
       }else{
            System.out.println("\tPlease use eith y/n for you answer...");
            yOrN = true;
        }
       }while(yOrN);
    }while(cont);
    System.out.println("Goodbye");
}
public static boolean checkFinished(String currentWord){
    for(int i = 0; i < currentWord.length(); i++){
        if(currentWord.charAt(i) == '*')
            return false;
    }
    return true;
}
    public static String displayWord(char[] newWord, char geuss, String word){
   String displayedWord = "";
        if(checkGeuss(geuss, word)){
        
            for(int i = 0; i < newWord.length; i++){
              if(word.charAt(i) == geuss)
               // displayedWord = displayedWord.replace(displayedWord.charAt(i),geuss);
               newWord[i] = geuss;
        }
        
    }
    for(char e : newWord){
        displayedWord += e;
    }
        return displayedWord;
        
    }

    public static boolean checkGeuss(char geuss, String word){
        
    for(int i = 0; i < word.length(); i++){
        if(geuss == word.charAt(i))
        return true;
    }
    return false;

    }
}


class WordList{
    private File sourceFile;
    private ArrayList<String> words;

    public WordList(File sourceFile){ 
        this.sourceFile = sourceFile;
        try{
        this.words = getWordList();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    public ArrayList<String> getWordList()
        throws IOException{
            ArrayList<String> wordList = new ArrayList<>();
            try(Scanner input = new Scanner(this.sourceFile)){
                while(input.hasNext()){
                    wordList.add(input.next().toLowerCase());
                }
            }
            Collections.sort(wordList);
            for(int i = 0; i < wordList.size(); i++){
                for(int j = 1; j < wordList.size(); j++){
                    if(wordList.get(i).equals(wordList.get(j)))
                        wordList.remove(j);
                }
            }
            return wordList;
    }
    public void setSourceFile(File sourceFile){
        this.sourceFile = sourceFile;
    }
    public int getWordCount(){
        return this.words.size();
    }
    public String getRandomWord(){
        return this.words.get((int)(Math.random() * getWordCount()));
    }
}