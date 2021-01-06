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
        for(int i = 0; i < srcRootFiles.size(); i++){
            try(Scanner fileScan = new Scanner(srcRootFiles.get(i))){
              //  for(int i = 0; i < srcRootFiles.size(); i++){
                    while(fileScan.hasNext()){
                        fileContent.get(i).add(fileScan.nextLine());
                    }
               // }
            }
        }
    
    for(int i = 0; i < srcRootFiles.size(); i++){
        System.out.println(srcRootFiles.get(i));
        System.out.println();
        for(String f : fileContent.get(i)){
            System.out.println(f);
        }
        System.out.println();
    }
    System.out.println("----------------------");
    
    for(int i = 0; i < srcRootFiles.size(); i++){
        try(PrintWriter packagePrint = new PrintWriter(srcRootFiles.get(i))){
          //  for(int i = 0; i < srcRootFiles.size(); i++){
                    fileContent.get(i).add(0, "package ");
                    for(String e : fileContent.get(i))
                        packagePrint.println(e);
                
           // }
        }
    }
    for(int i = 0; i < srcRootFiles.size(); i++){
        System.out.println(srcRootFiles.get(i));
        System.out.println();
        for(String f : fileContent.get(i)){
            System.out.println(f);
        }
        System.out.println();
    }
}
}