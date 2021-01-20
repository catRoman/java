import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercise11_7{
    public static void main(String[] args){
        
        Integer[] numbers = new Integer[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        for(int i = 0; i < 10; i++){
            numbers[i] = input.nextInt();
        }

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(numbers));

        shuffle(myList);
        for(Integer e : myList){
            System.out.println(e.toString());
        }
    }
    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
}