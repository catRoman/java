import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_14{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter 5 numbers for list1: ");

        for(int i = 0; i < 5; i++){
            list1.add(input.nextInt());
        }
        System.out.print("Enter 5 numbers for list2: ");

        for( int i = 0; i < 5; i++){
            list2.add(input.nextInt());
        }

        System.out.print("The combined list is ");

        for(Integer e : union(list1, list2)){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> unionList = new ArrayList<>();
        for(Integer e : list1){
            unionList.add(e);
        }
        for(Integer e : list2){
            unionList.add(e);
        }
        return unionList;
    }
}