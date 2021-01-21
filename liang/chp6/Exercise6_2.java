public class Exercise6_2{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        System.out.println("The sum of the digits is " + sumDigits(number));
    }

    public static int sumDigits(long n){
        String num = n + "";
        int total = 0;
        for(int i = 0; i < num.length(); i++){
            total += (n % 10) ;
            n /= 10;
        }
        return total;
    }
}