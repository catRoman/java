import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercise12_29{
    public static void main(String[] args)
        throws IOException{
            ArrayList<File> fileList = new ArrayList<>();
            
            if(args.length < 1){
                System.out.println("Error: Usage: [fileName.*]");
                System.exit(1);
            }
            Pattern p = Pattern.compile("[A-Z][a-z]+\\d{1,2}_((\\d{2})|(?<oneDigit>\\d))");
            for(int i =0; i< args.length; i++){
                fileList.add(new File(args[i]));
                Matcher m = p.matcher(args[i]);
                StringBuilder temp = new StringBuilder(args[i]);
                while(m.find()){
                        if(m.group("oneDigit") != null){
                            temp.insert(m.start("oneDigit"), '0');
                        }
                }
                fileList.get(i).renameTo(new File(temp.toString()));
            }
    }
}