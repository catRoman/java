public class Exercise5_46{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a String: ");
        String stringOne = input.nextLine();

        String reverseString = "";
  

        for(int i = 0; i< stringOne.length(); i++){
            reverseString = stringOne.charAt(i) + reverseString;
        }
        System.out.println("The reverse string is: " + reverseString);
    }
}