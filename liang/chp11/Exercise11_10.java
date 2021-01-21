import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_10{
    public static void main(String[] args){
        MyStack myStack = new MyStack();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter five strings: ");
        for(int i =0; i < 5; i++){
            myStack.push(input.nextLine());
        }

        System.out.println();
        System.out.println("in reverse: ");
        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

    }
}