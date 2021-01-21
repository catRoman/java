public class Exercise5_48{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a string: ");
        String stringOne = input.nextLine();

        String stringTwo = "";
        for (int i= 0; i < stringOne.length(); i++){
            if((i +1) % 2 != 0)
                stringTwo += stringOne.charAt(i);
        }
        System.out.println(stringTwo);
    }
}