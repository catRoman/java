import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_21{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String author = "";

        File authorFile = new File("Authors.txt");
        File bookFile = new File("Books.txt");
        do{
            System.out.print("Enter authors name: ");
            author = input.nextLine();
            try{
                if(checkAuthor(author, authorFile))
                    displayBooks(author, bookFile, authorFile);  
                else
                    System.out.println("Author not on list.");
            }catch(IOException ex){
                System.out.println(ex);
            }
            
        }while(cont());
        }
        public static boolean cont(){
            Scanner contInput = new Scanner(System.in);
            System.out.print("Would you like to enter another Author(y/n)? ");
            String answer = "";
            do{
                answer = contInput.nextLine();
                if(answer.length() == 1 && (answer.charAt(0) == 'y' ||
                    answer.charAt(0) == 'Y'))
                    return true;
                else if(answer.length() == 1 && (answer.charAt(0) == 'n' ||
                    answer.charAt(0) == 'N'))
                    return false;
                else
                    System.out.print("Please chose either y or n: ");
            }while(true);
        }
        public static ArrayList<String> getAuthorList(File authorFile)
            throws IOException{

                ArrayList<String> authorList = new ArrayList<>();

                
                try(Scanner authorListScan = new Scanner(authorFile)){
                    while(authorListScan.hasNext()){
                        authorList.add(authorListScan.nextLine());
                    }
                }
                return authorList;
            }
        public static boolean checkAuthor(String author, File authorsFile)
            throws IOException{
            for(String e : getAuthorList(authorsFile)){
                if(e.equalsIgnoreCase(author))
                    return true;
            }
            return false;
        }
        public static void displayBooks(String author, File bookListFile, File authorFile)
            throws IOException{
                ArrayList<String> authorList = getAuthorList(authorFile);
                int authorIndex = -1;
                for(int i = 0; i < authorList.size(); i++){
                    if(authorList.get(i).equalsIgnoreCase(author))
                    authorIndex = i + 1;
                }

                ArrayList<String> bookList = new ArrayList<>();
                try(Scanner bookListScan = new Scanner(bookListFile)){
                    while(bookListScan.hasNext()){
                        bookList.add(bookListScan.nextLine());
                    }
                }
                System.out.println("----------------------------");
                System.out.println("Titles by " + author);
                System.out.println("----------------------------");
                int titleCount = 0;
                for(String e : bookList){
                    if(e.substring(0,1).contains(Integer.toString(authorIndex))){
                        System.out.println(e.substring(2));
                        titleCount++;
                    }
                }
                if(titleCount == 0){
                    System.out.println("\nThere are currently no titles on file\n");
                }
                    
                System.out.println("----------------------------");
                System.out.println();
        }
    }
