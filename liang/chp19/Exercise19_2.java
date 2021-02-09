public class Exercise19_2{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        GenericStack2<String> data =  new GenericStack2<>();
        System.out.println("Enter five strings:");
        for(int i= 0; i < 5; i++){
            data.push(input.nextLine());
        }
        System.out.println("output:");
        for(int i =0; i < 5; i++){
            System.out.print(i + ": ");
            System.out.println(data.pop());
        }
        System.out.println("Good-Bye");
    }
}