import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_27 {
    public static void main(String[] args){
        if(args.length == 2){
            System.out.println("Usage: java Exercise12_27 [srcDirectory] [fileName]");
            System.exit(0);
        }
        File dir = new File(args[0]);
        
        File[] fileList = dir.listFiles();

        dir.
    }
}
