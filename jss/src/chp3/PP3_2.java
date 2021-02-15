package chp3;

public class PP3_2{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String temp = input.nextLine();
        ArrayStack<Character> stack = new ArrayStack<>();

        for(int i = 0; i < temp.length(); i++){
            stack.push(temp.charAt(i));
        }
        StringBuilder newString = new StringBuilder();
        while(!stack.isEmpty()){
            newString.append(stack.pop());
        }
        System.out.println("New String:");
        System.out.println(newString);
    }
}