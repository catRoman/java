import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_15{
    public static void main(String[] args)
        throws IOException{
        Scanner input = ne Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();
        boolean loop = true;
        File sourceFile;
        String sourceLoacation;
        do{
            System.out.println("Enter source file: ");
            sourceLocation = input.nextLine()[
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


    }public static int readInFile(String name, File file){
        
    }
     public static int writeInFile(String name, File file){
     }
        try{
           
            PrintWriter output = new PrintWriter(sourceFile);


        }

        
        }
}