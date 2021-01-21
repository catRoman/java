import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_18{
    public static void main(String[] args)
        throws IOException{
            if(args.length != 1){
                System.out.println("Usage Error: java Exercise12_18 [srcRootDirectory]");
                System.exit(1);

            }
            File srcRootDirectory = new File(args[0]);
            getWorking(srcRootDirectory);
        }


public static void getWorking(File srcRootDirectory)
    throws IOException{
            
            //directoryExists(srcRootDirectory);

            File[] subDirectory = srcRootDirectory.listFiles();

            packageWriter(subDirectory);
          //  for(File e : subDirectory){
                
           //         packageWriter(e);
                    
           // }
            

        }
public static void directoryExists(File directoryLocation)
    throws IOException{
           // File directoryLocation = new File(directory);
            
            if(!directoryLocation.exists()){
                System.out.println(directoryLocation + " does not exist");
                System.exit(1);
            }

            if(!directoryLocation.isDirectory()){
                System.out.println(directoryLocation + " is not a directory");
                System.exit(2);
            }
        }
        public static void packageWriter(File[] fileList)
            throws IOException{
        //directoryExists(directoryLocation);

            ArrayList<File> srcRootFiles = new ArrayList<>();
            //File[] fileList = directoryLocation.listFiles();
            
            //for just geting the chp num... not need just changed the package name to the 
            //root folder name will adjust once i know more about packages

            /**
            String chpNumString = "";
            for(int i = 0; i < directoryLocation.getName().length(); i++){
                if(directoryLocation.getName().n("Usage Error: java Exercise12_18 [srcRootDirectory]");
                System.exit(1);charAt(i) >= '0' &&
                directoryLocation.getName().charAt(i) <= '9')
                    chpNumString += directoryLocation.getName().charAt(i);
            }
            int chpNum = Integer.parseInt(chpNumString);

            */
        for(File e : fileList){
            
            if(e.getName().contains(".java"))
                srcRootFiles.add(e);
            if(e.isDirectory())
                getWorking(e);

        }
                
        ArrayList<ArrayList<String>> fileContent = new ArrayList<>();
        
        for(int i = 0; i < srcRootFiles.size(); i++){
            fileContent.add(i,new ArrayList<String>());
        }

        for(int i = 0; i < srcRootFiles.size(); i++){
            try(Scanner fileScan = new Scanner(srcRootFiles.get(i))){
                    while(fileScan.hasNext()){
                        fileContent.get(i).add(fileScan.nextLine());
                    }
            }
        }

        for(int i = 0; i < srcRootFiles.size(); i++){
            try(PrintWriter packagePrint = new PrintWriter(srcRootFiles.get(i))){
                        fileContent.get(i).add(0, "package " + fileList[i].getParent() + ";");
            
                        for(String e : fileContent.get(i))
                            packagePrint.println(e); 
            }
        }
    
    }
}