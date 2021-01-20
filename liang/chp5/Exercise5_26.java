public class Exercise5_26{
    public static void main(String[] args){
        java.util.Scanner input =new java.util.Scanner(System.in);
        
        System.out.println("The value of e is " + eFunction(10000));
        System.out.println("The value of e is " + eFunction(20000));
        System.out.println("The value of e is " + eFunction(100000));
        
    }
    public static double eFunction(int n){ 
        double e = 1;
        double den =0;
        for(int i =1; i <= n; i++){
            den = i;
            for(int j = i; j>1; j --){
                den *= (j-1);
            }
            e += 1.0 / den; 
        }
        return e;
        
    }
}