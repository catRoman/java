import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercise12_15{
    public static void main(String[] args)
        throws IOException{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();
        boolean loop = true;
        File sourceFile;
        String sourceLocation;
        do{
            System.out.println("Enter source file: ");
            sourceLocation = input.nextLine();
            sourceFile = new File(sourceLocation);
            if(sourceFile.exists())
                loop = false;
            else 
                System.out.println("File cannot be found");
            if(sourceFile.canRead())
                loop = false;
            else    
                System.out.println("File cannot be read");
            if(sourceFile.canWrite())
                loop = false;
            else
                System.out.println("File cannot be written to");
        }while(loop);

        writeInFile(name, sourceFile);
    }
    
     public static int writeInFile(String name, File file) 
        throws IOException{
     ArrayList<String> nameList = new ArrayList<>();

        try(
           Scanner inputDoc = new Scanner(file);
        )
        {
            while(inputDoc.hasNext()){
                nameList.add(inputDoc.nextLine());     
            }
            nameList.add(name);
            Collections.sort(nameList); 
        }
        try(PrintWriter output = new PrintWriter(file))
        {
            for(String e : nameList){
                output.println(e);
            }

           return nameList.indexOf(name);
        }  
        }
}