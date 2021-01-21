/** 
    (Strictly identical arrays) The arrays list1 and list2 are strictly identical
    if their corresponding elements are equal. Write a method that returns true if
    list1 and list2 are strictly identical, using the following header:
    public static boolean equals(int[] list1, int[] list2)
    Write a test program that prompts the user to enter two lists of integers and dis-
    plays whether the two are strictly identical. Here are the sample runs. Note that
    the first number in the input indicates the number of the elements in the list. This
    number is not part of the list. 

    Enter list1: 5 2 5 6 1 6
    Enter list2: 5 2 5 6 1 6
    Two lists are strictly identical

    Enter list1: 5 2 5 6 6 1
    Enter list2: 5 2 5 6 1 6
    Two lists are not strictly identical
    */
    import java.util.Scanner;
    import java.util.Arrays;

    public class Exercise7_26{
        public static void main(String [] args){
           
            

                int[][] inputs = inputList(2);
            


            if(equals(inputs[0], inputs[1]))
                System.out.println("The lists are strictly equal");
            else    
                System.out.println("The list are not strictly equal");
            
            
          
        }
        public static boolean equals(int[] list1, int[] list2){
            
            for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i])
                return false;
            }
            return true;
        } 

        public static int[][] inputList(int numberOfLists){
           
            Scanner input = new Scanner(System.in);

            int[][] lists = new int[numberOfLists][];

            for(int i= 0; i < numberOfLists; i++){
                System.out.print("Enter List" + (i + 1) + ": ");
            int arrayLength = input.nextInt();
            lists[i] = new int[arrayLength];
            
                for(int j = 0; j < arrayLength; j++){
                    lists[i][j] = input.nextInt();
            }
            }
        return lists;
        }
    }