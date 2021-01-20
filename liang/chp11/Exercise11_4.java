import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_4{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of integers ending with zero: ");
        
        ArrayList<Integer> list = new ArrayList<>();
        int value;
        do{
           value = input.nextInt();

           if(!list.contains(value) && value != 0)
            list.add(value);

        }while(value != 0);

        System.out.println("The max value number is " + max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty())
            return null;
        else {
            return Collections.max(list);
        }
    }
}