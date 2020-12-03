public class Exercise10_5{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int posInt = input.nextInt();

        StackOfIntegers myStack = new StackOfIntegers();
        int i = 2;
        while(i <= posInt){
            if(posInt % i == 0){
                
                myStack.push(i);
                posInt = posInt / i;
            }else
                i++;
        }
       
        int count = 5;
        while(!myStack.empty() && count > 0){
            System.out.print(myStack.pop() + " ");
            count--;
        }
        System.out.println();
    }

}