import java.util.Scanner;
public class Exercise4_8{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ESCII code: ");
        byte code = input.nextByte();

        if(code > 127){
            System.out.println("Too large of a code entered for ASCII");
            System.exit(1);
        } else{
            char convert = (char)code;

            System.out.println("The character you entered is " + convert);

        }

    }
}