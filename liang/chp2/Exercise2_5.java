import java.util.Scanner;

class Exercise2_5{

public static int addEmUp(int adjInput){
    int tally = 0;
    for(int i = 0; i < 4; i++){
    tally += (adjInput % 10);
    adjInput /= 10;
    }

    return tally;
}


    static public void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter a number between 0 and 1000: ");
int number = input.nextInt();

System.out.println("The sum of the digits is " + addEmUp(number));


    }
}