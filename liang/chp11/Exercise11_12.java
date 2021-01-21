import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();

        System.out.print("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++){
            myList.add(input.nextDouble());
        }
        System.out.println();
        System.out.println("There sum is " + sum(myList));
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for(Double e : list){
            sum += e;
        }
        return sum;
    }
}