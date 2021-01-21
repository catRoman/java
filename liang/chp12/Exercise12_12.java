import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_12{
    public static void main(String[] args)
        throws IOException{

            File fileToFormat = new File(args[0]);

            if(args.length > 1){
                System.out.println("Error: wrong parameters use : java Exercise12_12 [fileToFormat.java]");
                System.exit(1);
            }else if(!fileToFormat.exists()){
                System.out.println("Error: File " + args[0] + " does not exist.");
                System.exit(1);
            }else if(!fileToFormat.canRead()){
                System.out.println("Error: File " + args[0] +  " cannot be read.");
                System.exit(1);
            }else if(!fileToFormat.canWrite()){
                System.out.println("Error: File " + args[0] + " cannot be modified.");
                System.exit(1);
            }
            Scanner input = new Scanner(fileToFormat);

            ArrayList<String> formattedDocument = new ArrayList<>();

            while(input.hasNext()){
                formattedDocument.add(input.nextLine());
            }
            for(int i = 1 ; i < formattedDocument.size(); i++){
            if(formattedDocument.get(i).contains("{")){
                formattedDocument.set(i - 1, formattedDocument.get(i-1).trim() + " " + formattedDocument.get(i).trim());
                formattedDocument.remove(i);
            }
            }
            try(PrintWriter output = new PrintWriter(fileToFormat)){
                for(String e : formattedDocument){
                    output.println(e);
                }
            }
             
        }
}