import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_13{
    public static void main(String[] args)
        throws IOException{
        File sourceFile = new File(args[0]);
        if(args.length != 1){
            System.out.println("Error: use java Exercise12_13 [fileName.*]");
            System.exit(1);
        }else if(!sourceFile.exists()){
            System.out.println("Error: source file does not exist");
            System.exit(2);
        }else if(!sourceFile.canRead()){
            System.out.println("Error: cannot read file");
            System.exit(3);
        }
        ArrayList<String> myDoc = new ArrayList<>();
        int wordCount = 0;
        try(Scanner input = new Scanner(sourceFile);
            Scanner wordCountScan = new Scanner(new File(args[0]))){
          
            while(wordCountScan.hasNext()){
                    //System.out.println(wordCountScan.next());
                    wordCountScan.next();
                    wordCount++;
                   
            }
            while(input.hasNext())
                myDoc.add(input.nextLine());      
        }
        int charCount= 0;
            
            for(String e : myDoc)
                for(int i = 0; i < e.length(); i++)
                    if(e.charAt(i) != ' ')
                        charCount++;
                
                
            
            
            System.out.println("File " + sourceFile + " has ");
            System.out.println(charCount + " characters");
            System.out.println(wordCount + " words");
            System.out.println(myDoc.size() + " lines");
            

        }

        }
    
