import java.util.Scanner;

public class Exercise4_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.next();
        boolean vowel = false;
        if (Character.isLetter(letter.charAt(0))){
           
            switch(letter.charAt(0)){
                case 'a': vowel = true; break;
                case 'A': vowel = true; break;
                case 'e': vowel = true; break;
                case 'E': vowel = true; break;
                case 'i': vowel = true; break;
                case 'I': vowel = true; break;
                case 'o': vowel =true; break;
                case 'O': vowel = true; break;
                case 'u': vowel = true; break;
                case 'U': vowel = true; break;
                case 'y': vowel = true; break;
                case 'Y': vowel = true; break;
                default: vowel = false; break;  
            }
            if(vowel){
                System.out.println("The character " + letter.charAt(0) + " is a vowel");
            }else{
                System.out.println("The letter " + letter.charAt(0) + " is a consonant");
            }
        } else {
            System.out.println("The character " + letter.charAt(0) + " is invalid");
            System.exit(1);
        }

    }
}