import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exercise12_11{
    public static void main(String[] args) throws IOException{
        if(args.length != 2){
            System.out.println("Usage: java Exercise12_11 wordToRemove sourceFile");
            System.exit(1);
        }
        
        File sourceFile = new File(args[1]);
        if(!sourceFile.exists()){
            System.out.println("Source file " + args[1] + " does not exist");
            System.exit(2);
        }
        
        
            Scanner input = new Scanner(sourceFile);
        
            ArrayList<String> myDocument = new ArrayList<>();
            
            while (input.hasNext()){
                myDocument.add(input.nextLine());
               
            }
            for(int i = 0; i < myDocument.size(); i++){
                
                myDocument.add(i, myDocument.get(i).replaceAll(args[0], ""));
                myDocument.remove(i + 1);
                  
            }
            try(PrintWriter output = new PrintWriter(sourceFile)){
                for(String e : myDocument){
                    output.println(e);
                }
            }
          

            
        }

    }
