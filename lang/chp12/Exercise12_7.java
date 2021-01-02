public class Exercise12_7{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c= 0;
        try{
            System.out.println("The answer is " + fraction(a,b));
            System.out.println("The answer is " + fraction(a,c));

        }catch(NullDenominatorException ex){
            System.out.println(ex);
            System.out.println("Im sorry captain ive given all shes got");
            System.out.println();
        }
        
    }
    public static double fraction(int a, int b)
        throws NullDenominatorException{
        if(b == 0)
            throw new NullDenominatorException("IT WAS B!!!");
        else
            return a / b;

    }
}