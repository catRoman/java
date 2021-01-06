import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_18{
    public static void main(String[] args)
        throws IOException{
            if(args.length > 1){
                System.out.println("Usage Error: java Exercise12_18 [srcRootDirectory]");
                System.exit(1);
            }


           

            File directoryLocation = new File(args[0]);
            
            if(!directoryLocation.exists()){
                System.out.println(args[0] + " does not exist");
                System.exit(1);
            }

            if(!directoryLocation.isDirectory()){
                System.out.println(args[0] + " is not a directory");
                System.exit(2);
            }

            ArrayList<File> srcRootFiles = new ArrayList<>();
            File[] fileList = directoryLocation.listFiles();

            for(File e : fileList){
                if(e.getName().contains(".java"))
                srcRootFiles.add(e);
            }
            
            
        ArrayList<ArrayList<String>> fileContent = new ArrayList<>();
        
        for(int i = 0; i < srcRootFiles.size(); i++){
            fileContent.add(i,new ArrayList<String>());
        }
        for(File e : srcRootFiles){
            try(Scanner fileScan = new Scanner(e)){
                for(int i = 0; i < srcRootFiles.size(); i++){
                    for(int j= 0; fileScan.hasNext(); j++){
                        fileContent.get(i).add(j,fileScan.nextLine());
                    }
                }
            }
        }
    for(int i = 0; i < srcRootFiles.size(); i++){
        System.out.println(srcRootFiles.get(i));
        System.out.println();
        for(String f : fileContent.get(0)){
            System.out.println(f);
        }
        System.out.println();
    }
    
}
}