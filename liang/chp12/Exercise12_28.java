import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.IOException;

public class Exercise12_27{
    public static void main(String[] args)
        throws IOException{

            ArrayList<File> arguments = new ArrayList<>();
            
            for(int i =0; i < args.length; i++){
                File arg = new File(args[i]);
                if(checkArguments(arg))
                    arguments.add(arg);
            }

            for(File e : arguments){
                padFileName(e);
            }
    }
    public static boolean checkArguments(File file)
        throws IOException{
            if(!file.exists()){
                System.out.println("Error: " + file + " does not exist");
                return false;
            }else if(file.isDirectory()){
                System.out.println("Error: " + file + " is a directory");
                return false;
            }
            return true;
        }
public static void padFileName(File file)
        throws IOException{
            String fileName = file.toString();

            Pattern two_two = Pattern.compile("[a-z]+[0-9]{2}_[0-9]{2}\\.java", Pattern.CASE_INSENSITIVE);
            Pattern one_two = Pattern.compile("[a-z]+[0-9]_.+\\.java", Pattern.CASE_INSENSITIVE);
            Pattern two_one = Pattern.compile("[a-z]+[0-9]{2,}_[0-9]\\.java", Pattern.CASE_INSENSITIVE);
            
            Matcher finished = two_two.matcher(fileName);
            Matcher oneFront = one_two.matcher(fileName);
            Matcher oneBack = two_one.matcher(fileName);

            String temp = "";
            while(!finished.find()){
                if(oneFront.find()){
                    temp = fileName.substring(0, (fileName.indexOf("_") - 1)) + '0' 
                        + fileName.substring(fileName.indexOf("_") - 1);
                }else if(oneBack.find()){
                    temp = fileName.substring(0, (fileName.indexOf("_") + 1)) + '0'
                        + fileName.substring(fileName.indexOf("_" + 1));
                }
                fileName = temp;
            }
            File newFileName = new File(fileName);

            if(checkArguments(newFileName))
                file.renameTo(newFileName);
        
        }

}