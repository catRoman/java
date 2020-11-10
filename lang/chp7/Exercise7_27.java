/*
    (Identical arrays) The arrays
    list1 and list2 are identical if they have the
    same contents. Write a method that returns true if list1 and list2 are identi-
    cal, using the following header:
    public static boolean equals(int[] list1, int[] list2)
    Write a test program that prompts the user to enter two lists of integers and dis-
    plays whether the two are identical. Here are the sample runs. Note that the first
    number in the input indicates the number of the elements in the list. This number
    is not part of the list.

    Enter list1: 5 2 5 6 6 1
    Enter list2: 5 5 2 6 1 6
    Two lists are identical

    Enter list1: 5 5 5 6 6 1
    Enter list2: 5 2 5 6 1 6
    Two lists are not identical

*/

import java.util.Scanner;
public class Exercise7_27{
    public static void main(String[] args){

        int[][] inputs = inputLists(2);

        displayResults(equals(inputs[0], inputs[1]));

    }
    public static void displayResults(boolean equals){
        if(equals)
            System.out.println("The lists are identical");
        else
            System.out.println("The lists are not identical");
    }

    public static boolean equals(int[] list1, int[] list2){
        boolean[] masterList = new boolean[list1.length];

        for(int i = 0; i < list1.length; i++){
            int key = list1[i];
            for(int j = 0; j < list2.length; j++){
                if(list2[j] == key){
                masterList[i] = true;
                break;
                }
            }
        }
        for(boolean e: masterList){
            if(!e)
                return false;
        }
        return true;
    }

    public static int[][] inputLists(int numberOfLists){
        Scanner input = new Scanner(System.in);
        int[][] list = new int[numberOfLists][];

        for(int i = 0; i < numberOfLists; i++){
            System.out.print("List" + (i + 1) + ": ");
            int arrayLength = input.nextInt();
            list[i] = new int[arrayLength];

            for(int j = 0; j < arrayLength; j++){
                list[i][j] = input.nextInt();
            }
        }
        return list;
    }
}