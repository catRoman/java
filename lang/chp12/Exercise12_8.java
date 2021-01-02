
import java.util.Scanner;
public class Exercise12_8{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
try{
System.out.println("The decimal value for hex number " 
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
}catch(HexFormatException ex){
    System.out.println(ex);
}
    }

    public static int hexToDecimal(String hex)
        throws HexFormatException{
        for(int i =0; i < hex.length(); i++){
            if((hex.charAt(i) < 'A' || hex.charAt(i) > 'F') && 
            (hex.charAt(i) < '0' || hex.charAt(i) > '9'))
                throw new HexFormatException("String is not in hex format", hex);
        }
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}