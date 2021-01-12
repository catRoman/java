import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.IOException;

public class paddFiles{
    public static void main(String[] args)
        throws IOException{

            ArrayList<File> arguments = new ArrayList<>();
            
            for(int i =0; i < args.length; i++){
                File arg = new File(args[i]);
                if(checkArguments(arg))

                    arguments.add(arg);
            }
            
            for(File e : arguments){
                System.out.println("outside");
                
                if(Pattern.matches("[A-Za-z]+[0-9]{1,2}_[0-9]{1,2}\\.[a-z]+", e.toString())){
                padFileName(e);
                }else   
                    System.out.println("Error: " + e + " format not allowed. Use : [fileName[#]_[#].ext]");
               
                System.out.println(e + " Proccessed...");
            }
            System.out.println("Mission accomplished...");
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
            System.out.println("filename before: " + fileName);

            //Pattern two_two = Pattern.compile("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java", Pattern.CASE_INSENSITIVE);
            Pattern one_two = Pattern.compile("[A-Za-z]+[0-9]_.+\\.[a-z]+", Pattern.CASE_INSENSITIVE);
            Pattern two_one = Pattern.compile("[A-Za-z]+[0-9]{2,}_[0-9]\\.[a-z]+", Pattern.CASE_INSENSITIVE);
            
            
            Matcher oneFront = one_two.matcher(fileName);
            Matcher oneBack = two_one.matcher(fileName);
            //Matcher finished = two_two.matcher(fileName);

            String temp = "";
            System.out.println("out -> " + !Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName));
            int count = 0;
            while(!Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName)){
                System.out.println("In #"+count + !Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName));
                System.out.println("onefront: " + oneFront.find());
                System.out.println("oneBack: " + oneBack.find());
                if(oneFront.find()){
                    fileName = fileName.substring(0, (fileName.indexOf("_") - 1)) + '0' 
                        + fileName.substring(fileName.indexOf("_") - 1);
                        System.out.println("fileNameoneFront: " + fileName);
                }
                System.out.println("oneBack: " + oneBack.find());
                if(oneBack.find()){
                    fileName = fileName.substring(0, (fileName.indexOf("_") + 1)) + '0'
                        + fileName.substring(fileName.indexOf("_" + 1));
                        System.out.println("fileNameoneBack: " + fileName);
                }
                //fileName = temp;
                count++;
                System.out.println("new FileName: " + fileName);
                System.out.println("In #"+count + !Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName));
            }

            File newFileName = new File(fileName);
            System.out.println("All Good here...");
            if(!newFileName.exists()){
                System.out.println("did it work?");
                file.renameTo(newFileName);
            }else
                System.out.println("File already exists cannot rename");
        
        }

}