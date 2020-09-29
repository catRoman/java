import java.util.Scanner;

public class Exercise3_7{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);


    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;
    int numberOfDimes = remainingAmount /10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    int numberOfPennies = remainingAmount;

    System.out.println("Your amount " + amount + " consists of");
    pluralFunction(numberOfOneDollars, "dollar");
    pluralFunction(numberOfQuarters, "quarter");
    pluralFunction(numberOfDimes, "dime");
    pluralFunction(numberOfNickels, "nickel");
    pluralFunction(numberOfPennies, "penn");   
    }
    public static void pluralFunction(int quantity, String singular){
        if(singular == "penn" && quantity == 1){
            System.out.println("\t" + quantity + " " + singular + "y");
        } else if (singular == "penn" && quantity != 1){
                System.out.println("\t" + quantity + " " + singular + "ies");
            
        } else if(quantity == 1){
            System.out.println("\t" + quantity + " " + singular);
        } else if(quantity > 1){
                System.out.println("\t" + quantity + " " + singular + "s");
            }
        }
    }
