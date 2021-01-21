public class Exercise12_10{
    public static void main(String[] args){
        System.out.println("Start...");
        try{
        Fraction f1 = new Fraction(1,0);
        System.out.println(f1.toString());
        }catch(NullDenominatorException ex){
            System.out.println(ex);
        }finally{
        System.out.println();
        }
        try{
            
            Fraction f2 = new Fraction(2,1);
            System.out.println(f2.toString());
            }catch(NullDenominatorException ex){
                System.out.println(ex);
            }finally{
            System.out.println();
            }
            System.out.println("End...");
    }
}