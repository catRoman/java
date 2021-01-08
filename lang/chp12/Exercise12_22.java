import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_22{
    public static void main(String[] args)
        throws IOException{

        if (args.length != 3){
            System.out.println(
                "Usage: java Exercise12_22 sourceDir oldStr newStr");
                System.exit(1);
        }

        File sourceDir = new File(args[0]);
        if(!sourceDir.exists()){
            System.out.println("Source directory " + args[0] + " does not exist");
            System.exit(2);
        }

        
        if(!sourceDir.isDirectory()){
            System.out.print("Source location " + args[0] + " is not a directory");
            System.exit(3);
        }

        File[] fileList = sourceDir.listFiles();
        for(File e : fileList){
            if(e.isFile()){
            ArrayList<String> textLines = new ArrayList<>();
            try(
                Scanner input = new Scanner(e);
                ){ 
                    while(input.hasNext()){
                        String s1 = input.nextLine();
                        String s2 = s1.replaceAll(args[1], args[2]);
                        textLines.add(s2);
                }
            }
            try(
                PrintWriter output = new PrintWriter(e);
                ){
                    for(String f : textLines){
                        output.println(f);
                    }

            }
        }
        }
}
}