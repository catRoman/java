public class Exercise5_38{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a integer to convert to octal: ");
        int number = input.nextInt();
        int ogNumber = number;
        int remainder = 0;
        String tempNum = "";
        while(number > 0){
            remainder = number % 8;
            tempNum = remainder + tempNum;
            number = number / 8;

        }
        int octal = Integer.parseInt(tempNum);

        System.out.println("The original number was " + ogNumber
                        + " the new octal number is " + octal);
    }
}