public class Exercise6_1{
    public static void main(String[] args){
    
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("How many penatgonal numbers do u want to display: ");
    int total = input.nextInt();

    System.out.println();

    for(int i = 1; i < total; i++){
        
        if(i % 10 == 0)
        System.out.println();
        
        System.out.printf("%d ", getPentagonalNumber(i));
    }

    System.out.println();
}

 public static int getPentagonalNumber(int n){
    n = n * (3 * n - 1) / 2;
    return n;
 }
}