import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.ArrayList;

public class Exercise12_19{
    public static void main(String[] args)
        throws IOException{

            Scanner consoleInput = new Scanner(System.in);
            String authorName = "";
        do{  
            do{
                System.out.print("Enter authors name: ");
                authorName = consoleInput.nextLine();

                if(checkAuthor(authorName) < 0)
                    System.out.println("Author not found...");
            }while(checkAuthor(authorName) < 0);

  
            do{
                while(true){
                    System.out.print("Enter title of book: ");
                    String title = consoleInput.nextLine();
                    
                    if(!titleExists(title)){
                        addTitle(checkAuthor(authorName), title);
                        break;
                    }else
                        System.out.println("That title is already recorded.");
                
            } 
                System.out.print("Would you like to add another title by the same author(y/n)? ");
            
            }while(cont(consoleInput.next().charAt(0)));
            
            System.out.print("Would you like to chose another author(y/n)? ");

        }while(cont(consoleInput.next().charAt(0)));

        System.out.println("Good-Bye");   
    }
    public static int checkAuthor(String author)
        throws IOException{
            File authorListFile = new File("Authors.txt");
            ArrayList<String> authorList = new ArrayList<>();

            try(Scanner authorFileScan = new Scanner(authorListFile)){
                while(authorFileScan.hasNext()){
                    authorList.add(authorFileScan.nextLine());
                }
            }
            for(int i = 0; i < authorList.size(); i++){
                if(author.toLowerCase().equals(authorList.get(i)))
                    return i;
            }
            return -1;
        }
    
    public static void addTitle(int index, String title)
        throws IOException{

            File bookFile = new File("Books.txt");
            ArrayList<String> titleList = new ArrayList<>();

            try(Scanner bookFileScan = new Scanner(bookFile)){
                while(bookFileScan.hasNext()){
                    titleList.add(bookFileScan.nextLine());
                }
            }
            titleList.add(index + " " + title);

            try(PrintWriter printTitle = new PrintWriter("Books.txt")){
                for(String e : titleList){
                    printTitle.println(e);
                }
            }

    }
    public static boolean cont(char input){
        do{
        if(input == 'y' || input == 'Y'){
            return true;
        }else if(input == 'n' || input == 'N'){
            return false;
        }else{
            System.out.println("please enter y or n");
        }
    }while(true);

    }
    public static boolean titleExists(String title)
        throws IOException{
            
            File bookFile = new File("Books.txt");
            ArrayList<String> titleList = new ArrayList<>();

            try(Scanner bookFileScan = new Scanner(bookFile)){
                while(bookFileScan.hasNext()){
                    titleList.add(bookFileScan.nextLine());
                }
            }
            for(String e : titleList){
                if(title.equals(e))
                    return true;
            }
            return false;


    }
}