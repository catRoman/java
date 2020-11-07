/**(Revise selection sort) In Section 7.11, you used selection sort to sort an array.
The selection-sort method repeatedly finds the smallest number in the current
array and swaps it with the first. Rewrite this program by finding the largest num-
ber and swapping it with the last. Write a test program that reads in ten double
numbers, invokes the method, and displays the sorted numbers. s*/

import java.util.Scanner;

public class Exercise7_20{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        double[] list = new double[10];
        for(int i =0; i < list.length; i++){
            list[i] = input.nextDouble();
        }
        
        highLast(list);

        System.out.println();
        System.out.println(java.util.Arrays.toString(list));

    }

    public static void highLast(double[] list){

        int currentMax = list.length-1;
        double temp = 0;

        for(int i = list.length-1; i >= 1; i--){
            for(int j = list.length -2; j >= 0; j--){
                if(list[currentMax] < list[j])
                    currentMax = j;
            if(currentMax != i){
                temp = list[currentMax];
                list[currentMax] = list[j];
                list[j] = temp;
            }
            }    
        
        }
    }
}