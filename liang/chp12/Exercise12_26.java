import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.io.IOException;

/**First time playing with regex couldnt get matcher to work i think i just made it too complicated
 * should have established my regex in strnig first to keep them tigh and carried on .find() was showing true but
 * not allowing if parameter to recognize it not sure something got jumbled untill next time regex.....
 */

public class Exercise12_26{
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
                
                if(Pattern.matches("[A-Za-z]+[0-9]{1,2}_[0-9]{1,2}\\.java", e.toString())){
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
            System.out.println("filename before padding loop: " + fileName);

            /**Pattern two_two = Pattern.compile("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java", Pattern.CASE_INSENSITIVE);
            Pattern one_two = Pattern.compile("[A-Za-z]+[0-9]_.+\\.[a-z]+", Pattern.CASE_INSENSITIVE);
            Pattern two_one = Pattern.compile("[A-Za-z]+[0-9]{1,}_[0-9]\\.[a-z]+", Pattern.CASE_INSENSITIVE);
            
            
            Matcher oneFront = one_two.matcher(fileName);
            Matcher oneBack = two_one.matcher(fileName);
            //Matcher finished = two_two.matcher(fileName);
            */
            String temp = "";
            System.out.println("directly outside loop parameter-> " + !Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName));
            System.out.println();
            int count = 0;
       
            while(!Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName)){
                System.out.println("Inside loop #"+count + "-->" + !Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName));
                System.out.println("fileName:" + fileName);
               // System.out.println("\tIs there only one digit in front: " + oneFront.find());
               // System.out.println("\tIs there only on digit in back: " + oneBack.find());
                
                //oneFront
                if(Pattern.matches("[A-Za-z]+[0-9]_.+\\.[a-z]+", fileName)){
                    System.out.println("\t\tInside oneFront...");
                    fileName = fileName.substring(0, (fileName.indexOf("_") - 1)) + '0' 
                        + fileName.substring(fileName.indexOf("_") - 1);
                        System.out.println("\t\t----------temponeFront:" + fileName);
                }
                //fileName = temp;
               // System.out.println("\tOuside oneFront. Value of oneBack now: " + oneBack.find());
                System.out.println("fileName: " + fileName);
                
                //onBack
                if(Pattern.matches("[A-Za-z]+[0-9]{1,}_[0-9]\\.[a-z]+", fileName)){
                    System.out.println("\t\tInside oneBack...");
                    fileName = fileName.substring(0, (fileName.indexOf("_") + 1)) + '0'
                        + fileName.substring(fileName.indexOf("_") + 1);
                        System.out.println("\t\t-------temponeBack: " + fileName);
                }
                
                System.out.println("\tOutside oneBack...");
               // System.out.println("\t\tValue of oneFront: " + oneFront.find());
               // System.out.println("\t\tValue of oneBack: " + oneBack.find());
                System.out.println("fileName: " + fileName);
                
                count++;
                
                System.out.println("new FileName: " + fileName);
                System.out.println("Still in loop #"+count + " while parameter-->" 
                            + !Pattern.matches("[A-Za-z]+[0-9]{2}_[0-9]{2}\\.java",fileName));
                System.out.println();
            }
            System.out.println("outside loop");
            File newFileName = new File(fileName);
            
            if(!newFileName.exists()){
                System.out.println("did it work?");
                file.renameTo(newFileName);
            }else
                System.out.println("File already exists cannot rename");
        
        }

}