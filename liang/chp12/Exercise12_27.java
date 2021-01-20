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
    
            for(int i = 0; i < args.length; i++){
                    fileList.add(new File(args[i]));
                    if(checkFile(fileList.get(i))){
                       ArrayList<String> currentContents = searchAdjustFile(scanFile(fileList.get(i)));
                    printToFile(currentContents, fileList.get(i));
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
            }else if(!file.toString().matches(".+\\.(java|txt)")){
                System.out.println("Skipped: " + file + " is not in the format [*.java | *.txt]");
                return false;
            }else if(!file.canRead()){
                System.out.println("Error: cannot read " + file + " File skipped.");
                return false;
            }else if(!file.canWrite()){
                System.out.println("Error: cannot write to " + file + " File Skipped.");
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
          Pattern p = Pattern.compile("\\s[A-Z][a-z]+((?<frontTwo>\\d{2})|(?<frontOne>\\d))_((?<backTwo>\\d{2})|(?<backOne>\\d))");
          StringBuilder newLine;
          
          for(int i = 0; i< docContent.size(); i++){
            newLine = new StringBuilder(docContent.get(i));
            Matcher m = p.matcher(newLine);
            while(m.find()){
             //   do{
                if(m.group("frontTwo") == null &&
                    m.group("backTwo") == null){
                    newLine.insert(m.start("frontOne"), '0');
                    newLine.insert(m.end("backOne"), '0');
                }else if(m.group("frontTwo") == null){
                    newLine.insert(m.start("frontOne"), '0');
                }else if(m.group("backTwo") == null){
                    newLine.insert(m.start("backOne"), '0');
                }
              //  }while(Pattern.matches(".+\\d{2}_\\d{2}.+", newLine));
            }
            docContent.set(i, newLine.toString());
          }
          return docContent;
}
    public static void printToFile(ArrayList<String> docContent, File file)
        throws IOException{
            try(PrintWriter output = new PrintWriter(file)){
                for(String e : docContent){
                    output.println(e);
                }
            }
        }
}
