import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercise11_13{
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < 10; i++){
            myList.add(input.nextInt());
        }

        removeDuplicate(myList);

        System.out.print("The distinct integers are ");
        for(Integer e : myList){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void removeDuplicate(ArrayList<Integer> list){
       // Collections.sort(list);
        for(int i = 0; i< list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).equals(list.get(i))){
                    list.remove(j);
                }
            }
            
        }
    }
}