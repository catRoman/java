public class Exercise6_6{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of iterations: ");
        int n = input.nextInt();

        displayPattern(n);


    }
    public static void displayPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--)
                System.out.print("  ");
          for(int j = i + 1; j > 0; j--)
                System.out.printf("%d ", j);
       
        System.out.println();        
        }
    }
}