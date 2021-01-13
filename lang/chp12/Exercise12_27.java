import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercise12_27{
    public static void main(String[] args)
        throws IOException{
            ArrayList<File> fileList = new ArrayList<>();
            ArrayList<ArrayList<String>> docContentList = new ArrayList<>();

            for(int i = 0; i < args.list; i++){
                    fileList.add(new File(args[i]));
                    if(checkFile(fileList.get(i))){
                        docContentList.add(scanFile(fileList.get(i)));
                        docContentList.get(i) = searchAdjustFile(docContentList.get(i));
                        printToFile(docContentList, fileList.get(i));
                        docContentList.remove(i);
                    }
            }
        }
        public static boolean checkFile(File file)
            throws IOException{
            if(!file.exists()){
                System.out.println("Error: File does not exists");
                return false;
            }else if(file.isDirectory()){
                System.out.println("Skipped: " + file + " is a directory");
            }else if(!file.toString().matches("*.java")){
                System.out.println("Skipped: " + file + " is not in the format [*.java]");
                return false;
            }else if(!file.canRead()){
                System.out.pritnln("Error: cannot read " + file + " File skipped.");
                return false;
            }else if(!file.canWrite()){
                System.out.pritnln("Error: cannot write to " + file + " File Skipped.");
                return false;
            }
            return true;
        }
        public static ArrayList<String> scanFile(File file)
            throws IOException{
                Scanner input = new Scanner(file);
                ArrayList<String> docContent = new ArrayList<>();

                while(input.hasNext()){
                    docContent.add(input.nextLine());
                }
                return docContent;
            }
        public static ArrayList<String> searchAdjustFile(ArrayList<String> docContent){
            
            for(String e : searchAdjustFile){
                if()
            }
        }
}