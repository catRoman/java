import java.util.regex.*;
import java.util.Arrays;
import java.lang.Exception;
import java.util.ArrayList; //change to container
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class RegexTester{
    //RED
    public static final String RED = "\033[0;31m"; 
    public static final String BLUE = "\033[0;34m";    // BLUE
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset  
    public static void main(String[] args){
   try{
        if(args.length < 2){
            System.out.println("Error use: [regEx] [optional condition] [string to be searched]" );
            System.exit(1);
        }
        if(args.length >= 2){
            if(args[0].charAt(0) == '-'){
                //add each char condition to stack until no spacetoken
                if(args[0].length() == 2) 
                        conditions(args[0].charAt(1), args);
                else
                    //create custom exception?
                    throw new Exception("condition \'" + args[0] + "\' not recognized");
            }else
                searchString(args[0], message(1, args));
            
        }
        System.out.println();
    }catch(Exception ex){
        System.out.println(ex);
    }
    }
    //create conditionclass interface, create conditional class template
    public static void conditions(char condition, String[] args) //turn to stack-array/container
        throws Exception{
        switch(condition){
            //add conditional to match all methods
            case 'i': 
            {
                searchString(args[1], message(2, args));
                indexPrint(args[1], message(2 ,args)); 
                break; 
            }
            case 'f':{
                fileInput(args);
                break;
            }
            case 'd':{
                searchString(args[1], message(2, args));
                displayCount(args[1], message(2, args));
                break;
            }
            default: {
                throw new Exception("condition \'-" + condition + "\' not recognized");
            }
        }
    }
    public static String message(int startIndex, String[] args){
        String message = "";
        for(int i = startIndex; i< args.length; i++){
                message += args[i];
                if(args[i] != args[args.length -1]){
                    message += " ";
                } 
            }
            return message;
    }
    
    public static void indexPrint(String regex, String message){
        Pattern pIP = Pattern.compile(regex);
        Matcher mIP = pIP.matcher(message);

        System.out.println("\t----------------------------------------------------------------");
        while(mIP.find()){
            System.out.println("\tMatcher found " + mIP.group() + " at index "+ RED +
                    + mIP.start() + RESET + " for regex " + regex + " in string \"" + message + "\"");
        }
        System.out.println("\t-----------------------------------------------------------------");
    }
    
    public static void searchString(String regex, String message){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(message);
        boolean[] contained = new boolean[message.length()];
        boolean foundIt = false;
        String wtf = "";
        
        while(m.find()){
            wtf += m.start() + "." + m.end() + "-";
            foundIt = true;
        }

        if(!foundIt){
            System.out.println(message + BLUE + " -> " + RESET + " No matches found");
            return;
        }
   
        String[] indexMatched = wtf.split("-");
        String preDot = "";
        String postDot = "";
        int start = 0;
        int end = 0;
        String displayMessage = "";
        
        for(String e : indexMatched){
            preDot = e.substring(0,e.indexOf('.'));
            postDot = e.substring(e.indexOf('.') + 1);   
            start = Integer.parseInt(preDot);
            end = Integer.parseInt(postDot);
      
            if(end - start == 1)
                contained[start] = true;
            else if(end - start > 1){
                for(int i = start; i < end; i++)
                    contained[i]=true;   
            }
        }
        for(int i = 0; i < message.length(); i++){
            if(contained[i])
                displayMessage += RED + message.charAt(i) + RESET;
            else
                displayMessage += message.charAt(i);
        }

        System.out.println(displayMessage);
    }
    public static void fileInput(String[] args)
        throws IOException{
            ArrayList<File> fileList = new ArrayList<>();

            for(int i = 2; i < args.length; i++){
                fileList.add(new File(args[i]));
            }
            for(File e: fileList){
                if(!e.exists()){
                    System.out.println("Error:  " + e + " does not exist");
                }else if(!e.canRead()){
                    System.out.println("Error: cannot read " + e);
                }else if(e.isDirectory()){
                    System.out.println("Error: " + e + " is a directory");
                }else {
                    scanFile(e, args);
                }     
            }
    }
    public static void scanFile(File file, String[] args)
        throws IOException{
            ArrayList<String> fileContent = new ArrayList<>();

            try(Scanner input = new Scanner(file)){
                while(input.hasNext()){
                    fileContent.add(input.nextLine());
                }
            }
            System.out.println(BLUE + file + RESET);
            int count = 1;
            for(String e : fileContent){
                System.out.print("Line: " + count + BLUE + " -> " + RESET);
                searchString(args[1], e);
                count++;
            }
        }
    public static void displayCount(String regex, String message){
        Matcher dm = Pattern.compile(regex).matcher(message);
        System.out.println();
        System.out.println("\tGroup count: " + RED + dm.groupCount() + RESET);
        System.out.println("---------------------------------");
      while(dm.find()){
        for(int i =1; i <= dm.groupCount(); i++){
            System.out.println(BLUE + i + RESET + ": " + dm.group(i) + " -> " + BLUE + dm.group(i) + RESET);
        }
    }
    }
    
}