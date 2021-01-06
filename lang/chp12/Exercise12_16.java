import java.io.*;
import java.util.*;

public class Exercise12_16{
    public static void main(String[] args)
        throws Exception{
        if (args.length != 3){
            System.out.println(
                "usage: java Exercise12_16 sourceFile oldString newString");
                System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()){
            System.out.println("Source file " + args[0]
                    + " does not exist");
            System.exit(2);
        }
        String s1 = "";
        String s2 = "";

        try (Scanner input = new Scanner(sourceFile)){
                while ( input.hasNext()){
                    s1 += input.nextLine() + "\n";
                    
                }
            }

            s2 = s1.replaceAll(args[1], args[2]);

            try (PrintWriter output = new PrintWriter(sourceFile)){
                {
                    output.println(s2);
                }
            }
    }
}