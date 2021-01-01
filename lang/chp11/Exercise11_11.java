import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercise11_11{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.print("Enter 5 numbers: ");
         for(int i =0; i < 5; i++){
             myList.add(input.nextInt());
         }

         sort(myList);
    }
    public static void sort(ArrayList<Integer> list){
        ArrayList<Integer> myList = new ArrayList<>();
        
        while(!list.isEmpty()){
            myList.add(Collections.min(list));
            list.remove(list.indexOf(Collections.min(list)));
        }
        int count = myList.size();
        for(Integer e : myList){
            if(count > 1){
            System.out.print(e + ", ");
            count--;
            }
            else
            System.out.println(e);
        }   
        
        }
    }
