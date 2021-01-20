public class Exercise5_23{
    public static void main(String[] args){
        java.util.Scanner input =new java.util.Scanner(System.in);
        
        System.out.print("How many iterations: ");
        int n =  input.nextInt();
        System.out.println("From left to right: ");

        double leftToRight = 0;
        for(int i=1; i <= n ; i++){
            leftToRight += (1.0 / i);
        }
        System.out.println("\t" + leftToRight);

        double rightToLeft = 0;
        
        System.out.println("From Right to Left: ");
        for(int i = n; i >= 1; i--){
            rightToLeft += (1.0 / i);
        }
        
        System.out.println("\t" + rightToLeft);
    }
}