public class Exercise5_47{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println(Character.getNumericValue('9'));
        System.out.print("Enter the first 12 digits of an ISN-13 as a string: ");
        String digits = input.nextLine();
         
        int convertedSum = 0;
        int ISBN13 = 0;

        if(digits.length() == 12 ){
            for(int i =0; i < digits.length(); i++){
                if((i + 1) % 2 == 0){
                    convertedSum += Character.getNumericValue(digits.charAt(i));
                }else{
                    convertedSum += (3 * Character.getNumericValue(digits.charAt(i)));
                }
            }

        if(convertedSum == 10){
            
            convertedSum = 0;
            ISBN13 = 10 - convertedSum % 10;
            digits = digits + ISBN13;

            System.out.println("The ISBN-13 number is " + digits); 
            }else{
                ISBN13 = 10 - convertedSum % 10;
                digits = digits + ISBN13;
                System.out.println("The ISBN-13 number is " + digits);
            }

        }else{
            System.out.println(digits + " is an invalid input");
        }
    
    }
}
