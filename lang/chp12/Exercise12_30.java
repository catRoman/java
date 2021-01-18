import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercise12_30{
    public static void main(String[] args)
        throws IOException{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a filename: ");
        File file = new File(input.nextLine());
        
        String doc = "";
        try(Scanner fileRead = new Scanner(file)){
        while(fileRead.hasNext()){
            doc += fileRead.nextLine();
        }
    }

        for(int i = 'A'; i <= 'Z'; i++){
            Pattern p = Pattern.compile((char)i + "", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(doc);
            int count = 0;
            while(m.find()){
                count++;
            }
            System.out.println("Number of " + (char)i + "s: " + count);
        }
    }
}