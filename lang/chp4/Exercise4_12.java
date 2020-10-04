import java.util.Scanner;

public class Exercise4_12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

       System.out.print("Enter a string of Hex code: ");
       String hexCodeInput = input.nextLine();
    
       hexCodeInput = hexCodeInput.toUpperCase();
    
       
       String binaryString = "";

       for(int i = 0; i < hexCodeInput.length(); i++){
           char character = hexCodeInput.charAt(i);
        int charNum = 0;
        
           if (character >= '0' && character <= '9'){
            charNum = (int)character - 48;
            binaryString += converterFunction(charNum);
           } else if(character >= 'A' && character <= 'F'){
               charNum = (int)character - 55;
               binaryString += converterFunction(charNum);
           } else
            System.exit(1);
       }
       //int wholeBinaryNumber = Integer.parseInt(binaryString);
       while (binaryString.charAt(0) == '0')
           binaryString = binaryString.substring(1);
       
       System.out.println("The binary code is: " + binaryString);
    }
 public static String converterFunction(int charNum){
 
    int remainder = 0;
    String binaryNum = "";
    for(int i = 8; i >= 1; i = i / 2){
    remainder =charNum / i;
    if(remainder == 0){
        binaryNum += "0";
    }else {
        binaryNum += "1";
        charNum -= i;
       }
    
}
    return binaryNum;
}
}