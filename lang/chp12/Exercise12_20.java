public class Exercise12_10{
    public static void main(String[] args){
        
        checkDirectory(srcRootDirectory);
        removePackage(srcRootDirectory); 
    }
    if(!agrs.length == 1){
        System.out.println("Usage: java Exercise12_20 [srcRootFile]");
        System.out.exit(1);
    }
   File srcRootDirectory = new File(args[0]);
}