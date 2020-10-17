public class Exercise5_37{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
         int remainder = 0;
         String tempNumber = "";
         int ogNumber = number;
        while(number > 0){
            remainder = number % 2;
            tempNumber = remainder + tempNumber;

            number = number / 2;
            
            
            
                
            

        }
        int binary = Integer.parseInt(tempNumber);
        System.out.println("The decimal integer was " + ogNumber 
                        +   " and the binary number is " + binary);
    }
}