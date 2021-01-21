import java.util.Scanner;

public class Exercise3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN9Digits = input.nextInt();


        int d9 = ISBN9Digits % 10;
        int d8 = (ISBN9Digits % 100)/10;
        int d7 = (ISBN9Digits % 1000)/100;
        int d6 = (ISBN9Digits % 10000)/1000;
        int d5 = (ISBN9Digits % 100000)/10000;
        int d4 = (ISBN9Digits % 1000000)/100000;
        int d3 = (ISBN9Digits % 10000000)/1000000;
        int d2 = (ISBN9Digits % 100000000)/10000000;
        int d1 = (ISBN9Digits % 1000000000)/100000000;
       
        int ISBN10thDigit = (d1 * 1 
                            + d2 * 2 
                            + d3 * 3
                            + d4 * 4
                            + d5 * 5
                            + d6 * 6
                            + d7 * 7
                            + d8 * 8
                            + d9 * 9) % 11;
        System.out.println();
        System.out.print("The ISBN-10 number is ");

        if (ISBN10thDigit == 10){
            System.out.println(d1+""
                            +d2+""
                            +d3+""
                            +d4+""
                            +d5+""
                            +d6+""
                            +d7+""
                            +d8+""
                            +d9+"X");
        }else{
            System.out.println(d1+""
                            +d2+""
                            +d3+""
                            +d4+""
                            +d5+""
                            +d6+""
                            +d7+""
                            +d8+""
                            +d9+""
                            +ISBN10thDigit);
        }
    }
}