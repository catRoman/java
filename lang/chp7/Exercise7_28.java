// (Math: combinations) Write a program that prompts the user to enter 10 integers
// and displays all combinations of picking two numbers from the 10.





import java.util.Scanner;
import java.util.Arrays;

public class Exercise7_28{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        
        int[] list = new int[10];
        System.out.print("Enter ten integers: ");

        for(int i =0; i< list.length; i++){
            list[i] = input.nextInt();
        }

        Arrays.sort(list);
        int[] temp = new int[list.length];
        int index = 0;

        for(int i = 0; i < list.length -1; i++){ 
                if(list[i] != list[i + 1])
                    temp[index++] = list[i];
        }

        temp[index++] = list[list.length-1];

        for(int i = 0; i < index; i++){ 
            
                list[i] = temp[i];
    }

    for (int i=0; i< index; i++) 
    System.out.print(list[i]+" "); 

        System.out.println();
        System.out.println("The combination are: ");
        for(int i = 0; i < index; i++){
            for(int j = 0; j< index; j++){
               if(i !=j)
                System.out.println(list[i] + " " + list[j]);
            }
        }

    }
}