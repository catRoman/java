import java.util.ArrayList;
import java.util.Scanner;

/** Exercise 2 Chapter 13
 * Intro to Java by Liang
 * 
 * Average arrayList
 * 
 * @author Cat Roman 2020-01-20
 */
public class Exercise13_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.print("Enter a list of integers: ");
        String numberList = input.nextLine();
        Scanner stringReader = new Scanner(numberList);
        while(stringReader.hasNextInt()){
            myList.add(stringReader.nextInt());
        }
        input.close();
        stringReader.close();

        System.out.print("The average is " );
        average(myList);
        System.out.println();
        
    }
    public static void average(ArrayList<Integer> list){
        int total = 0;
        int count = 0;
        for(Integer e : list){
            total += e.intValue();
            count++;
        }
        System.out.print(total / count);
    }
}