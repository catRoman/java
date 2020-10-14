public class Exercise6_3{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("The number reversed is " + reverse(number));
        
        if(isPalindrome(number))
        System.out.println("This means the number is a palindrome");
        else
        System.out.println("This means the number is not a palindrome");


    }
    public static int reverse(int number){
        String numberString = "" + number;
        int reverse = 0;
        String temp = "";

        for(int i = numberString.length()-1; i >= 0; i--){
            temp += numberString.charAt(i);
        }

        reverse = Integer.parseInt(temp);

        return reverse;
    }   

    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
          
}