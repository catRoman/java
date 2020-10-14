import javax.lang.model.util.ElementScanner6;

class RaindropConverter {
public static void main(String[] args){}
    String convert(int number) {
        
        String convertedNumber = "";

        boolean threeCheck = (number % 3 == 0);
        boolean fiveCheck = (number % 5 == 0);
        boolean sevenCheck = (number % 7 == 0);

        if(threeCheck || fiveCheck || sevenCheck){
            while(threeCheck || fiveCheck || sevenCheck){
                if (threeCheck){
                    convertedNumber += "Pling";
                    number /= 3;
                }else if (fiveCheck){
                    convertedNumber += "Plang";
                    number /= 5;
                }else if (sevenCheck){
                    convertedNumber += "Plong";
                    number /= 7;
                }
            }
        }else
            convertedNumber += number; 
        
        return convertedNumber;
    }

}
