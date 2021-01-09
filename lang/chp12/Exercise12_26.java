import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Exercise12_26{
    public static void main(String[] args){
      boolean cont = true;
        do{
            try{
                System.out.print("Enter the name of a directory to create: ");
                mkDir(getConsoleInput());
                System.out.println("Directory was created successfuly");
            }catch(IOException ex)
            {
                System.out.println(ex);
            }
            System.out.print("Would you like to create another directory? ");
            String yN = "";
            do{
                yN = getConsoleInput();
                if(yN.charAt(0) == 'n' ||
                     yN.charAt(0) == 'N'){
                    cont =false;
                    break;
                }else if(yN.charAt(0) == 'y' ||
                        yN.charAt(0) == 'Y')
                    break;
                else
                    System.out.print("Enter y or n: ");
            }while(true);

        }while(cont);
        System.out.println("Good-Bye");
    }
    public static String getConsoleInput(){
        return new Scanner(System.in).next();
    }

    public static void mkDir(String name)
        throws IOException{
            File dirName = new File(name);
            if(dirName.isDirectory()){
                throw new IOException("Directory already exists");
            }else if(dirName.exists()){
                throw new IOException(dirName + "already exists.");
            }
            dirName.mkdir();
        
        }
            
    
}