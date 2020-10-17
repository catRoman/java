public class Exercise5_50{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String stringOne = input.nextLine();

        int upperCaseCount = 0;

        for(int i = 0; i < stringOne.length(); i++){

            if((int)stringOne.charAt(i) < (int)'a' && (int)stringOne.charAt(i) >= (int)'A')
                upperCaseCount++;

        }
        System.out.println("The number of uppercase letters is " + upperCaseCount);
    }
}