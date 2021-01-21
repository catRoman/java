import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class Exercise12_14{
    public static void main(String[] args)
        throws IOException{
    
    String name = "";
    String sourceLocation = "";
    boolean loop = true;
    File sourceFile;
    try(Scanner input = new Scanner(System.in)){
        System.out.println("Enter a name: ");
        name = input.nextLine();
        do{
        System.out.println("Enter file name: ");
        sourceLocation = input.nextLine();
        sourceFile = new File(sourceLocation);
        if(sourceFile.exists()){
            loop = false;
        }else
            System.out.println("Error: file does not exist.");
        }while(loop);
    }

    int namePosition = readInFile(name, sourceFile);

    if(namePosition >= 0){
        System.out.println("The name " + name + " is located"
                        + " on line " + namePosition);
    }else
        System.out.println(name + " is not currently on the list. Peace");
    }
    public static int readInFile(String line, File file)
        throws IOException{
            ArrayList<String> nameList = new ArrayList<>();
            
            try(Scanner input = new Scanner(file)){
               while(input.hasNext())
                nameList.add(input.nextLine());
            }
            for(String e : nameList){
                
                if(e.equals(line))

                return nameList.indexOf(line) + 1;
            }
                return -1;
               
            }

    }
