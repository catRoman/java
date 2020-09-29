import java.util.Scanner;

public class Exercise3_8{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter three numbers: ");
    int numOne = input.nextInt();
    int numTwo = input.nextInt();
    int numThree = input.nextInt();
    
    int large = 0;
    int medium = 0;
    int small = 0;

    if (numOne >= numTwo && numOne >= numThree){
        large = numOne;
    }else if(numTwo >= numOne && numTwo >= numThree){
        large = numTwo;
    }else if(numThree >= numOne && numThree >= numTwo){
        large = numThree;
    }
    if(large == numOne && numTwo >= numThree){
        medium = numTwo;
        small = numThree;
    }else if(large == numOne && numThree >= numTwo){
        medium = numThree;
        small = numTwo;
    }else if (large == numTwo && numOne >= numThree){
        medium = numOne;
        small = numThree;
    }else if (large == numTwo && numThree >= numOne){
        medium = numThree;
        small = numOne;
    }else if (large == numThree && numOne >= numTwo){
        medium = numOne;
        small = numTwo;
    }else if (large == numThree && numTwo >= numOne){
        medium = numTwo;
        small = numOne;
    }

    System.out.println("The numbers in non-decending order are as followed: " + small + " " + medium + " " + large);
}
}