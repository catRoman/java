import java.util.Scanner;

public class Exercise5_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int d;
       if (n1 > n2)
        d = n2;
        else
        d = n1;

       int i = d;
       while(i >= 1){
            if(n1 % i == 0 && n2 % i ==0){
            d = i;
            break;
            }
            i--;
       }
        
        
        System.out.printf("The GCD of %d and %d is %d\n",n1,n2,d);
    }
}