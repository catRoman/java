// (Math: combinations) Write a program that prompts the user to enter 10 integers
// and displays all combinations of picking two numbers from the 10.



//tired of this question... its about a method to eliminate duplicates .. cant think straight will
// move on to the next question and come back and do.

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
/*
        int count = 0;
        for(int i = 0; i< list.length; i++){
            for(int j= 0; j < list.length; j++){
                if(list[i] == list[j] && i != j){
                    count++;
                    break;
                }
            }
        }
        int[] newList = new int[list.length-count];

        for(int i = 0; i< list.length; i++){
            for(int j= 0; j < list.length; j++){
                if(list[i] == list[j] && i != j){
                    break;
                }else
                    newList[i]=list[i];
            }
        } 
*/
        System.out.println();
        System.out.println("The combination are: ");
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j< list.length; j++){
               if(i !=j)
                System.out.println(list[i] + " " + list[j]);
            }
        }

    }
}