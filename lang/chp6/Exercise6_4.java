public class Exercise6_4{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverse(number);
        
        

    }
    public static void reverse(int number){
        String numberString = "" + number;
       
        String temp = "";

        for(int i = numberString.length()-1; i >= 0; i--){
            temp += numberString.charAt(i);
        }

        System.out.println("The number is " + temp);

        
    }   

    
          
}