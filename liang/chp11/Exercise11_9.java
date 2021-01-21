import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercise11_9{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the matrix size: ");
        int dim = input.nextInt();
        int[][] myArr = new int[dim][dim];
        
        System.out.println();
        System.out.println("The random Matrix is: ");
        
        myArr = randomizeArray(myArr);
        printArray(myArr);

        ArrayList<Integer> rowOnes = numOfOnesRows(myArr);
        ArrayList<Integer> columnOnes = numOfOnesColumns(myArr);

        ArrayList<Integer> maxRows = maxNum(rowOnes);
        ArrayList<Integer> maxColumns = maxNum(columnOnes);

        printArrayList("row", maxRows);
        printArrayList("column", maxColumns);
    }
    public static int[][] randomizeArray(int[][] myArr){
        for(int i =0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                myArr[i][j] = (int)(Math.random() * 2);
            }
        }
        return myArr;
    }
    public static void printArray(int[][] myArr){
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j< myArr[i].length; j++){
                System.out.print(myArr[i][j]);
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> numOfOnesRows(int[][] myArr){
        ArrayList<Integer> myRowList = new ArrayList<>();

        int count = 0;
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                if(myArr[i][j] == 1)
                    count++;
            }
            myRowList.add(count);
            count = 0;
        }
        return myRowList;
    }
    public static ArrayList<Integer> numOfOnesColumns(int[][] myArr){
        ArrayList<Integer> myColumnList = new ArrayList<>();
        int count = 0;
        for(int i= 0; i < myArr[0].length; i++){
        for(int j = 0; j < myArr.length; j++){
            if(myArr[j][i] == 1)
                count++;
            }
            myColumnList.add(count);
            count = 0;
        }
        return myColumnList;
    }
    public static ArrayList<Integer> maxNum(ArrayList<Integer> myArrayList){
        ArrayList<Integer> maxNumList = new ArrayList<>();

        Integer max = Integer.valueOf(Collections.max(myArrayList));
        int index = 0;
        for(Integer e : myArrayList){
            if(e.equals(max))
                maxNumList.add(index);
            index++;
        }
        return maxNumList;
    }
    public static void printArrayList(String rowOrColumn, ArrayList<Integer> myArrList){
        System.out.print("The largest " + rowOrColumn + " index: ");
        int count = 1;
        for(Integer e : myArrList){
            if(myArrList.size() != count){
            System.out.print((e + 1) + ", ");
            count++;
            }else
            System.out.println(e + 1);
        }
    }

}